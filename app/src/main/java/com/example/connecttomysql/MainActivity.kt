package com.example.connecttomysql

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import org.json.JSONObject
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.create

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
//                Log.e("Error", t.message.toGetUserResponse())
//            }
//
//        })

    }

    private fun addName(){
        /**Unimportant codes
//        val request = Request()
//
//        request.name = inputName.text.toGetUserResponse()
        **/

//        val retro = Retrofit().getRetroClient().create(UserAPI::class.java)
//        retro.addName(inputName.text.toGetUserResponse()).enqueue(object : Callback<UserResponse>{
//            override fun onResponse(call: Call<UserResponse>, response: Response<UserResponse>) {
//                val user = response.body()
//                Log.e("Sukses", user?.error.toGetUserResponse())
//                Log.e("Sukses", user?.message.toGetUserResponse())
//                Log.e("Sukses", inputName.text.toGetUserResponse())
//            }
//
//            override fun onFailure(call: Call<UserResponse>, t: Throwable) {
//                Log.e("Error", t.message.toGetUserResponse())
//            }
//
//        })
    }

    private fun getName(){
        val text = findViewById<TextView>(R.id.showList)
        val retro = Retrofit().getRetroClient().create(GetUserAPI::class.java)
        retro.getName().enqueue(object : Callback<GetUserResponse>{
            override fun onResponse(
                call: Call<GetUserResponse>,
                response: Response<GetUserResponse>
            ) {
                    val user = response.body()?.result
//                    val error = response.body()?.error
//                    val message = response.body()?.message
                    Log.e("Sukses", user.toString())
//                    Log.e("Sukses", error.toGetUserResponse())
//                    Log.e("Sukses", message.toGetUserResponse())
                inputName.visibility = View.GONE
            for(i in 0 .. user!!.size -1) {
                    text.append("," + user?.get(i).name)
                }
                text.visibility = View.VISIBLE
                }

            override fun onFailure(call: Call<GetUserResponse>, t: Throwable) {
                Log.e("Error",t.message.toString())
            }

        })
    }
}