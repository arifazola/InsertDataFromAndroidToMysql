package com.example.connecttomysql

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class GetUserResponse {

    @SerializedName("error")
    @Expose
    var error : String? = null

    @SerializedName("message")
    @Expose
    var message : String? = null

    @SerializedName("result")
    @Expose
    var result : List<ListName>? = null

}

data class ListName(
    @field:SerializedName("name")
    val name: String? = null
){

}