package com.example.project_kd1.domain

import com.example.project_kd1.data.model.ModelData
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

class GetDataUseCase {

    private val BASE_URL = "https://catfact.ninja/"

    val client: API by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(API::class.java)
    }

    interface API {
        @GET("fact")
        suspend fun getDataFromAPI(): ModelData
    }

}