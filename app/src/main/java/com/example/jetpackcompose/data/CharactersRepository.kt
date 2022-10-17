package com.example.jetpackcompose.data

import com.example.jetpackcompose.data.models.Character
import com.example.jetpackcompose.data.remote.CharactersService
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class CharactersRepository {
    private val avatarService = CharactersService.getInstance()

    suspend fun getCharacters(): List<Character> {
        return withContext(Dispatchers.IO) {
            try {
                avatarService.getCharacters()
            } catch (e: Exception) {
                e.printStackTrace()
                listOf()
            }
        }
    }
}