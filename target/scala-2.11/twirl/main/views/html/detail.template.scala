
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object detail_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class detail extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[models.Item,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(item: models.Item):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.21*/("""
"""),_display_(/*2.2*/layout("Item detail")/*2.23*/ {_display_(Seq[Any](format.raw/*2.25*/("""
    """),format.raw/*3.5*/("""<p><strong>商品名称:</strong>"""),_display_(/*3.31*/item/*3.35*/.name),format.raw/*3.40*/("""</p>
    <p><strong>商品价格:</strong>"""),_display_(/*4.31*/item/*4.35*/.price),format.raw/*4.41*/("""</p>
""")))}))
      }
    }
  }

  def render(item:models.Item): play.twirl.api.HtmlFormat.Appendable = apply(item)

  def f:((models.Item) => play.twirl.api.HtmlFormat.Appendable) = (item) => apply(item)

  def ref: this.type = this

}


}

/**/
object detail extends detail_Scope0.detail
              /*
                  -- GENERATED --
                  DATE: Tue Oct 11 15:55:49 CST 2016
                  SOURCE: /Users/beace/Documents/playframework/my-first-app/app/views/detail.scala.html
                  HASH: 0d85064bad089476823cf26b7b8ab43d95e2fe45
                  MATRIX: 534->1|648->20|675->22|704->43|743->45|774->50|826->76|838->80|863->85|924->120|936->124|962->130
                  LINES: 20->1|25->1|26->2|26->2|26->2|27->3|27->3|27->3|27->3|28->4|28->4|28->4
                  -- GENERATED --
              */
          