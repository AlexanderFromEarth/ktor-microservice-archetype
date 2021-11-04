package ${package}

import io.ktor.application.*
import ${package}.plugins.*

fun main(args: Array<String>): Unit = io.ktor.server.netty.EngineMain.main(args)

fun Application.module() {
  configureSockets()
  configureRouting()
  configureSerialization()
  configureHTTP()
  configureSecurity()
}
