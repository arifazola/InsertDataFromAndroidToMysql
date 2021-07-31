package com.example.connecttomysql

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import org.json.JSONObject
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    private lateinit var inputName : EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        inputName = binding.addName
//        binding.addNameButton.setOnClickListener { addName() }
        inputName = findViewById(R.id.addName)
        findViewById<Button>(R.id.addNameButton).setOnClickListener { addName() }
        findViewById<Button>(R.id.searchButton).setOnClickListener { getName() }
//        val retroGetName = RetroGetData().getRetroClient().create(GetDataApi::class.java)
//        retroGetName.getName().enqueue(object : Callback<List<ResponseName>>{
//            override fun onResponse(
//                call: Call<List<ResponseName>>,
//                response: Response<List<ResponseName>>
//            ) {
//
//            }
//
//            override fun onFailure(call: Call<List<ResponseName>>, t: Throwable) {
//                Log.e("Error", t.message.toString())
//            }
//
//        })

    }

    private fun addName(){
        val request = Request()

        request.name = inputName.text.toString()

        val retro = Retrofit().getRetroClient().create(UserAPI::class.java)
        retro.addName(request).enqueue(object : Callback<UserResponse>{
            override fun onResponse(call: Call<UserResponse>, response: Response<UserResponse>) {
                val user = response.body()
                Log.e("Sukses", user?.error.toString())
                Log.e("Sukses", user?.message.toString())
                Log.e("Sukses", inputName.text.toString())
            }

            override fun onFailure(call: Call<UserResponse>, t: Throwable) {
                Log.e("Error", t.message.toString())
            }

        })
    }

    private fun getName(){


    }
}