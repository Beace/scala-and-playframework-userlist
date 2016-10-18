
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object details_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

     object details_Scope1 {
import play.api.libs.json.JsValue

class details extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Seq[Userinfo],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(messages: String,data:Seq[Userinfo]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.39*/("""
"""),_display_(/*3.2*/layout("Users Details")/*3.25*/ {_display_(Seq[Any](format.raw/*3.27*/("""
  """),_display_(/*4.4*/for(d <- data) yield /*4.18*/{_display_(Seq[Any](format.raw/*4.19*/("""
    """),format.raw/*5.5*/("""<div class="container">
        <div class="panel panel-default">
            <div class="panel-heading">
                <h4>"""),_display_(/*8.22*/d/*8.23*/.username),format.raw/*8.32*/(""" """),format.raw/*8.33*/("""的信息</h4>
            </div>
            <div class="panel-body">
                 <dl class="dl-horizontal">
                     <dt>User name</dt>
                     <dd>"""),_display_(/*13.27*/d/*13.28*/.username),format.raw/*13.37*/("""</dd>
                     <dt>Description</dt>
                     <dd>"""),_display_(/*15.27*/d/*15.28*/.description),format.raw/*15.40*/("""</dd>
                     <dt>Password</dt>
                     <dd>"""),_display_(/*17.27*/d/*17.28*/.password),format.raw/*17.37*/("""</dd>
                 </dl>
            </div>
            <div class="panel-footer">
                暂无
            </div>
        </div>
        <a class="btn btn-info" href=""""),_display_(/*24.40*/routes/*24.46*/.UserController.list()),format.raw/*24.68*/("""">Return</a>
    </div>
  """)))}),format.raw/*26.4*/("""
""")))}),format.raw/*27.2*/("""
"""))
      }
    }
  }

  def render(messages:String,data:Seq[Userinfo]): play.twirl.api.HtmlFormat.Appendable = apply(messages,data)

  def f:((String,Seq[Userinfo]) => play.twirl.api.HtmlFormat.Appendable) = (messages,data) => apply(messages,data)

  def ref: this.type = this

}


}
}

/**/
object details extends details_Scope0.details_Scope1.details
              /*
                  -- GENERATED --
                  DATE: Mon Oct 17 14:59:21 CST 2016
                  SOURCE: /Users/beace/Documents/playframework/my-first-app/app/views/details.scala.html
                  HASH: 88aa539280598783d874ddcedfc1e2c4f5bc9aaf
                  MATRIX: 609->36|741->73|768->75|799->98|838->100|867->104|896->118|934->119|965->124|1118->251|1127->252|1156->261|1184->262|1386->437|1396->438|1426->447|1527->521|1537->522|1570->534|1668->605|1678->606|1708->615|1914->794|1929->800|1972->822|2029->849|2061->851
                  LINES: 23->2|28->2|29->3|29->3|29->3|30->4|30->4|30->4|31->5|34->8|34->8|34->8|34->8|39->13|39->13|39->13|41->15|41->15|41->15|43->17|43->17|43->17|50->24|50->24|50->24|52->26|53->27
                  -- GENERATED --
              */
          