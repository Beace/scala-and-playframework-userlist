
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object createForm_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class createForm extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Form[CreateItem],Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(form: Form[CreateItem])(implicit messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.55*/("""
"""),_display_(/*2.2*/layout("Add a item")/*2.22*/ {_display_(Seq[Any](format.raw/*2.24*/("""
    """),_display_(/*3.6*/helper/*3.12*/.form(routes.ItemsController.create())/*3.50*/ {_display_(Seq[Any](format.raw/*3.52*/("""
        """),_display_(/*4.10*/helper/*4.16*/.inputText(form("name"))),format.raw/*4.40*/("""
        """),_display_(/*5.10*/helper/*5.16*/.inputText(form("price"))),format.raw/*5.41*/("""
        """),format.raw/*6.9*/("""<button>save</button>
    """)))}),format.raw/*7.6*/("""
""")))}))
      }
    }
  }

  def render(form:Form[CreateItem],messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(form)(messages)

  def f:((Form[CreateItem]) => (Messages) => play.twirl.api.HtmlFormat.Appendable) = (form) => (messages) => apply(form)(messages)

  def ref: this.type = this

}


}

/**/
object createForm extends createForm_Scope0.createForm
              /*
                  -- GENERATED --
                  DATE: Tue Oct 11 15:36:54 CST 2016
                  SOURCE: /Users/beace/Documents/playframework/my-first-app/app/views/createForm.scala.html
                  HASH: cde342a5c99369f3cb3615f3be333d311fbef2fb
                  MATRIX: 556->1|704->54|731->56|759->76|798->78|829->84|843->90|889->128|928->130|964->140|978->146|1022->170|1058->180|1072->186|1117->211|1152->220|1208->247
                  LINES: 20->1|25->1|26->2|26->2|26->2|27->3|27->3|27->3|27->3|28->4|28->4|28->4|29->5|29->5|29->5|30->6|31->7
                  -- GENERATED --
              */
          