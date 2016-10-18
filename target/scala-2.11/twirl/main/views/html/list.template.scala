
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object list_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class list extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Seq[models.Item],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(items:Seq[models.Item]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.26*/("""
"""),_display_(/*2.2*/layout("Item list")/*2.21*/{_display_(Seq[Any](format.raw/*2.22*/("""
    """),format.raw/*3.5*/("""<ul>
        """),_display_(/*4.10*/for(item <- items) yield /*4.28*/{_display_(Seq[Any](format.raw/*4.29*/("""
            """),format.raw/*5.13*/("""<li>
                <a href=""""),_display_(/*6.27*/controllers/*6.38*/.routes.ItemsController.details(item.id)),format.raw/*6.78*/("""">"""),_display_(/*6.81*/item/*6.85*/.name),format.raw/*6.90*/("""</a>
                """),_display_(/*7.18*/item/*7.22*/.price/*7.28*/ match/*7.34*/ {/*8.21*/case 0 =>/*8.30*/ {_display_(Seq[Any](format.raw/*8.32*/("""Free""")))}/*9.21*/case p =>/*9.30*/ {_display_(Seq[Any](format.raw/*9.32*/("""$&nbsp;"""),_display_(/*9.40*/p)))}}),format.raw/*10.18*/("""
                """),_display_(/*11.18*/defining(routes.ItemsController.delete(item.id))/*11.66*/ { route =>_display_(Seq[Any](format.raw/*11.77*/("""
                    """),format.raw/*12.21*/("""<button class="delete-item" data-url=""""),_display_(/*12.60*/route/*12.65*/.url),format.raw/*12.69*/("""" data-method=""""),_display_(/*12.85*/route/*12.90*/.method),format.raw/*12.97*/("""">Delete</button>
                """)))}),format.raw/*13.18*/("""
            """),format.raw/*14.13*/("""</li>
        """)))}),format.raw/*15.10*/("""
    """),format.raw/*16.5*/("""</ul>
""")))}))
      }
    }
  }

  def render(items:Seq[models.Item]): play.twirl.api.HtmlFormat.Appendable = apply(items)

  def f:((Seq[models.Item]) => play.twirl.api.HtmlFormat.Appendable) = (items) => apply(items)

  def ref: this.type = this

}


}

/**/
object list extends list_Scope0.list
              /*
                  -- GENERATED --
                  DATE: Tue Oct 11 18:27:50 CST 2016
                  SOURCE: /Users/beace/Documents/playframework/my-first-app/app/views/list.scala.html
                  HASH: a0a84b527ce4bac05cb6c31b29e2caf9441cf749
                  MATRIX: 535->1|654->25|681->27|708->46|746->47|777->52|817->66|850->84|888->85|928->98|985->129|1004->140|1064->180|1093->183|1105->187|1130->192|1178->214|1190->218|1204->224|1218->230|1228->253|1245->262|1284->264|1307->290|1324->299|1363->301|1397->309|1424->329|1469->347|1526->395|1575->406|1624->427|1690->466|1704->471|1729->475|1772->491|1786->496|1814->503|1880->538|1921->551|1967->566|1999->571
                  LINES: 20->1|25->1|26->2|26->2|26->2|27->3|28->4|28->4|28->4|29->5|30->6|30->6|30->6|30->6|30->6|30->6|31->7|31->7|31->7|31->7|31->8|31->8|31->8|31->9|31->9|31->9|31->9|31->10|32->11|32->11|32->11|33->12|33->12|33->12|33->12|33->12|33->12|33->12|34->13|35->14|36->15|37->16
                  -- GENERATED --
              */
          