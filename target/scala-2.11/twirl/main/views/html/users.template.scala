
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
        <a href="/users/add" class="btn btn-primary pull-left padding">添加</a>
    </div>
    <table id="table" class="table table-bordered table-hover table-striped container">
        <tr class="info">
            <th>#</th>
            <th>用户名</th>
            <th>描述</th>
            <th>密码</th>
            <th>操作</th>
        </tr>

        """),_display_(/*19.10*/for(user <- users) yield /*19.28*/ {_display_(Seq[Any](format.raw/*19.30*/("""
            """),format.raw/*20.13*/("""<tr>
                <td>"""),_display_(/*21.22*/user/*21.26*/.id),format.raw/*21.29*/("""</td>
                <td>"""),_display_(/*22.22*/user/*22.26*/.username),format.raw/*22.35*/("""</td>
                <td>"""),_display_(/*23.22*/user/*23.26*/.description),format.raw/*23.38*/("""</td>
                <td>"""),_display_(/*24.22*/user/*24.26*/.password),format.raw/*24.35*/("""</td>
                <td><a href=""""),_display_(/*25.31*/routes/*25.37*/.UserController.detail(user.id)),format.raw/*25.68*/("""">详情</a>
                    <span style="margin: 0 10px;">|</span>
                    <a href=""""),_display_(/*27.31*/routes/*27.37*/.UserController.edit(user.id)),format.raw/*27.66*/("""">修改</a>
                    <span style="margin: 0 10px;">|</span>
                    <a href=""""),_display_(/*29.31*/routes/*29.37*/.UserController.delete(user.id)),format.raw/*29.68*/("""">删除</a></td>
            </tr>
        """)))}),format.raw/*31.10*/("""

    """),format.raw/*33.5*/("""</table>

""")))}),format.raw/*35.2*/("""
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
                  DATE: Tue Oct 18 11:32:02 CST 2016
                  SOURCE: /Users/beace/Documents/playframework/my-first-app/app/views/users.scala.html
                  HASH: 3c844ab62f4c2b2fb5cde170ca54de307bf3022f
                  MATRIX: 541->1|676->41|703->43|731->63|770->65|802->71|857->100|871->106|912->127|1432->620|1466->638|1506->640|1547->653|1600->679|1613->683|1637->686|1691->713|1704->717|1734->726|1788->753|1801->757|1834->769|1888->796|1901->800|1931->809|1994->845|2009->851|2061->882|2186->980|2201->986|2251->1015|2376->1113|2391->1119|2443->1150|2515->1191|2548->1197|2589->1208
                  LINES: 20->1|25->1|26->2|26->2|26->2|28->4|29->5|29->5|29->5|43->19|43->19|43->19|44->20|45->21|45->21|45->21|46->22|46->22|46->22|47->23|47->23|47->23|48->24|48->24|48->24|49->25|49->25|49->25|51->27|51->27|51->27|53->29|53->29|53->29|55->31|57->33|59->35
                  -- GENERATED --
              */
          