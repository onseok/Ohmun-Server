package com.example

import com.example.model.MovieResponse
import io.ktor.client.request.*
import io.ktor.client.statement.*
import io.ktor.http.*
import io.ktor.server.testing.*
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json
import org.junit.Test
import kotlin.test.assertEquals

class SearchMoviesTest {

    @Test
    fun `search movies 엔드 포인트에 접근하고, movie name을 쿼리하며, 한 가지의 결과를 반환합니다`() = testApplication {
        client.get("/ohmun/movies/search?name=동백꽃").apply {
            assertEquals(HttpStatusCode.OK, status)
            val actual = Json.decodeFromString<MovieResponse>(bodyAsText())
                .movies.size
            assertEquals(1, actual)
        }
    }

    @Test
    fun `search movies 엔드 포인트에 접근하고, movie name을 쿼리하며, 여러 개의 결과를 반환합니다`() = testApplication {
        client.get("/ohmun/movies/search?name=세").apply {
            assertEquals(HttpStatusCode.OK, status)
            val actual = Json.decodeFromString<MovieResponse>(bodyAsText())
                .movies.size
            assertEquals(2, actual)
        }
    }

    @Test
    fun `search movies 엔드 포인트에 접근하고, 빈 문자열을 쿼리하며, empty list를 반환합니다`() = testApplication {
        client.get("/ohmun/movies/search?name=").apply {
            assertEquals(HttpStatusCode.OK, status)
            val actual = Json.decodeFromString<MovieResponse>(bodyAsText())
                .movies
            assertEquals(emptyList(), actual)
        }
    }

    @Test
    fun `search movies 엔드 포인트에 접근하고, 존재하지 않는 movie를 쿼리하며, empty list를 반환합니다`() = testApplication {
        client.get("/ohmun/movies/search?name=unknown").apply {
            assertEquals(HttpStatusCode.OK, status)
            val actual = Json.decodeFromString<MovieResponse>(bodyAsText())
                .movies
            assertEquals(emptyList(), actual)
        }
    }
}