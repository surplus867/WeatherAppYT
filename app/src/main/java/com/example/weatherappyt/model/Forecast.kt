package com.example.weatherappyt.model


import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class Forecast(
    @SerializedName("day")
    val day: String? = null,
    @SerializedName("temperature")
    val temperature: String? = null,
    @SerializedName("wind")
    val wind: String? = null,
): Parcelable