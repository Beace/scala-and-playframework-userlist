
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object search_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class search extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Seq[Userinfo],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(messages: String, users: Seq[Userinfo]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.42*/("""
"""),_display_(/*2.2*/layout("Users Query")/*2.23*/ {_display_(Seq[Any](format.raw/*2.25*/("""

  """),format.raw/*4.3*/("""<div>
    <form action=""""),_display_(/*5.20*/routes/*5.26*/.Application.search()),format.raw/*5.47*/("""" method="POST">
      <input type="search" class="form-control pull-left search padding" name="username" placeholder="查询">
    </form>
    <a href=""""),_display_(/*8.15*/routes/*8.21*/.UserController.add()),format.raw/*8.42*/("""" class="btn btn-primary pull-left padding">添加</a>
    <a href=""""),_display_(/*9.15*/routes/*9.21*/.UserController.list()),format.raw/*9.43*/("""" class="btn btn-info pull-left padding">Back</a>
  </div>
  <table id="table" class="table table-bordered table-hover table-striped container">
    <tr class="info">
      <th>#</th>
      <th>用户名</th>
      <th>描述</th>
      <th>密码</th>
      <th>操作</th>
    </tr>

    """),_display_(/*20.6*/for(user <- users) yield /*20.24*/ {_display_(Seq[Any](format.raw/*20.26*/("""
      """),format.raw/*21.7*/("""<tr>
        <td>"""),_display_(/*22.14*/user/*22.18*/.id),format.raw/*22.21*/("""</td>
        <td>"""),_display_(/*23.14*/user/*23.18*/.username),format.raw/*23.27*/("""</td>
        <td>"""),_display_(/*24.14*/user/*24.18*/.description),format.raw/*24.30*/("""</td>
        <td>"""),_display_(/*25.14*/user/*25.18*/.password),format.raw/*25.27*/("""</td>
        <td><a href=""""),_display_(/*26.23*/routes/*26.29*/.UserController.detail(user.id)),format.raw/*26.60*/("""">详情</a>
          <span style="margin: 0 10px;">|</span>
          <a href=""""),_display_(/*28.21*/routes/*28.27*/.UserController.edit(user.id)),format.raw/*28.56*/("""">修改</a>
          <span style="margin: 0 10px;">|</span>
          <a href=""""),_display_(/*30.21*/routes/*30.27*/.UserController.delete(user.id)),format.raw/*30.58*/("""">删除</a></td>
      </tr>
    """)))}),format.raw/*32.6*/("""

  """),format.raw/*34.3*/("""</table>

""")))}),format.raw/*36.2*/("""
"""))
      }
    }
  }

  def render(messages:String,users:Seq[Userinfo]): play.twirl.api.HtmlFormat.Appendable = apply(messages,users)

  def f:((String,Seq[Userinfo]) => play.twirl.api.HtmlFormat.Appendable) = (messages,users) => apply(messages,users)

  def ref: this.type = this

}


}

/**/
object search extends search_Scope0.search
              /*
                  -- GENERATED --
                  DATE: Tue Oct 18 12:32:00 CST 2016
                  SOURCE: /Users/beace/Documents/playframework/my-first-app/app/views/search.scala.html
                  HASH: b65d208ef6c3dc322b74ddb779f81f79200f517d
                  MATRIX: 543->1|678->41|705->43|734->64|773->66|803->70|854->95|868->101|909->122|1085->272|1099->278|1140->299|1231->364|1245->370|1287->392|1586->665|1620->683|1660->685|1694->692|1739->710|1752->714|1776->717|1822->736|1835->740|1865->749|1911->768|1924->772|1957->784|2003->803|2016->807|2046->816|2101->844|2116->850|2168->881|2273->959|2288->965|2338->994|2443->1072|2458->1078|2510->1109|2571->1140|2602->1144|2643->1155
                  LINES: 20->1|25->1|26->2|26->2|26->2|28->4|29->5|29->5|29->5|32->8|32->8|32->8|33->9|33->9|33->9|44->20|44->20|44->20|45->21|46->22|46->22|46->22|47->23|47->23|47->23|48->24|48->24|48->24|49->25|49->25|49->25|50->26|50->26|50->26|52->28|52->28|52->28|54->30|54->30|54->30|56->32|58->34|60->36
                  -- GENERATED --
              */
          