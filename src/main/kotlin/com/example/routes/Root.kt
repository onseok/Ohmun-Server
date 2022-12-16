package com.example.routes

import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Route.root() {
    get("/") {
        call.respond(
            status = HttpStatusCode.OK,
            message = "오늘의 문화 API에 오신 것을 환영합니다!"
        )
    }
}