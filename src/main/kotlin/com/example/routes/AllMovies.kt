package com.example.routes

import com.example.model.MovieResponse
import com.example.repository.MovieRepository
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.koin.ktor.ext.inject
import java.lang.IllegalArgumentException
import java.lang.NumberFormatException

fun Route.getAllMovies() {
    val movieRepository: MovieRepository by inject()

    get("/ohmun/movies") {
        try {
            val page = call.request.queryParameters["page"]?.toInt() ?: 1
            require(page in 1..5)

            val movieResponse = movieRepository.getAllMovies(page = page)
            call.respond(
                message = movieResponse,
                status = HttpStatusCode.OK
            )
        } catch (ex: NumberFormatException) {
            call.respond(
                message = MovieResponse(success = false, message = "페이지는 숫자만 가능합니다."),
                status = HttpStatusCode.BadRequest
            )
        } catch (ex: IllegalArgumentException) {
            call.respond(
                message = MovieResponse(success = false, message = "영화 및 드라마 정보를 찾을 수 없습니다."),
                status = HttpStatusCode.NotFound
            )
        }
    }
}