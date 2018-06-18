package navigo

import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js

@JSImport("navigo", JSImport.Namespace)
@js.native
class Navigo(root: String = "", useHash: Boolean = false, hash: String = "#")
    extends js.Object {
  def on(handler: js.Function): Navigo = js.native
  def on(path: String, handler: js.Function): Navigo = js.native
  def on(param: js.Object): Navigo = js.native
  def off(handler: js.Function): Navigo = js.native
  def navigate(path: String, absolute: Boolean): Navigo = js.native
  def resolve(url: String): Boolean = js.native
  def resolve(): Navigo = js.native
  def destroy(): Unit = js.native
  def link(path: String): String = js.native
  def pause(pause: Boolean): Unit = js.native
  def resume(): Unit = js.native
  def disableIfAPINotAvailable(): Unit = js.native
  def updatePageLinks(): Unit = js.native
  def notFound(handler: js.Function): Navigo = js.native
  def lastRouteResolved(): String = js.native
  def getLinkPath(): String = js.native
  def historyAPIUpdateMethod(): String = js.native
}
