
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object userForm_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class userForm extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.19*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>"""),_display_(/*6.17*/message),format.raw/*6.24*/("""</title>
        <link rel="stylesheet" href=""""),_display_(/*7.39*/routes/*7.45*/.Assets.versioned("stylesheets/bootstrap.min.css")),format.raw/*7.95*/("""">
    </head>
    <body>
        <div class="container">
            <h1>"""),_display_(/*11.18*/message),format.raw/*11.25*/("""</h1>
            <hr/>
            <form role="form" action=""""),_display_(/*13.40*/routes/*13.46*/.Application.add()),format.raw/*13.64*/("""" method="post">
                <div class="form-group">
                    <label>User name</label>
                    <input type="text" class="form-control" name="username" placeholder="username">
                </div>
                <div class="form-group">
                    <label>Description</label>
                    <input type="text" class="form-control" name="description" placeholder="description"/>
                </div>
                <div class="form-group">
                    <label>Password</label>
                    <input type="password" class="form-control" name="password" placeholder="Password">
                </div>
                <button type="submit" class="btn btn-primary">Submit</button>
                <a href="/users" class="btn btn-info" class="btn btn-primary">Return</a>
            </form>
        </div>
    </body>
</html>"""))
      }
    }
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}


}

/**/
object userForm extends userForm_Scope0.userForm
              /*
                  -- GENERATED --
                  DATE: Mon Oct 17 17:29:32 CST 2016
                  SOURCE: /Users/beace/Documents/playframework/my-first-app/app/views/userForm.scala.html
                  HASH: 3737df26c52ccaf5b6955fa238c2ee330c9560c2
                  MATRIX: 533->1|645->18|672->19|789->110|816->117|889->164|903->170|973->220|1075->295|1103->302|1193->365|1208->371|1247->389
                  LINES: 20->1|25->1|26->2|30->6|30->6|31->7|31->7|31->7|35->11|35->11|37->13|37->13|37->13
                  -- GENERATED --
              */
          