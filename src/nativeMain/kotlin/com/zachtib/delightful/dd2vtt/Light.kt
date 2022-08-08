package com.zachtib.delightful.dd2vtt

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Light(
    @SerialName("color")
    val color: String,
    @SerialName("intensity")
    val intensity: Double,
    @SerialName("position")
    val position: Position,
    @SerialName("range")
    val range: Double,
    @SerialName("shadows")
    val shadows: Boolean,
)