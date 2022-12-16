package com.example.repository

import com.example.model.Movie
import com.example.model.MovieResponse

interface MovieRepository {

    val movies: Map<Int, List<Movie>>

    val page1: List<Movie>
    val page2: List<Movie>
    val page3: List<Movie>
    val page4: List<Movie>
    val page5: List<Movie>

    suspend fun getAllMovies(page: Int = 1): MovieResponse

    suspend fun searchMovies(name: String?): MovieResponse
}