
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object layout_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class layout extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.32*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <link rel="stylesheet" href=""""),_display_(/*6.39*/routes/*6.45*/.Assets.versioned("stylesheets/bootstrap.min.css")),format.raw/*6.95*/("""">
        <link rel="stylesheet" href=""""),_display_(/*7.39*/routes/*7.45*/.Assets.versioned("stylesheets/main.css")),format.raw/*7.86*/("""">
        <title>"""),_display_(/*8.17*/title),format.raw/*8.22*/("""</title>
    </head>
    <body>
        <div class="container">
            <h1 class="h1 h1-margin">"""),_display_(/*12.39*/title),format.raw/*12.44*/("""</h1>
            <hr/>
            """),_display_(/*14.14*/content),format.raw/*14.21*/("""
        """),format.raw/*15.9*/("""</div>
    </body>
</html>"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


}

/**/
object layout extends layout_Scope0.layout
              /*
                  -- GENERATED --
                  DATE: Mon Dec 19 19:37:42 CST 2016
                  SOURCE: /Users/beace/Documents/playframework/github/my/scala-and-playframework-userlist/app/views/layout.scala.html
                  HASH: fe6ee6a0d249cbe73c2f83c9016359cfee52139a
                  MATRIX: 534->1|659->31|686->32|825->145|839->151|909->201|976->242|990->248|1051->289|1096->308|1121->313|1250->415|1276->420|1340->457|1368->464|1404->473
                  LINES: 20->1|25->1|26->2|30->6|30->6|30->6|31->7|31->7|31->7|32->8|32->8|36->12|36->12|38->14|38->14|39->15
                  -- GENERATED --
              */
          