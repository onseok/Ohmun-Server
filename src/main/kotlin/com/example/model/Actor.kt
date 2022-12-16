package com.example.model

import kotlinx.serialization.Serializable

@Serializable
data class Actor(
    val id: Int,
    val name: String,
    val image: String,
    val age: Int,
    val birthDate: String
)
