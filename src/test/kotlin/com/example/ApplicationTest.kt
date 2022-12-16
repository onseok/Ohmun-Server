package com.example

import io.ktor.http.*
import io.ktor.client.request.*
import io.ktor.client.statement.*
import kotlin.test.*
import io.ktor.server.testing.*
import com.example.plugins.*

class ApplicationTest {
    @Test
    fun `루트 엔드포인트를 테스트합니다`() = testApplication {
        application {
            configureRouting()
        }
        client.get("/").apply {
            assertEquals(HttpStatusCode.OK, status)
            assertEquals("오늘의 문화 API에 오신 것을 환영합니다!", bodyAsText())
        }
    }

    @Test
    fun `존재하지 않는 엔드 포인트에 접근하는 테스트를 합니다`() = testApplication {
        client.get("/unknown").apply {
            assertEquals(HttpStatusCode.NotFound, status)
            assertEquals("Page not Found.", bodyAsText())
        }
    }
}