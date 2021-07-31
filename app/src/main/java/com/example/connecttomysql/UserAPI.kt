package com.example.connecttomysql

import com.google.gson.JsonObject
import okhttp3.RequestBody
import org.json.JSONObject
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.POST

interface UserAPI {
    @Headers("Content-Type: application/json")
    @POST("addname.php")
    fun addName(@Body userRequest: Request) : Call<UserResponse>
}
