package com.example.weatherappyt.repository

import com.example.weatherappyt.api.ApiService
import javax.inject.Inject

class WeatherRepository
    @Inject
    constructor(private val apiService: ApiService) {

        suspend fun getWeather() = apiService.getWeather()
    }
