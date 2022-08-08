package com.zachtib.delightful.dd2vtt

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Environment(
    @SerialName("ambient_light")
    val ambientLight: String,
    @SerialName("baked_lighting")
    val bakedLighting: Boolean,
)