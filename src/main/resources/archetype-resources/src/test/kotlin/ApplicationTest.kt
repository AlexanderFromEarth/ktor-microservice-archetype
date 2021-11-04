package ${package}

import io.ktor.network.selector.*
import io.ktor.network.sockets.*
import io.ktor.utils.io.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import java.io.InputStream
import java.util.*
import io.ktor.network.tls.*
import io.ktor.utils.io.core.*
import io.ktor.routing.*
import io.ktor.http.*
import io.ktor.http.cio.websocket.*
import io.ktor.websocket.*
import java.time.*
import io.ktor.gson.*
import io.ktor.features.*
import io.ktor.auth.*
import io.ktor.util.*
import io.ktor.application.*
import io.ktor.response.*
import io.ktor.request.*
import kotlin.test.*
import io.ktor.server.testing.*
import ${package}.plugins.*

class ApplicationTest {
  @Test
  fun testRoot() {
    withTestApplication({ configureRouting() }) {
      handleRequest(HttpMethod.Get, "/").apply {
        assertEquals(HttpStatusCode.OK, response.status())
        assertEquals("Hello World!", response.content)
      }
    }
  }
}