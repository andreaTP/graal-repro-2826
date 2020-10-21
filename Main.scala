import wvlet.log.Logger
import wvlet.log.LogLevel

object Main extends App {
  Logger.init
  val logger = Logger("foo")
  logger.error("bar")
}
