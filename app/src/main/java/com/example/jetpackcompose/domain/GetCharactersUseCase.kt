package com.example.jetpackcompose.domain

import com.example.jetpackcompose.data.CharactersRepository
import com.example.jetpackcompose.data.models.Character

class GetCharactersUseCase {
    private val charactersRepository = CharactersRepository()

    suspend operator fun invoke(): List<Character> {
        return charactersRepository.getCharacters()
    }
}