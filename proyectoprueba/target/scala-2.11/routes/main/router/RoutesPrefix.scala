
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/testing/Documentos/proyectoprueba/conf/routes
// @DATE:Wed Jun 21 13:59:30 COT 2017


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
