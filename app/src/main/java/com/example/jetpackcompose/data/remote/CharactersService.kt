package com.example.jetpackcompose.data.remote

import com.example.jetpackcompose.data.models.Character
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

interface CharactersService {

    @GET("characters")
    suspend fun getCharacters(@Query("perPage") query: Int = 497): List<Character>

    companion object {
        private const val BASE_URL = "https://last-airbender-api.herokuapp.com/api/v1/"
        private var instance: CharactersService? = null

        @Synchronized
        fun getInstance(): CharactersService {
            if (instance == null) {
                instance = Retrofit.Builder()
                    .addConverterFactory(GsonConverterFactory.create())
                    .baseUrl(BASE_URL)
                    .build()
                    .create(CharactersService::class.java)
            }
            return instance as CharactersService
        }
    }
}