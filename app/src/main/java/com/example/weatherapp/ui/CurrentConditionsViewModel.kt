package com.example.weatherapp.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.weatherapp.models.CurrentConditions
import com.example.weatherapp.services.OpenWeatherMapAPI
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.runBlocking
import javax.inject.Inject


@HiltViewModel
class CurrentConditionsViewModel @Inject constructor(private val api: OpenWeatherMapAPI): ViewModel() {
   private val  _currentConditions = MutableLiveData<CurrentConditions>()

    public val currentConditions: LiveData<CurrentConditions> = _currentConditions

    fun fetchData() = runBlocking {
        _currentConditions.value = api.getCurrentConditions("55421", "")
    }
}