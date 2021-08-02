package com.example.connecttomysql

import com.google.gson.JsonObject
import okhttp3.RequestBody
import org.json.JSONObject
import retrofit2.Call
import retrofit2.http.*

interface UserAPI {
//    @Headers("Content-Type: application/json")
    @FormUrlEncoded
    @POST("addname.php")
    fun addName(@Field("name") userRequest: String) : Call<UserResponse>
}
