package com.example.plugins

import com.example.routes.getAllMovies
import com.example.routes.root
import com.example.routes.searchMovies
import io.ktor.server.routing.*
import io.ktor.server.application.*
import io.ktor.server.http.content.*

fun Application.configureRouting() {
    routing {
        root()
        getAllMovies()
        searchMovies()

        static("/movies") {
            resources("movies")
        }
        static("/actors") {
            resources("actors")
        }
    }
}
