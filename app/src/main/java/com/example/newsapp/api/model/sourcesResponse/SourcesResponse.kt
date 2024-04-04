package com.example.newsapp.api.model.sourcesResponse


import com.google.gson.annotations.SerializedName

data class SourcesResponse(
    @SerializedName("sources")
    val sources: List<Source?>?,

    @SerializedName("status")
    val status: String?,

    @SerializedName("sources")
    val code: List<Source?>?,

    @SerializedName("status")
    val message: String?

)