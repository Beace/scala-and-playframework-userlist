
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object edit_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

     object edit_Scope1 {
import play.api.libs.json.JsValue

class edit extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Seq[Userinfo],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(messages: String,data:Seq[Userinfo]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.39*/("""
"""),_display_(/*3.2*/layout("Users Edit")/*3.22*/ {_display_(Seq[Any](format.raw/*3.24*/("""
    """),_display_(/*4.6*/for(d <- data) yield /*4.20*/{_display_(Seq[Any](format.raw/*4.21*/("""
        """),format.raw/*5.9*/("""<div class="container">
            <form action="/api/users/"""),_display_(/*6.39*/d/*6.40*/.id),format.raw/*6.43*/("""" method="post">
                <div class="form-group">
                    <label>User name</label>
                    <input type="text" class="form-control" name="username" placeholder="username" value=""""),_display_(/*9.108*/d/*9.109*/.username),format.raw/*9.118*/("""">
                </div>
                <div class="form-group">
                    <label>Description</label>
                    <input type="text" class="form-control" name="description" placeholder="description" value=""""),_display_(/*13.114*/d/*13.115*/.description),format.raw/*13.127*/(""""/>
                </div>
                <div class="form-group">
                    <label>Password</label>
                    <input type="text" class="form-control" name="password" placeholder="Password" value=""""),_display_(/*17.108*/d/*17.109*/.password),format.raw/*17.118*/("""">
                </div>
                <button type="submit" class="btn btn-primary">Submit</button>
                <a class="btn btn-info" href=""""),_display_(/*20.48*/routes/*20.54*/.UserController.list()),format.raw/*20.76*/("""">Return</a>
            </form>
        </div>
    """)))}),format.raw/*23.6*/("""
""")))}),format.raw/*24.2*/("""
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
object edit extends edit_Scope0.edit_Scope1.edit
              /*
                  -- GENERATED --
                  DATE: Mon Oct 17 14:34:34 CST 2016
                  SOURCE: /Users/beace/Documents/playframework/my-first-app/app/views/edit.scala.html
                  HASH: 0c59cb9421b5adaf9963b40990594ac89f855243
                  MATRIX: 600->36|732->73|759->75|787->95|826->97|857->103|886->117|924->118|959->127|1047->189|1056->190|1079->193|1316->403|1326->404|1356->413|1611->640|1622->641|1656->653|1903->872|1914->873|1945->882|2123->1033|2138->1039|2181->1061|2264->1114|2296->1116
                  LINES: 23->2|28->2|29->3|29->3|29->3|30->4|30->4|30->4|31->5|32->6|32->6|32->6|35->9|35->9|35->9|39->13|39->13|39->13|43->17|43->17|43->17|46->20|46->20|46->20|49->23|50->24
                  -- GENERATED --
              */
          