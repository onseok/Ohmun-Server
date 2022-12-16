package com.example.model

import kotlinx.serialization.Serializable

@Serializable
data class Review(
    val id: Int,
    val rating: Double,
    val nickname: String,
    val image: String,
    val comment: String,
    val createdAt: String
)
