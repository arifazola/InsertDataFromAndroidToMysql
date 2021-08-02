package com.example.connecttomysql

import retrofit2.Call
import retrofit2.http.GET

interface GetUserAPI {

    @GET("getname.php")
    fun getName() : Call<GetUserResponse>
}