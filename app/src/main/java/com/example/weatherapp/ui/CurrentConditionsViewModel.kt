package com.example.weatherapp.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.weatherapp.services.OpenWeatherMapAPI
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.runBlocking


@HiltViewModel
class CurrentConditionsViewModel(private val api: OpenWeatherMapAPI) {
   private val  _currentConditions = MutableLiveData<CurrentConditions>()

    public val currentConditions: LiveData<CurrentConditions> = _currentConditions

    fun fetchData() = runBlocking {
        _currentConditions.value = api.getCurrentConditions("55421", "")
    }
}