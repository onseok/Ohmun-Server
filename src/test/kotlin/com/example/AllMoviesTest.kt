package com.example

import com.example.model.MovieResponse
import com.example.repository.MovieRepositoryImpl
import com.example.repository.MovieRepositoryImpl.Companion.NEXT_PAGE_KEY
import com.example.repository.MovieRepositoryImpl.Companion.PREVIOUS_PAGE_KEY
import io.ktor.client.call.*
import io.ktor.client.request.*
import io.ktor.client.statement.*
import io.ktor.http.*
import io.ktor.server.testing.*
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json
import org.junit.Test
import kotlin.test.assertEquals

class AllMoviesTest {

    @Test
    fun `모든 movies 엔드 포인트에 접근하고, 존재하지 않는 페이지 넘버를 쿼리합니다`() = testApplication {
        client.get("/ohmun/movies?page=6").apply {
            assertEquals(HttpStatusCode.NotFound, status)
            assertEquals("Page not Found.", bodyAsText())
        }
    }

    @Test
    fun `모든 movies 엔드 포인트에 접근하고, 유효하지 않는 페이지 넘버를 쿼리합니다`() = testApplication {
        client.get("/ohmun/movies?page=invalid").apply {
            assertEquals(HttpStatusCode.BadRequest, status)
            val expected = MovieResponse(
                success = false,
                message = "페이지는 숫자만 가능합니다."
            )
            val actual = Json.decodeFromString<MovieResponse>(bodyAsText())
            assertEquals(expected, actual)
        }
    }

    @Test
    fun `모든 movies 엔드 포인트에 접근하고, 모든 페이지를 쿼리합니다`() = testApplication {
        val movieRepository = MovieRepositoryImpl()
        val pages = 1..5
        val movies = listOf(
            movieRepository.page1,
            movieRepository.page2,
            movieRepository.page3,
            movieRepository.page4,
            movieRepository.page5
        )
        pages.forEach { page ->
            client.get("/ohmun/movies?page=$page").apply {
                println("CURRENT PAGE: $page")
                assertEquals(HttpStatusCode.OK, status)
                val expected = MovieResponse(
                    success = true,
                    message = "ok",
                    prevPage = calculatePage(page = page)["prevPage"],
                    nextPage = calculatePage(page = page)["nextPage"],
                    movies = movies[page - 1]
                )

                val actual = Json.decodeFromString<MovieResponse>(body())
                println("PREVIOUS PAGE: ${calculatePage(page = page)["prevPage"]}")
                println("NEXT PAGE: ${calculatePage(page = page)["nextPage"]}")
                println("HEROES: ${movies[page - 1]}")

                assertEquals(expected, actual)
            }
        }
    }

    private fun calculatePage(page: Int): Map<String, Int?> {
        var prevPage: Int? = page
        var nextPage: Int? = page
        if (page in 1..4) {
            nextPage = nextPage?.plus(1)
        }
        if (page in 2..5) {
            prevPage = prevPage?.minus(1)
        }
        if (page == 1) {
            prevPage = null
        }
        if (page == 5) {
            nextPage = null
        }
        return mapOf(PREVIOUS_PAGE_KEY to prevPage, NEXT_PAGE_KEY to nextPage)
    }
}