package com.example.weatherapp

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.example.weatherapp.databinding.FragmentForecastBinding
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.ZoneOffset
import java.time.format.DateTimeFormatter
import android.util.Log

// Test Data
private val tempForecastData = listOf(
    Forecast("72"),
    Forecast( "75"),
    Forecast( "80"),
    Forecast("82"),
    Forecast("70"),
    Forecast("70"),
    Forecast("72"),
    Forecast( "75"),
    Forecast( "80"),
    Forecast("82"),
    Forecast("70"),
    Forecast("70"),
    Forecast("72"),
    Forecast( "75"),
    Forecast("100"),
    Forecast("99")


)


// Listed Data for Recyclerview, need to implement temp low/high data class
private val dayForcastData = listOf(
    DayForecast(1120, 700, 2000, 80F, 1023F, 50),
    DayForecast(1212, 705, 2005, 85F, 1000F, 0),
    DayForecast(1122, 710, 2010, 90F, 1001F, 50),
    DayForecast(2122, 715, 2015, 80F, 1021F, 53),
    DayForecast(3122, 720, 2020, 70F, 1028F, 66),
    DayForecast(4122, 725, 2025, 75F, 1029F, 72),
    DayForecast(5122, 730, 2030, 80F, 1110F, 6),
    DayForecast(6122, 735, 2035, 82F, 1022F, 8),
    DayForecast(7122, 740, 2040, 81F, 1023F, 25),
    DayForecast(8122, 745, 2045, 89F, 1024F, 15),
    DayForecast(9122, 750, 2050, 70F, 1025F, 20),
    DayForecast(10122, 755, 2055, 72F, 1026F, 33),
    DayForecast(11122, 800, 2100, 73F, 1027F, 75),
    DayForecast(12122, 805, 2105, 60F, 1028F, 64),
    DayForecast(1123, 810, 2110, 65F, 1029F, 66),
    DayForecast(2123, 815, 2115, 72F, 1001F, 17)

)

class ForecastFragment : Fragment(R.layout.fragment_forecast) {

    private lateinit var binding: FragmentForecastBinding
    private val args: ForecastFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentForecastBinding.bind(view)
        binding.forecastList.adapter = ForecastAdapter(dayForcastData)

    }
}