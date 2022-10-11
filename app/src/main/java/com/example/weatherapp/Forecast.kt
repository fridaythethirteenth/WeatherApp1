package com.example.weatherapp

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Forecast(
    val temp: String,
) : Parcelable

@Parcelize
data class DayForecast(
    val date: Long,
    val sunrise: Long,
    val sunset: Long,
    val temp: Float,
    val pressure: Float,
    val humidity: Int
) : Parcelable

@Parcelize
data class ForecastTemp(
    val min: Float,
    val max: Float
) : Parcelable