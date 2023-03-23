package com.example.mvvmwithcleancode_sample.data.remote.request

import kotlinx.serialization.SerialName
import kotlinx.serialization.descriptors.PrimitiveKind

@kotlinx.serialization.Serializable
data class RequestModel internal constructor(
    @SerialName("title") internal var title : String,
    @SerialName("description") internal var description : String,
    @SerialName("image") internal var image : String,
)
