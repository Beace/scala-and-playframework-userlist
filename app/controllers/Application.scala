package controllers

import java.io.File
import javax.inject.Inject

import anorm._
import models.Userinfo
import play.api.Play
import play.api.data.Form
import play.api.data.Forms._
import play.api.db.Database
import play.api.libs.json.{JsValue, Json, Writes}
import play.api.mvc.{Action, Controller}

/**
  * Created by beace on 16/10/12.
  */
class Application @Inject()(db: Database) extends Controller {
  /*
  * return json
  * 返回JSON书写格式
  * */
  /*
      两种写法 1
      implicit val userWrites: Writes[Userinfo] = (
        (JsPath \ "id").write[String] and
          (JsPath \ "username").write[String] and
          (JsPath \ "password").write[String]
        )(unlift(Userinfo.unapply))

   两种写法 2
    implicit val userWrites = Writes[Userinfo] {
      case Userinfo(id: Int, username: String, description: String, password: String) =>
        Json.obj(
          "id" -> id,
          "username" -> username,
          "description" -> description,
          "password" -> password
        )
    }

    返回json
    def list = Action {
      val json = Json.toJson(Userinfo.list)
      Ok(json)
    }
  */

  /**
    * API
    *
    * @return JSON
    */
  val form = Form(
    tuple(
      "username" -> nonEmptyText,
      "description" -> nonEmptyText,
      "password" -> nonEmptyText
    )
  )

  implicit val userWrites = Writes[Userinfo] {
    case Userinfo(id: Int, username: String, description: String, password: String) =>
      Json.obj(
        "id" -> id,
        "username" -> username,
        "description" -> description,
        "password" -> password
      )
  }

  implicit val personRead = Json.reads[Userinfo]

  def list = Action { implicit request =>
    val parser: RowParser[Userinfo] = Macro.namedParser[Userinfo]
    db.withConnection { implicit c =>
        val result = SQL("SELECT * FROM test").as(parser.*)
        Ok(Json.toJson(result))
    }
  }

  def add = Action { implicit request =>
    //获取表单中用户填写 (要 POST) 的数据
    val (username, description, password) = form.bindFromRequest.get
    db.withConnection { implicit c =>
      val result = SQL"INSERT INTO test(id,username,description,password) VALUES (null,$username,$description,$password)".executeInsert()
      Ok(Json.obj(
        "code" -> 0,
        "result" -> result
      ))
      Redirect("/users")
    }
  }

  def detail(id: Int) = Action { implicit request =>
    val parser: RowParser[Userinfo] = Macro.namedParser[Userinfo]
    db.withConnection { implicit c =>
      val result = SQL(s"SELECT * FROM test WHERE id=$id").as(parser.*)
      Ok(Json.toJson(result))
    }
  }


  def search = Action { implicit request =>
    val body = request.body
    val jsonBody: Option[JsValue] = body.asJson
    val name: Option[String] = request.body.asFormUrlEncoded.flatMap(m => m.get("username").flatMap(_.headOption))
    val username = name.getOrElse(0)
    db.withConnection { implicit c =>
      val parser: RowParser[Userinfo] = Macro.namedParser[Userinfo]
      val result = SQL(s"SELECT * FROM test WHERE username LIKE '%$username%' OR description LIKE '%$username%'").as(parser.*)
      val json = Json.toJson(result)
      val jsonSeq = json.as[Seq[Userinfo]]
      Ok(views.html.search("User query",jsonSeq,username))
    }
  }


  def edit(id: Int) = Action { implicit request =>
    val (username, description, password) = form.bindFromRequest.get
    db.withConnection { implicit c =>
      val result = SQL"UPDATE test SET username=$username,description=$description,password=$password WHERE id=$id".executeUpdate()
      Ok(Json.obj(
        "result" -> result
      ))
      Redirect("/users")
    }
  }


  def delete(id: Int) = Action {
    db.withConnection { implicit c =>
      val result = SQL(s"DELETE FROM test WHERE id=$id").executeUpdate()
      Ok(Json.obj(
        "code" -> 0,
        "result" -> result
      ))
    }
    Redirect("/users")
  }

  def export = Action {
    Ok.sendFile(
      content = new java.io.File("tmp/thinkjs.pdf"),
      fileName = _ => "thinkjs.pdf",
      inline = false
    )

//    Redirect("/users")
  }

}


