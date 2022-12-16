package com.example.routes

import com.example.repository.MovieRepository
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.koin.ktor.ext.inject

fun Route.searchHeroes() {
    val movieRepository: MovieRepository by inject()

    get("ohmun/movies/search") {
        val name = call.request.queryParameters["name"]

        val movieResponse = movieRepository.searchMovies(name = name)
        call.respond(
            message = movieResponse,
            status = HttpStatusCode.OK
        )
    }
}