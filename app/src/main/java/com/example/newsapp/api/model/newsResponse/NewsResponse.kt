package com.example.newsapp.api.model.newsResponse


import com.google.gson.annotations.SerializedName

data class NewsResponse(
    @SerializedName("articles")
    val articles: List<Article?>?,

    @SerializedName("status")
    val status: String?,

    @SerializedName("totalResults")
    val totalResults: Int?,

    @SerializedName("code")
    val code: Int?,

    @SerializedName("message")
    val message: Int?

)