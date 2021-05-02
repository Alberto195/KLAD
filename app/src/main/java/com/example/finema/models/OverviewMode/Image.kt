package com.cronocode.moviecatalog.models.OverviewMode

import com.google.gson.annotations.SerializedName

data class Image (

        @SerializedName("height") val height : Int,
        @SerializedName("id") val id : String,
        @SerializedName("url") val url : String,
        @SerializedName("width") val width : Int
)