
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/beace/Documents/playframework/github/my/scala-and-playframework-userlist/conf/routes
// @DATE:Mon Dec 19 19:37:40 CST 2016

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_0: controllers.HomeController,
  // @LINE:9
  UserController_1: controllers.UserController,
  // @LINE:19
  Application_4: controllers.Application,
  // @LINE:28
  DBController_2: controllers.DBController,
  // @LINE:31
  Assets_3: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_0: controllers.HomeController,
    // @LINE:9
    UserController_1: controllers.UserController,
    // @LINE:19
    Application_4: controllers.Application,
    // @LINE:28
    DBController_2: controllers.DBController,
    // @LINE:31
    Assets_3: controllers.Assets
  ) = this(errorHandler, HomeController_0, UserController_1, Application_4, DBController_2, Assets_3, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_0, UserController_1, Application_4, DBController_2, Assets_3, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users""", """controllers.UserController.list"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users/add""", """controllers.UserController.add"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users/detail/""" + "$" + """id<[^/]+>""", """controllers.UserController.detail(id:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users/""" + "$" + """id<[^/]+>""", """controllers.UserController.edit(id:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users/""" + "$" + """id<[^/]+>/delete""", """controllers.UserController.delete(id:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/users""", """controllers.Application.list"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/users""", """controllers.Application.add"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/users/""" + "$" + """id<[^/]+>""", """controllers.Application.detail(id:Int)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/users/search""", """controllers.Application.search"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/users/""" + "$" + """id<[^/]+>""", """controllers.Application.edit(id:Int)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/users/""" + "$" + """id<[^/]+>""", """controllers.Application.delete(id:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/export""", """controllers.Application.export"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/db""", """controllers.DBController.user"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_0.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      """ An example controller showing a sample home page""",
      this.prefix + """"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_UserController_list1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users")))
  )
  private[this] lazy val controllers_UserController_list1_invoker = createInvoker(
    UserController_1.list,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "list",
      Nil,
      "GET",
      """ customer lee""",
      this.prefix + """users"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_UserController_add2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/add")))
  )
  private[this] lazy val controllers_UserController_add2_invoker = createInvoker(
    UserController_1.add,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "add",
      Nil,
      "GET",
      """""",
      this.prefix + """users/add"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_UserController_detail3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/detail/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UserController_detail3_invoker = createInvoker(
    UserController_1.detail(fakeValue[Int]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "detail",
      Seq(classOf[Int]),
      "GET",
      """""",
      this.prefix + """users/detail/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_UserController_edit4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UserController_edit4_invoker = createInvoker(
    UserController_1.edit(fakeValue[Int]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "edit",
      Seq(classOf[Int]),
      "GET",
      """GET           /users/search            controllers.UserController.search""",
      this.prefix + """users/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_UserController_delete5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/"), DynamicPart("id", """[^/]+""",true), StaticPart("/delete")))
  )
  private[this] lazy val controllers_UserController_delete5_invoker = createInvoker(
    UserController_1.delete(fakeValue[Int]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "delete",
      Seq(classOf[Int]),
      "GET",
      """""",
      this.prefix + """users/""" + "$" + """id<[^/]+>/delete"""
    )
  )

  // @LINE:19
  private[this] lazy val controllers_Application_list6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/users")))
  )
  private[this] lazy val controllers_Application_list6_invoker = createInvoker(
    Application_4.list,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "list",
      Nil,
      "GET",
      """""",
      this.prefix + """api/users"""
    )
  )

  // @LINE:20
  private[this] lazy val controllers_Application_add7_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/users")))
  )
  private[this] lazy val controllers_Application_add7_invoker = createInvoker(
    Application_4.add,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "add",
      Nil,
      "POST",
      """""",
      this.prefix + """api/users"""
    )
  )

  // @LINE:21
  private[this] lazy val controllers_Application_detail8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/users/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_detail8_invoker = createInvoker(
    Application_4.detail(fakeValue[Int]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "detail",
      Seq(classOf[Int]),
      "GET",
      """""",
      this.prefix + """api/users/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:22
  private[this] lazy val controllers_Application_search9_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/users/search")))
  )
  private[this] lazy val controllers_Application_search9_invoker = createInvoker(
    Application_4.search,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "search",
      Nil,
      "POST",
      """""",
      this.prefix + """api/users/search"""
    )
  )

  // @LINE:23
  private[this] lazy val controllers_Application_edit10_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/users/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_edit10_invoker = createInvoker(
    Application_4.edit(fakeValue[Int]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "edit",
      Seq(classOf[Int]),
      "POST",
      """""",
      this.prefix + """api/users/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:24
  private[this] lazy val controllers_Application_delete11_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/users/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_delete11_invoker = createInvoker(
    Application_4.delete(fakeValue[Int]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "delete",
      Seq(classOf[Int]),
      "DELETE",
      """""",
      this.prefix + """api/users/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:25
  private[this] lazy val controllers_Application_export12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/export")))
  )
  private[this] lazy val controllers_Application_export12_invoker = createInvoker(
    Application_4.export,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "export",
      Nil,
      "GET",
      """""",
      this.prefix + """api/export"""
    )
  )

  // @LINE:28
  private[this] lazy val controllers_DBController_user13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/db")))
  )
  private[this] lazy val controllers_DBController_user13_invoker = createInvoker(
    DBController_2.user,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DBController",
      "user",
      Nil,
      "GET",
      """""",
      this.prefix + """api/db"""
    )
  )

  // @LINE:31
  private[this] lazy val controllers_Assets_versioned14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned14_invoker = createInvoker(
    Assets_3.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_0.index)
      }
  
    // @LINE:9
    case controllers_UserController_list1_route(params) =>
      call { 
        controllers_UserController_list1_invoker.call(UserController_1.list)
      }
  
    // @LINE:10
    case controllers_UserController_add2_route(params) =>
      call { 
        controllers_UserController_add2_invoker.call(UserController_1.add)
      }
  
    // @LINE:11
    case controllers_UserController_detail3_route(params) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_UserController_detail3_invoker.call(UserController_1.detail(id))
      }
  
    // @LINE:13
    case controllers_UserController_edit4_route(params) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_UserController_edit4_invoker.call(UserController_1.edit(id))
      }
  
    // @LINE:14
    case controllers_UserController_delete5_route(params) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_UserController_delete5_invoker.call(UserController_1.delete(id))
      }
  
    // @LINE:19
    case controllers_Application_list6_route(params) =>
      call { 
        controllers_Application_list6_invoker.call(Application_4.list)
      }
  
    // @LINE:20
    case controllers_Application_add7_route(params) =>
      call { 
        controllers_Application_add7_invoker.call(Application_4.add)
      }
  
    // @LINE:21
    case controllers_Application_detail8_route(params) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_Application_detail8_invoker.call(Application_4.detail(id))
      }
  
    // @LINE:22
    case controllers_Application_search9_route(params) =>
      call { 
        controllers_Application_search9_invoker.call(Application_4.search)
      }
  
    // @LINE:23
    case controllers_Application_edit10_route(params) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_Application_edit10_invoker.call(Application_4.edit(id))
      }
  
    // @LINE:24
    case controllers_Application_delete11_route(params) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_Application_delete11_invoker.call(Application_4.delete(id))
      }
  
    // @LINE:25
    case controllers_Application_export12_route(params) =>
      call { 
        controllers_Application_export12_invoker.call(Application_4.export)
      }
  
    // @LINE:28
    case controllers_DBController_user13_route(params) =>
      call { 
        controllers_DBController_user13_invoker.call(DBController_2.user)
      }
  
    // @LINE:31
    case controllers_Assets_versioned14_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned14_invoker.call(Assets_3.versioned(path, file))
      }
  }
}
