package controllers

import javax.inject.Inject

import com.fasterxml.jackson.databind.JsonNode
import models.Userinfo
import play.api.libs.json._
import play.api.libs.ws.{WSClient, WSRequest, WSResponse}
import play.api.mvc.{Action, Controller}
import play.api.libs.concurrent.Execution.Implicits._

import scala.concurrent.Future

/**
  * Created by beace on 16/10/12.
  */
class UserController @Inject()(ws: WSClient) extends Controller {

  def list = Action.async {
    val url = s"http://localhost:9001/api/users"
    ws.url(url).get().map {
      response =>
        val json = Json.parse(response.body)
        val jsonSeq = json.as[Seq[Userinfo]]
        Ok(views.html.users("User list", jsonSeq))
    }
  }

  def add = Action {
    Ok(views.html.userForm("User Add"))
  }

  def detail(id: Int) = Action.async {
    val url = s"http://localhost:9001/api/users/$id"
    ws.url(url).get().map {
      response =>
        val json = Json.parse(response.body)
        val jsonSeq = json.as[Seq[Userinfo]]
        Ok(views.html.details("user details",jsonSeq))
    }
  }

//  def search = Action.async {
//    val url = s"http://localhost:9001/api/users/search"
//    ws.url(url).get().map {
//      response =>
//        println(response.body)
//        val json = Json.parse(response.body)
//        val jsonSeq = json.as[Seq[Userinfo]]
//        println(jsonSeq)
//        Ok(views.html.search("user search",jsonSeq))
//    }
//  }

  implicit val userWrites = Writes[Userinfo] {
    case Userinfo(id: Int, username: String, description: String, password: String) =>
      Json.obj(
        "id" -> id,
        "username" -> username,
        "description" -> description,
        "password" -> password
      )
  }
  implicit val personReads = Json.reads[Userinfo]

  def edit(id: Int) = Action.async {
    val url = s"http://localhost:9001/api/users/$id"
    ws.url(url).get().map {
      response =>
        val json = Json.parse(response.body)
        val jsonSeq = json.as[Seq[Userinfo]]
        Ok(views.html.edit("user edit",jsonSeq))
    }
  }

  def delete(id: Int) = Action {
    val url = s"http://localhost:9001/api/users/$id"
    ws.url(url).delete()
    Ok("删除成功!")
    Redirect("/users")
  }
}
