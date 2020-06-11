package ru.petrovich

import io.micronaut.context.ApplicationContext
import io.micronaut.http.client.HttpClient
import io.micronaut.runtime.server.EmbeddedServer
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe
import kotlin.test.assertEquals

object DemoControllerSpec : Spek({
    describe("DemoController suite") {
        var embeddedServer: EmbeddedServer = ApplicationContext.run(EmbeddedServer::class.java)
        var client: HttpClient = HttpClient.create(embeddedServer.url)

        it("test /demo responds Demo Hi!") {
            var rsp: String = client.toBlocking().retrieve("/demo")
            assertEquals("Demo Hi!", rsp)
        }

        afterGroup {
            client.close()
            embeddedServer.close()
        }
    }
})