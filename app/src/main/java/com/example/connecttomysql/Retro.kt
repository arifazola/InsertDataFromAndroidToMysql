package com.example.connecttomysql

import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class Retrofit {
    fun getRetroClient() : Retrofit{
        val gson = GsonBuilder().setLenient().create()
        return Retrofit.Builder().baseUrl("http://192.168.1.7/android/")
            .addConverterFactory(GsonConverterFactory.create(gson))
            .build()
    }
}