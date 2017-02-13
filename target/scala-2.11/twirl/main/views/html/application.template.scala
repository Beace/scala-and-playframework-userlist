
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object application_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class application extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[Userinfo],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(users: List[Userinfo]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.25*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>user list</title>
  <link rel="stylesheet" href=""""),_display_(/*7.33*/routes/*7.39*/.Assets.versioned("stylesheets/bootstrap.css")),format.raw/*7.85*/("""">
  <link rel="stylesheet" href=""""),_display_(/*8.33*/routes/*8.39*/.Assets.versioned("stylesheets/shop.css")),format.raw/*8.80*/("""">
</head>
<body>
  <div class="container">
    <h1 class="h1 h1-margin">User List</h1>
    <hr/>
    <input type="text" class="form-control" placeholder="查询">
    <table class="table table-bordered table-hover table-striped container">
      <tr class="info">
        <th>#</th>
        <th>用户名</th>
        <th>描述</th>
        <th>密码</th>
        <th>操作</th>
      </tr>
      """),_display_(/*23.8*/for(user <- users) yield /*23.26*/ {_display_(Seq[Any](format.raw/*23.28*/("""
        """),format.raw/*24.9*/("""<tr>
          <td>"""),_display_(/*25.16*/user/*25.20*/.id),format.raw/*25.23*/("""</td>
          <td>"""),_display_(/*26.16*/user/*26.20*/.username),format.raw/*26.29*/("""</td>
          <td>"""),_display_(/*27.16*/user/*27.20*/.description),format.raw/*27.32*/("""</td>
          <td>"""),_display_(/*28.16*/user/*28.20*/.password),format.raw/*28.29*/("""</td>
          <td><a href="javascript:;">详情</a><span style="margin:0 10px;">|</span><a href="javascript:;">修改</a><span style="margin:0 10px;">|</span><a href="javascript:;">删除</a></td>
        </tr>
      """)))}),format.raw/*31.8*/("""
    """),format.raw/*32.5*/("""</table>
  </div>
  """),format.raw/*34.14*/("""

  """),format.raw/*36.3*/("""<script src=""""),_display_(/*36.17*/routes/*36.23*/.Assets.versioned("javascripts/bootstrap.min.js")),format.raw/*36.72*/(""""></script>
</body>
</html>"""))
      }
    }
  }

  def render(users:List[Userinfo]): play.twirl.api.HtmlFormat.Appendable = apply(users)

  def f:((List[Userinfo]) => play.twirl.api.HtmlFormat.Appendable) = (users) => apply(users)

  def ref: this.type = this

}


}

/**/
object application extends application_Scope0.application
              /*
                  -- GENERATED --
                  DATE: Mon Dec 19 19:37:41 CST 2016
                  SOURCE: /Users/beace/Documents/playframework/github/my/scala-and-playframework-userlist/app/views/application.scala.html
                  HASH: 313a17f06b390ebd6aa8849491a7179c3c5deadf
                  MATRIX: 547->1|665->24|692->25|842->149|856->155|922->201|983->236|997->242|1058->283|1464->663|1498->681|1538->683|1574->692|1621->712|1634->716|1658->719|1706->740|1719->744|1749->753|1797->774|1810->778|1843->790|1891->811|1904->815|1934->824|2172->1032|2204->1037|2252->1068|2283->1072|2324->1086|2339->1092|2409->1141
                  LINES: 20->1|25->1|26->2|31->7|31->7|31->7|32->8|32->8|32->8|47->23|47->23|47->23|48->24|49->25|49->25|49->25|50->26|50->26|50->26|51->27|51->27|51->27|52->28|52->28|52->28|55->31|56->32|58->34|60->36|60->36|60->36|60->36
                  -- GENERATED --
              */
          