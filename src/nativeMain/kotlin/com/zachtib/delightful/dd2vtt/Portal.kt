package com.zachtib.delightful.dd2vtt

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Portal(
    @SerialName("bounds")
    val bounds: List<Bound>,
    @SerialName("closed")
    val closed: Boolean,
    @SerialName("freestanding")
    val freestanding: Boolean,
    @SerialName("position")
    val position: Position,
    @SerialName("rotation")
    val rotation: Double,
)