
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/beace/Documents/playframework/my-first-app/conf/routes
// @DATE:Tue Oct 18 11:21:12 CST 2016

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_1: controllers.HomeController,
  // @LINE:8
  CountController_0: controllers.CountController,
  // @LINE:10
  AsyncController_3: controllers.AsyncController,
  // @LINE:12
  Authentication_4: controllers.Authentication,
  // @LINE:17
  ItemsController_2: controllers.ItemsController,
  // @LINE:26
  UserController_5: controllers.UserController,
  // @LINE:36
  Application_8: controllers.Application,
  // @LINE:43
  DBController_6: controllers.DBController,
  // @LINE:46
  Assets_7: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_1: controllers.HomeController,
    // @LINE:8
    CountController_0: controllers.CountController,
    // @LINE:10
    AsyncController_3: controllers.AsyncController,
    // @LINE:12
    Authentication_4: controllers.Authentication,
    // @LINE:17
    ItemsController_2: controllers.ItemsController,
    // @LINE:26
    UserController_5: controllers.UserController,
    // @LINE:36
    Application_8: controllers.Application,
    // @LINE:43
    DBController_6: controllers.DBController,
    // @LINE:46
    Assets_7: controllers.Assets
  ) = this(errorHandler, HomeController_1, CountController_0, AsyncController_3, Authentication_4, ItemsController_2, UserController_5, Application_8, DBController_6, Assets_7, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_1, CountController_0, AsyncController_3, Authentication_4, ItemsController_2, UserController_5, Application_8, DBController_6, Assets_7, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """count""", """controllers.CountController.count"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """message""", """controllers.AsyncController.message"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.Authentication.login(returnTo:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """authenticate""", """controllers.Authentication.authenticate(returnTo:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """controllers.Authentication.logout"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """items""", """controllers.ItemsController.list"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """items""", """controllers.ItemsController.create"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """items/add""", """controllers.ItemsController.createForm"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """items/""" + "$" + """id<[^/]+>""", """controllers.ItemsController.details(id:Long)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """items/""" + "$" + """id<[^/]+>""", """controllers.ItemsController.update(id:Long)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """items/""" + "$" + """id<[^/]+>""", """controllers.ItemsController.delete(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users""", """controllers.UserController.list"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users/add""", """controllers.UserController.add"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users/detail/""" + "$" + """id<[^/]+>""", """controllers.UserController.detail(id:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users/search""", """controllers.UserController.search"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users/""" + "$" + """id<[^/]+>""", """controllers.UserController.edit(id:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users/""" + "$" + """id<[^/]+>/delete""", """controllers.UserController.delete(id:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/users""", """controllers.Application.list"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/users""", """controllers.Application.add"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/users/""" + "$" + """id<[^/]+>""", """controllers.Application.detail(id:Int)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/users/search""", """controllers.Application.search"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/users/""" + "$" + """id<[^/]+>""", """controllers.Application.edit(id:Int)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/users/""" + "$" + """id<[^/]+>""", """controllers.Application.delete(id:Int)"""),
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
    HomeController_1.index,
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

  // @LINE:8
  private[this] lazy val controllers_CountController_count1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("count")))
  )
  private[this] lazy val controllers_CountController_count1_invoker = createInvoker(
    CountController_0.count,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CountController",
      "count",
      Nil,
      "GET",
      """ An example controller showing how to use dependency injection""",
      this.prefix + """count"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_AsyncController_message2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("message")))
  )
  private[this] lazy val controllers_AsyncController_message2_invoker = createInvoker(
    AsyncController_3.message,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AsyncController",
      "message",
      Nil,
      "GET",
      """ An example controller showing how to write asynchronous code""",
      this.prefix + """message"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_Authentication_login3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_Authentication_login3_invoker = createInvoker(
    Authentication_4.login(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Authentication",
      "login",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """login"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_Authentication_authenticate4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("authenticate")))
  )
  private[this] lazy val controllers_Authentication_authenticate4_invoker = createInvoker(
    Authentication_4.authenticate(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Authentication",
      "authenticate",
      Seq(classOf[String]),
      "POST",
      """""",
      this.prefix + """authenticate"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_Authentication_logout5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_Authentication_logout5_invoker = createInvoker(
    Authentication_4.logout,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Authentication",
      "logout",
      Nil,
      "GET",
      """""",
      this.prefix + """logout"""
    )
  )

  // @LINE:17
  private[this] lazy val controllers_ItemsController_list6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("items")))
  )
  private[this] lazy val controllers_ItemsController_list6_invoker = createInvoker(
    ItemsController_2.list,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ItemsController",
      "list",
      Nil,
      "GET",
      """""",
      this.prefix + """items"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_ItemsController_create7_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("items")))
  )
  private[this] lazy val controllers_ItemsController_create7_invoker = createInvoker(
    ItemsController_2.create,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ItemsController",
      "create",
      Nil,
      "POST",
      """""",
      this.prefix + """items"""
    )
  )

  // @LINE:19
  private[this] lazy val controllers_ItemsController_createForm8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("items/add")))
  )
  private[this] lazy val controllers_ItemsController_createForm8_invoker = createInvoker(
    ItemsController_2.createForm,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ItemsController",
      "createForm",
      Nil,
      "GET",
      """""",
      this.prefix + """items/add"""
    )
  )

  // @LINE:20
  private[this] lazy val controllers_ItemsController_details9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("items/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ItemsController_details9_invoker = createInvoker(
    ItemsController_2.details(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ItemsController",
      "details",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """items/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:21
  private[this] lazy val controllers_ItemsController_update10_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("items/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ItemsController_update10_invoker = createInvoker(
    ItemsController_2.update(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ItemsController",
      "update",
      Seq(classOf[Long]),
      "PUT",
      """""",
      this.prefix + """items/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:22
  private[this] lazy val controllers_ItemsController_delete11_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("items/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ItemsController_delete11_invoker = createInvoker(
    ItemsController_2.delete(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ItemsController",
      "delete",
      Seq(classOf[Long]),
      "DELETE",
      """""",
      this.prefix + """items/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:26
  private[this] lazy val controllers_UserController_list12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users")))
  )
  private[this] lazy val controllers_UserController_list12_invoker = createInvoker(
    UserController_5.list,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "list",
      Nil,
      "GET",
      """""",
      this.prefix + """users"""
    )
  )

  // @LINE:27
  private[this] lazy val controllers_UserController_add13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/add")))
  )
  private[this] lazy val controllers_UserController_add13_invoker = createInvoker(
    UserController_5.add,
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

  // @LINE:28
  private[this] lazy val controllers_UserController_detail14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/detail/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UserController_detail14_invoker = createInvoker(
    UserController_5.detail(fakeValue[Int]),
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

  // @LINE:29
  private[this] lazy val controllers_UserController_search15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/search")))
  )
  private[this] lazy val controllers_UserController_search15_invoker = createInvoker(
    UserController_5.search,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "search",
      Nil,
      "GET",
      """""",
      this.prefix + """users/search"""
    )
  )

  // @LINE:30
  private[this] lazy val controllers_UserController_edit16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UserController_edit16_invoker = createInvoker(
    UserController_5.edit(fakeValue[Int]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "edit",
      Seq(classOf[Int]),
      "GET",
      """""",
      this.prefix + """users/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:31
  private[this] lazy val controllers_UserController_delete17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/"), DynamicPart("id", """[^/]+""",true), StaticPart("/delete")))
  )
  private[this] lazy val controllers_UserController_delete17_invoker = createInvoker(
    UserController_5.delete(fakeValue[Int]),
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

  // @LINE:36
  private[this] lazy val controllers_Application_list18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/users")))
  )
  private[this] lazy val controllers_Application_list18_invoker = createInvoker(
    Application_8.list,
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

  // @LINE:37
  private[this] lazy val controllers_Application_add19_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/users")))
  )
  private[this] lazy val controllers_Application_add19_invoker = createInvoker(
    Application_8.add,
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

  // @LINE:38
  private[this] lazy val controllers_Application_detail20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/users/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_detail20_invoker = createInvoker(
    Application_8.detail(fakeValue[Int]),
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

  // @LINE:39
  private[this] lazy val controllers_Application_search21_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/users/search")))
  )
  private[this] lazy val controllers_Application_search21_invoker = createInvoker(
    Application_8.search,
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

  // @LINE:40
  private[this] lazy val controllers_Application_edit22_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/users/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_edit22_invoker = createInvoker(
    Application_8.edit(fakeValue[Int]),
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

  // @LINE:41
  private[this] lazy val controllers_Application_delete23_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/users/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_delete23_invoker = createInvoker(
    Application_8.delete(fakeValue[Int]),
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

  // @LINE:43
  private[this] lazy val controllers_DBController_user24_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/db")))
  )
  private[this] lazy val controllers_DBController_user24_invoker = createInvoker(
    DBController_6.user,
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

  // @LINE:46
  private[this] lazy val controllers_Assets_versioned25_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned25_invoker = createInvoker(
    Assets_7.versioned(fakeValue[String], fakeValue[Asset]),
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
        controllers_HomeController_index0_invoker.call(HomeController_1.index)
      }
  
    // @LINE:8
    case controllers_CountController_count1_route(params) =>
      call { 
        controllers_CountController_count1_invoker.call(CountController_0.count)
      }
  
    // @LINE:10
    case controllers_AsyncController_message2_route(params) =>
      call { 
        controllers_AsyncController_message2_invoker.call(AsyncController_3.message)
      }
  
    // @LINE:12
    case controllers_Authentication_login3_route(params) =>
      call(params.fromQuery[String]("returnTo", None)) { (returnTo) =>
        controllers_Authentication_login3_invoker.call(Authentication_4.login(returnTo))
      }
  
    // @LINE:13
    case controllers_Authentication_authenticate4_route(params) =>
      call(params.fromQuery[String]("returnTo", None)) { (returnTo) =>
        controllers_Authentication_authenticate4_invoker.call(Authentication_4.authenticate(returnTo))
      }
  
    // @LINE:14
    case controllers_Authentication_logout5_route(params) =>
      call { 
        controllers_Authentication_logout5_invoker.call(Authentication_4.logout)
      }
  
    // @LINE:17
    case controllers_ItemsController_list6_route(params) =>
      call { 
        controllers_ItemsController_list6_invoker.call(ItemsController_2.list)
      }
  
    // @LINE:18
    case controllers_ItemsController_create7_route(params) =>
      call { 
        controllers_ItemsController_create7_invoker.call(ItemsController_2.create)
      }
  
    // @LINE:19
    case controllers_ItemsController_createForm8_route(params) =>
      call { 
        controllers_ItemsController_createForm8_invoker.call(ItemsController_2.createForm)
      }
  
    // @LINE:20
    case controllers_ItemsController_details9_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ItemsController_details9_invoker.call(ItemsController_2.details(id))
      }
  
    // @LINE:21
    case controllers_ItemsController_update10_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ItemsController_update10_invoker.call(ItemsController_2.update(id))
      }
  
    // @LINE:22
    case controllers_ItemsController_delete11_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ItemsController_delete11_invoker.call(ItemsController_2.delete(id))
      }
  
    // @LINE:26
    case controllers_UserController_list12_route(params) =>
      call { 
        controllers_UserController_list12_invoker.call(UserController_5.list)
      }
  
    // @LINE:27
    case controllers_UserController_add13_route(params) =>
      call { 
        controllers_UserController_add13_invoker.call(UserController_5.add)
      }
  
    // @LINE:28
    case controllers_UserController_detail14_route(params) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_UserController_detail14_invoker.call(UserController_5.detail(id))
      }
  
    // @LINE:29
    case controllers_UserController_search15_route(params) =>
      call { 
        controllers_UserController_search15_invoker.call(UserController_5.search)
      }
  
    // @LINE:30
    case controllers_UserController_edit16_route(params) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_UserController_edit16_invoker.call(UserController_5.edit(id))
      }
  
    // @LINE:31
    case controllers_UserController_delete17_route(params) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_UserController_delete17_invoker.call(UserController_5.delete(id))
      }
  
    // @LINE:36
    case controllers_Application_list18_route(params) =>
      call { 
        controllers_Application_list18_invoker.call(Application_8.list)
      }
  
    // @LINE:37
    case controllers_Application_add19_route(params) =>
      call { 
        controllers_Application_add19_invoker.call(Application_8.add)
      }
  
    // @LINE:38
    case controllers_Application_detail20_route(params) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_Application_detail20_invoker.call(Application_8.detail(id))
      }
  
    // @LINE:39
    case controllers_Application_search21_route(params) =>
      call { 
        controllers_Application_search21_invoker.call(Application_8.search)
      }
  
    // @LINE:40
    case controllers_Application_edit22_route(params) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_Application_edit22_invoker.call(Application_8.edit(id))
      }
  
    // @LINE:41
    case controllers_Application_delete23_route(params) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_Application_delete23_invoker.call(Application_8.delete(id))
      }
  
    // @LINE:43
    case controllers_DBController_user24_route(params) =>
      call { 
        controllers_DBController_user24_invoker.call(DBController_6.user)
      }
  
    // @LINE:46
    case controllers_Assets_versioned25_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned25_invoker.call(Assets_7.versioned(path, file))
      }
  }
}
