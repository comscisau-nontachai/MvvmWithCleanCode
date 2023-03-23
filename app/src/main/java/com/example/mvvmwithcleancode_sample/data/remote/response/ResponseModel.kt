package com.example.mvvmwithcleancode_sample.data.remote.response

import kotlinx.serialization.SerialName

@kotlinx.serialization.Serializable
data class ResponseModel internal constructor(
    @SerialName("title") var title : String = "",
    @SerialName("description") var description : String = "",
    @SerialName("image") var image : String = "",
)
