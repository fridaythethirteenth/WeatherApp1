package com.example.weatherapp.di

import dagger.Provides
import retrofit2.Retrofit
import retrofit2.Retrofit.Builder

class AppModule {

    @Provides
    fun providesRetrofit(): Retrofit {
        return Builder()
            .baseUrl("https://api.openweathermap.org/")
            .build()
    }
}