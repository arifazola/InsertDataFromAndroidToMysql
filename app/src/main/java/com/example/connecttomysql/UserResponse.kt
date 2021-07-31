package com.example.connecttomysql

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class UserResponse {
    @SerializedName("error")
    @Expose
    var error: String? = null

    @SerializedName("message")
    @Expose
    var message: String? = null


}