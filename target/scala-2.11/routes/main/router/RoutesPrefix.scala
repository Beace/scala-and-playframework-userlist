
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/beace/Documents/playframework/my-first-app/conf/routes
// @DATE:Tue Oct 18 11:21:12 CST 2016


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