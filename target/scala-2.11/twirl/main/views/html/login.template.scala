
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object login_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class login extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[Form[Authentication.Login],String,Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(form: Form[Authentication.Login], returnTo: String)(implicit messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.83*/("""
"""),_display_(/*2.2*/layout("登录")/*2.14*/{_display_(Seq[Any](format.raw/*2.15*/("""
    """),format.raw/*3.5*/("""<h1>请登录</h1>
    """),_display_(/*4.6*/helper/*4.12*/.form(routes.Authentication.authenticate(returnTo))/*4.63*/ {_display_(Seq[Any](format.raw/*4.65*/("""
        """),format.raw/*5.9*/("""<ul>
            """),_display_(/*6.14*/for(error <- form.globalErrors) yield /*6.45*/ {_display_(Seq[Any](format.raw/*6.47*/("""
                """),format.raw/*7.17*/("""<li>"""),_display_(/*7.22*/error/*7.27*/.message),format.raw/*7.35*/("""</li>
            """)))}),format.raw/*8.14*/("""
        """),format.raw/*9.9*/("""</ul>
    """)))}),format.raw/*10.6*/("""
    """),_display_(/*11.6*/helper/*11.12*/.inputText(form("username"), '_label -> "name")),format.raw/*11.59*/("""
    """),_display_(/*12.6*/helper/*12.12*/.inputText(form("password"), '_label -> "password")),format.raw/*12.63*/("""
    """),format.raw/*13.5*/("""<button>log in</button>
""")))}))
      }
    }
  }

  def render(form:Form[Authentication.Login],returnTo:String,messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(form,returnTo)(messages)

  def f:((Form[Authentication.Login],String) => (Messages) => play.twirl.api.HtmlFormat.Appendable) = (form,returnTo) => (messages) => apply(form,returnTo)(messages)

  def ref: this.type = this

}


}

/**/
object login extends login_Scope0.login
              /*
                  -- GENERATED --
                  DATE: Tue Oct 11 21:20:17 CST 2016
                  SOURCE: /Users/beace/Documents/playframework/my-first-app/app/views/login.scala.html
                  HASH: 8c935b2ca05997e49b812e3a1a68986d5a783de2
                  MATRIX: 563->1|739->82|766->84|786->96|824->97|855->102|898->120|912->126|971->177|1010->179|1045->188|1089->206|1135->237|1174->239|1218->256|1249->261|1262->266|1290->274|1339->293|1374->302|1415->313|1447->319|1462->325|1530->372|1562->378|1577->384|1649->435|1681->440
                  LINES: 20->1|25->1|26->2|26->2|26->2|27->3|28->4|28->4|28->4|28->4|29->5|30->6|30->6|30->6|31->7|31->7|31->7|31->7|32->8|33->9|34->10|35->11|35->11|35->11|36->12|36->12|36->12|37->13
                  -- GENERATED --
              */
          