
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/beace/Documents/playframework/github/my/scala-and-playframework-userlist/conf/routes
// @DATE:Mon Dec 19 19:37:40 CST 2016


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
