package com.example.weatherapp.services

import com.example.weatherapp.models.CurrentConditions
import retrofit2.http.GET
import retrofit2.http.Query

interface OpenWeatherMapAPI {

    @GET("data/2.5/weather")
    suspend fun getCurrentConditions(
        @Query("zip") zip: String,
        @Query("appid") apiKey: String,
        @Query("units") units: String = "imperial"

    ) : CurrentConditions
}