package com.utair.data.global.network.responses

class WeatherForecastResponse(
        val cityName: String,
        val hourlyForecasts: List<HourlyForecast>
) {

    class HourlyForecast(
            val timestamp: Long,
            val weatherId: Int,
            val temperature: Float,
            val speed: Float
    )

}