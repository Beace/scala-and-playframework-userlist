package controllers

import javax.inject.Inject

import models.Item
import play.api.data.Form
import play.api.data.Forms.{mapping, of, text}
import play.api.data.validation.Constraints.nonEmpty
import play.api.data.format.Formats.doubleFormat
import play.api.i18n.{I18nSupport, MessagesApi}
import play.api.libs.json._
import play.api.mvc.{Action, Controller}


/**
  * Created by beace on 16/10/11.
  */

case class CreateItem(name: String, price: Double)

class ItemsController @Inject()(val messagesApi: MessagesApi) extends Controller with I18nSupport {
  implicit val writesItem = Writes[Item] {
    case Item(id, name, price) =>
      Json.obj(
        "id" -> id,
        "name" -> name,
        "price" -> price
      )
  }
  val createItemFormModel = Form(mapping(
    "name" -> text.verifying(nonEmpty),
    "price" -> of[Double].verifying("Price required", _ > 0)
  )(CreateItem.apply)(CreateItem.unapply))

  val shop = models.Shop
  val list = Action { implicit request =>
    val items = shop.list()
    render {
      case Accepts.Html() => Ok(views.html.list(items))
      case Accepts.Json() => Ok(Json.toJson(items))
    }

    Ok(Json.toJson(shop.list()))
  }

  val create = Action(parse.urlFormEncoded) { implicit request =>
    createItemFormModel.bindFromRequest().fold(
      formWidthErrors => render {
        case Accepts.Html() =>
          BadRequest(views.html.createForm(formWidthErrors))
        case Accepts.Json() =>
          BadRequest(formWidthErrors.errorsAsJson)
      },
      createItem => {
        shop.create(createItem.name, createItem.price) match {
          case Some(item) => render {
            case Accepts.Html() => Redirect(routes.ItemsController.details(item.id))
            case Accepts.Json() => Ok(Json.toJson(item))
          }
          case None => InternalServerError
        }
      }
    )
  }

  val createForm = Action {
    Ok(views.html.createForm(createItemFormModel))
  }


  def details(id: Long) = Action {
    shop.get(id) match {
      case Some(item) =>
        Ok(views.html.detail(item))
      case None => NotFound
    }
  }

  def update(id: Long) = Action {
    NotImplemented
  }

  def delete(id: Long) = Action {
    NotImplemented
  }

}


