package com.zachtib.delightful.dd2vtt

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Resolution(
    @SerialName("map_origin")
    val mapOrigin: MapOrigin,
    @SerialName("map_size")
    val mapSize: MapSize,
    @SerialName("pixels_per_grid")
    val pixelsPerGrid: Int,
)