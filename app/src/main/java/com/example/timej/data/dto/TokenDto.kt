package com.example.timej.data.dto

import com.google.gson.annotations.SerializedName

data class TokenDto(
    @SerializedName("accessToken")
    val accessToken: String,

    @SerializedName("refreshToken")
    val refreshToken: String
)