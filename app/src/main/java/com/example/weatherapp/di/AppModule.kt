package com.example.weatherapp.di

import android.app.Activity
import com.example.weatherapp.services.OpenWeatherMapAPI
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import retrofit2.Retrofit
import retrofit2.Retrofit.Builder

@Module
@InstallIn(ActivityComponent::class)
class AppModule {

    @Provides
    fun providesRetrofit(): Retrofit {
        return Builder()
            .baseUrl("https://api.openweathermap.org/")
            .build()
    }

    @Provides
    fun providesOpenWeatherMapApi(retrofit: Retrofit): OpenWeatherMapAPI {
        return retrofit.create(OpenWeatherMapAPI::class.java)
    }
}