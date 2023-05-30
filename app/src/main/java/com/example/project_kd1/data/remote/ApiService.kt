package com.example.project_kd1.data.remote

import com.example.project_kd1.data.model.ModelData
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

class ApiService {
    private val base_url = "https://catfact.ninja/"

    val client: API by lazy {
        Retrofit.Builder()
            .baseUrl(base_url)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(API::class.java)
    }

    interface API {
        @GET("fact")
        suspend fun getDataFromAPI(): ModelData
    }

}