package com.example.mvvmwithcleancode_sample.data.remote.response

import kotlinx.serialization.SerialName

@kotlinx.serialization.Serializable
data class DummyResponse2 internal constructor(
    @SerialName("response_code") var responseCode : Int? = null,
    @SerialName("results") var results : List<Result>? = null,
) {

    @kotlinx.serialization.Serializable
    data class Result internal constructor(
        @SerialName("category") var category: String? = null,
        @SerialName("correct_answer") var correctAnswer: String? = null,
        @SerialName("difficulty") var difficulty: String? = null,
        @SerialName("incorrect_answers") var incorrectAnswers: List<String>? = null,
        @SerialName("question") var question: String? = null,
        @SerialName("type") var type: String? = null
    )
}