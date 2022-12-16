package com.example.model

import kotlinx.serialization.Serializable

@Serializable
data class Movie(
    val id: Int,
    val title: String,
    val image: String,
    val openingDate: String,
    val genre: List<String>,
    val platform: List<String>,
    val actors: List<Actor> = emptyList(),
    val reviews: List<Review> = emptyList()
)
