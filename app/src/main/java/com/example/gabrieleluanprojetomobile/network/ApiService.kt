package com.example.gabrieleluanprojetomobile.network

import com.example.gabrieleluanprojetomobile.model.Ong
import com.example.gabrieleluanprojetomobile.model.PacoteJSON
import retrofit2.Call
import retrofit2.http.*


interface ApiService {

    @GET("/ongs")
    fun listarOng(): Call<PacoteJSON<List<Ong?>?>?>?

    @GET("/ongs/{id}")
    fun listarOng(@Path("id") id: Int): Call<PacoteJSON<Ong?>?>?

    @GET("/search/{name}")
    fun listarCursos(@Path("name") name: String): Call<PacoteJSON<List<Ong?>?>?>?

}
