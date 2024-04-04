package com.example.newsapp.api

import android.util.Log
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


object ApiManager {

    private var retrofit: Retrofit
    init{
        val logging: HttpLoggingInterceptor = HttpLoggingInterceptor { message ->
            Log.e("api-> ",message)
        }
        logging.setLevel(HttpLoggingInterceptor.Level.BODY)
        val client = OkHttpClient.Builder()
            .addInterceptor(logging)
            .build()

        retrofit = Retrofit.Builder()
            .client(client)
            .baseUrl("https://newsapi.org/v2/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
    fun getServices(): WebServices{
        return retrofit.create(WebServices::class.java)
    }
}