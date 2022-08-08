package com.zachtib.delightful.dd2vtt

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class MapOrigin(
    @SerialName("x")
    val x: Int,
    @SerialName("y")
    val y: Int,
)