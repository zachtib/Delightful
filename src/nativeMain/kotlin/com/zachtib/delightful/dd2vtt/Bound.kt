package com.zachtib.delightful.dd2vtt

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Bound(
    @SerialName("x")
    val x: Double,
    @SerialName("y")
    val y: Double,
)