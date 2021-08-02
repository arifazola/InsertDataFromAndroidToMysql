package com.example.connecttomysql

import com.google.gson.GsonBuilder
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.converter.scalars.ScalarsConverterFactory

class Retrofit {
    fun getRetroClient() : Retrofit{
        val gson = GsonBuilder().setLenient().create()
        return Retrofit.Builder().baseUrl("http://192.168.1.7/android/")
//             if you want to convert json to string, use this code below
//            .addConverterFactory(ScalarsConverterFactory.create())
            .addConverterFactory(GsonConverterFactory.create(gson))
            .build()
    }

    fun getInterceptor() : OkHttpClient{
        val logging = HttpLoggingInterceptor();
        logging.level = HttpLoggingInterceptor.Level.BODY

        val okHttpClient = OkHttpClient.Builder()
            .addInterceptor(logging)
            .build()
        return okHttpClient
    }
}