package com.example.myrecipe

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import retrofit2.http.GET

    private val retrofit=Retrofit.Builder().baseUrl("https://www.themealdb.com/api/json/v1/1/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val recipeService= retrofit.create(ApiService::class.java)

interface ApiService {
    @GET("categories.php")

    //suspend keyword se ye function background mai hota rahega ui ka kaam alag chalta rahega
    //isse user bore nahi hoga kyuki ye api wala kaam ka response slow ho sakta hai
    //it comes back when the function is finished

    suspend fun getCategories(): CategoryResponse
}