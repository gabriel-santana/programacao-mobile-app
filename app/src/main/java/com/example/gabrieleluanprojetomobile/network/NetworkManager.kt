package com.example.gabrieleluanprojetomobile.network

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

// URL do endpoint da API (precisa do / no final)
// - ngrok: https://ngrok.com/download
private val URL = "http://048f6afd053d.ngrok.io" //mudar

object NetworkManager {

    lateinit var client: OkHttpClient

    val service: ApiService by lazy {
        val interceptor = HttpLoggingInterceptor()
        interceptor.level = HttpLoggingInterceptor.Level.BODY
        client = OkHttpClient.Builder().addInterceptor(interceptor).build()

        val retrofit = Retrofit.Builder()
            .baseUrl(URL)
            .client(client)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        return@lazy retrofit.create(ApiService::class.java)
    }

    fun stop() {
        client.dispatcher().cancelAll()
    }

}
