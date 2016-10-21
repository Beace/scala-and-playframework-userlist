
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object users_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class users extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Seq[Userinfo],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(messages: String, users: Seq[Userinfo]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.42*/("""
"""),_display_(/*2.2*/layout("Users List")/*2.22*/ {_display_(Seq[Any](format.raw/*2.24*/("""

    """),format.raw/*4.5*/("""<div>
        <form action=""""),_display_(/*5.24*/routes/*5.30*/.Application.search()),format.raw/*5.51*/("""" method="POST">
            <input type="search" class="form-control pull-left search padding" name="username" placeholder="查询">
        </form>
        <a href=""""),_display_(/*8.19*/routes/*8.25*/.UserController.add()),format.raw/*8.46*/("""" class="btn btn-primary pull-left padding">添加</a>
        <a href=""""),_display_(/*9.19*/routes/*9.25*/.Application.export()),format.raw/*9.46*/("""" class="btn btn-success pull-left padding">导出</a>
    </div>
    <table id="table" class="table table-bordered table-hover table-striped container">
        <tr class="info">
            <th>#</th>
            <th>用户名</th>
            <th>描述</th>
            <th>密码</th>
            <th>操作</th>
        </tr>

        """),_display_(/*20.10*/for(user <- users) yield /*20.28*/ {_display_(Seq[Any](format.raw/*20.30*/("""
            """),format.raw/*21.13*/("""<tr>
                <td>"""),_display_(/*22.22*/user/*22.26*/.id),format.raw/*22.29*/("""</td>
                <td>"""),_display_(/*23.22*/user/*23.26*/.username),format.raw/*23.35*/("""</td>
                <td>"""),_display_(/*24.22*/user/*24.26*/.description),format.raw/*24.38*/("""</td>
                <td>"""),_display_(/*25.22*/user/*25.26*/.password),format.raw/*25.35*/("""</td>
                <td><a href=""""),_display_(/*26.31*/routes/*26.37*/.UserController.detail(user.id)),format.raw/*26.68*/("""">详情</a>
                    <span style="margin: 0 10px;">|</span>
                    <a href=""""),_display_(/*28.31*/routes/*28.37*/.UserController.edit(user.id)),format.raw/*28.66*/("""">修改</a>
                    <span style="margin: 0 10px;">|</span>
                    <a href=""""),_display_(/*30.31*/routes/*30.37*/.UserController.delete(user.id)),format.raw/*30.68*/("""">删除</a></td>
            </tr>
        """)))}),format.raw/*32.10*/("""

    """),format.raw/*34.5*/("""</table>

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
object users extends users_Scope0.users
              /*
                  -- GENERATED --
                  DATE: Wed Oct 19 14:09:19 CST 2016
                  SOURCE: /Users/beace/Documents/playframework/my-first-app/app/views/users.scala.html
                  HASH: 38d12016a1e6a93a376955a9f3567426c2538ec8
                  MATRIX: 541->1|676->41|703->43|731->63|770->65|802->71|857->100|871->106|912->127|1102->291|1116->297|1157->318|1252->387|1266->393|1307->414|1654->734|1688->752|1728->754|1769->767|1822->793|1835->797|1859->800|1913->827|1926->831|1956->840|2010->867|2023->871|2056->883|2110->910|2123->914|2153->923|2216->959|2231->965|2283->996|2408->1094|2423->1100|2473->1129|2598->1227|2613->1233|2665->1264|2737->1305|2770->1311|2811->1322
                  LINES: 20->1|25->1|26->2|26->2|26->2|28->4|29->5|29->5|29->5|32->8|32->8|32->8|33->9|33->9|33->9|44->20|44->20|44->20|45->21|46->22|46->22|46->22|47->23|47->23|47->23|48->24|48->24|48->24|49->25|49->25|49->25|50->26|50->26|50->26|52->28|52->28|52->28|54->30|54->30|54->30|56->32|58->34|60->36
                  -- GENERATED --
              */
          