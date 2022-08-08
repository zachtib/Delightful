package com.zachtib.delightful.dd2vtt

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class DungeonDraftVTT(
    @SerialName("environment")
    val environment: Environment,
    @SerialName("format")
    val format: Double,
    @SerialName("image")
    val image: String,
    @SerialName("lights")
    val lights: List<Light>,
    @SerialName("line_of_sight")
    val lineOfSight: List<List<LineOfSight>>,
    @SerialName("portals")
    val portals: List<Portal>,
    @SerialName("resolution")
    val resolution: Resolution,
)