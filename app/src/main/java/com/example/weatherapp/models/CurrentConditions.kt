package com.example.weatherapp.models

import com.squareup.moshi.Json




data class CurrentConditions(
    @Json(name = "weather") val weatherData: List<WeatherData>

)
