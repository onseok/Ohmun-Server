package com.example.di

import com.example.repository.MovieRepository
import com.example.repository.MovieRepositoryImpl
import org.koin.dsl.module

val koinModule = module {
    single<MovieRepository> {
        MovieRepositoryImpl()
    }
}