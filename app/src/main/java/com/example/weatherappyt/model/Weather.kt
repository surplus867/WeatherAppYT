package com.example.weatherappyt.model


import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize
import kotlinx.parcelize.RawValue

@Parcelize
data class Weather(
    @SerializedName("description")
    val description: String? = null,
    @SerializedName("forecast")
    val forecast: @RawValue List<Forecast>? = null,
    @SerializedName("temperature")
    val temperature: String? = null,
    @SerializedName("wind")
    val wind: String? = null,
): Parcelable