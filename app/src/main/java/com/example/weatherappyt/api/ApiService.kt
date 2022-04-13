package com.example.weatherappyt.api

import com.example.weatherappyt.model.Weather
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("weather/Korea")
    suspend fun getWeather(): Response<Weather>

}