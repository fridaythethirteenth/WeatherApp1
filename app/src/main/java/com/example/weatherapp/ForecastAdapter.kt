package com.example.weatherapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ForecastAdapter(private val data: List<DayForecast>) : RecyclerView.Adapter<ForecastViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ForecastViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.view_forcast_item, parent, false)
        return ForecastViewHolder(view)
    }

    override fun onBindViewHolder(holder: ForecastViewHolder, position: Int) {
        holder.bind(data[position])
    }

    override fun getItemCount(): Int =data.size
}

class ForecastViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    private val date: TextView
    private val sunrise: TextView
    private val sunset: TextView
    private val tempLow: TextView
    private val tempHigh: TextView
    private val pressure: TextView
    private val humidity: TextView

    init {
        date = view.findViewById((R.id.forecast_date))
        sunrise = view.findViewById(R.id.forecasted_sunrise_time)
        sunset = view.findViewById(R.id.forecasted_sunset_time)
        tempLow = view.findViewById(R.id.forecasted_temp_low)
        tempHigh = view.findViewById(R.id.forecasted_temp_high)
        pressure = view.findViewById(R.id.forecasted_pressure)
        humidity = view.findViewById(R.id.forecasted_humidity)
    }
    fun bind(data: DayForecast) {
        date.text = "Date" + data.date.toString()
        sunrise.text = "Sunrise: " + data.sunrise.toString()
        sunset.text = "Sunset: " + data.sunset.toString()
        tempLow.text = "Low: " + data.temp.toString()
        tempHigh.text = "High" + data.temp.toString()
        pressure.text = "Pressure: " + data.pressure.toString()
        humidity.text = "Humidity: " + data.humidity.toString()
    }
}