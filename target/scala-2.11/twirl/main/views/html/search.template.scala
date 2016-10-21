
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

     object search_Scope1 {
import scala.util.matching.Regex

class search extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,Seq[Userinfo],Any,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(messages: String, users: Seq[Userinfo],keyword:Any):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.54*/("""
"""),_display_(/*3.2*/layout("Users Query")/*3.23*/ {_display_(Seq[Any](format.raw/*3.25*/("""

  """),format.raw/*5.3*/("""<div class="clearfix">
    <form action=""""),_display_(/*6.20*/routes/*6.26*/.Application.search()),format.raw/*6.47*/("""" method="POST">
      <input type="search" class="form-control pull-left search padding" name="username" placeholder="查询">
    </form>
    <a href=""""),_display_(/*9.15*/routes/*9.21*/.UserController.add()),format.raw/*9.42*/("""" class="btn btn-primary pull-left padding">添加</a>
    <a href=""""),_display_(/*10.15*/routes/*10.21*/.UserController.list()),format.raw/*10.43*/("""" class="btn btn-info pull-left padding">Back</a>
  </div>
  <p>关键词<span class="keyword"> """),_display_(/*12.33*/keyword),format.raw/*12.40*/(""" """),format.raw/*12.41*/("""</span>的查询结果</p>
  <table id="table" class="table table-bordered table-hover table-striped container">
    <tr class="info">
      <th>#</th>
      <th>用户名</th>
      <th>描述</th>
      <th>密码</th>
      <th>操作</th>
    </tr>

    """),_display_(/*22.6*/for(user <- users) yield /*22.24*/ {_display_(Seq[Any](format.raw/*22.26*/("""
      """),format.raw/*23.7*/("""<tr>
        <td>"""),_display_(/*24.14*/user/*24.18*/.id),format.raw/*24.21*/("""</td>
        """),_display_(/*25.10*/if(user.username.indexOf(keyword) < 0)/*25.48*/ {_display_(Seq[Any](format.raw/*25.50*/("""
            """),format.raw/*26.13*/("""<td>"""),_display_(/*26.18*/Html(user.username.replaceAll(keyword.toString,"<span class='keyword'>"+keyword+"</span>"))),format.raw/*26.109*/("""</td>
        """)))}/*27.11*/else/*27.16*/{_display_(Seq[Any](format.raw/*27.17*/("""
            """),format.raw/*28.13*/("""<td>"""),_display_(/*28.18*/user/*28.22*/.username),format.raw/*28.31*/("""</td>
        """)))}),format.raw/*29.10*/("""
        """),_display_(/*30.10*/if(user.description.indexOf(keyword) < 0)/*30.51*/ {_display_(Seq[Any](format.raw/*30.53*/("""
            """),format.raw/*31.13*/("""<td>"""),_display_(/*31.18*/Html(user.description.replaceAll(keyword.toString,"<span class='keyword'>"+keyword+"</span>"))),format.raw/*31.112*/("""</td>
        """)))}/*32.11*/else/*32.16*/{_display_(Seq[Any](format.raw/*32.17*/("""
            """),format.raw/*33.13*/("""<td>"""),_display_(/*33.18*/user/*33.22*/.description),format.raw/*33.34*/("""</td>
        """)))}),format.raw/*34.10*/("""
        """),format.raw/*35.9*/("""<td>"""),_display_(/*35.14*/user/*35.18*/.password),format.raw/*35.27*/("""</td>
        <td><a href=""""),_display_(/*36.23*/routes/*36.29*/.UserController.detail(user.id)),format.raw/*36.60*/("""">详情</a>
          <span style="margin: 0 10px;">|</span>
          <a href=""""),_display_(/*38.21*/routes/*38.27*/.UserController.edit(user.id)),format.raw/*38.56*/("""">修改</a>
          <span style="margin: 0 10px;">|</span>
          <a href=""""),_display_(/*40.21*/routes/*40.27*/.UserController.delete(user.id)),format.raw/*40.58*/("""">删除</a></td>
      </tr>
    """)))}),format.raw/*42.6*/("""

  """),format.raw/*44.3*/("""</table>

""")))}),format.raw/*46.2*/("""
"""))
      }
    }
  }

  def render(messages:String,users:Seq[Userinfo],keyword:Any): play.twirl.api.HtmlFormat.Appendable = apply(messages,users,keyword)

  def f:((String,Seq[Userinfo],Any) => play.twirl.api.HtmlFormat.Appendable) = (messages,users,keyword) => apply(messages,users,keyword)

  def ref: this.type = this

}


}
}

/**/
object search extends search_Scope0.search_Scope1.search
              /*
                  -- GENERATED --
                  DATE: Fri Oct 21 17:25:25 CST 2016
                  SOURCE: /Users/beace/Documents/playframework/my-first-app/app/views/search.scala.html
                  HASH: d19531088ae658acd5b40838fa94508f77f839e2
                  MATRIX: 609->35|756->87|783->89|812->110|851->112|881->116|949->158|963->164|1004->185|1180->335|1194->341|1235->362|1327->427|1342->433|1385->455|1503->546|1531->553|1560->554|1817->785|1851->803|1891->805|1925->812|1970->830|1983->834|2007->837|2049->852|2096->890|2136->892|2177->905|2209->910|2322->1001|2356->1017|2369->1022|2408->1023|2449->1036|2481->1041|2494->1045|2524->1054|2570->1069|2607->1079|2657->1120|2697->1122|2738->1135|2770->1140|2886->1234|2920->1250|2933->1255|2972->1256|3013->1269|3045->1274|3058->1278|3091->1290|3137->1305|3173->1314|3205->1319|3218->1323|3248->1332|3303->1360|3318->1366|3370->1397|3475->1475|3490->1481|3540->1510|3645->1588|3660->1594|3712->1625|3773->1656|3804->1660|3845->1671
                  LINES: 23->2|28->2|29->3|29->3|29->3|31->5|32->6|32->6|32->6|35->9|35->9|35->9|36->10|36->10|36->10|38->12|38->12|38->12|48->22|48->22|48->22|49->23|50->24|50->24|50->24|51->25|51->25|51->25|52->26|52->26|52->26|53->27|53->27|53->27|54->28|54->28|54->28|54->28|55->29|56->30|56->30|56->30|57->31|57->31|57->31|58->32|58->32|58->32|59->33|59->33|59->33|59->33|60->34|61->35|61->35|61->35|61->35|62->36|62->36|62->36|64->38|64->38|64->38|66->40|66->40|66->40|68->42|70->44|72->46
                  -- GENERATED --
              */
          