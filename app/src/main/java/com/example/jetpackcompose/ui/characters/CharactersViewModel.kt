package com.example.jetpackcompose.ui.characters

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.jetpackcompose.data.models.Character
import com.example.jetpackcompose.domain.GetCharactersUseCase
import kotlinx.coroutines.launch

class CharactersViewModel : ViewModel() {
    private val getCharactersUseCase = GetCharactersUseCase()

    private val _isLoading = MutableLiveData<Boolean>()
    val isLoading: LiveData<Boolean> = _isLoading
    private val _characters = MutableLiveData<List<Character>>()
    val characters: LiveData<List<Character>> = _characters
    private val _query = MutableLiveData<String>()
    val query: LiveData<String> = _query

    private var characterList = listOf<Character>()

    init {
        viewModelScope.launch {
            _isLoading.value = true
            val response = getCharactersUseCase()
            characterList = response
            _characters.value = characterList
            _isLoading.value = false
        }
    }

    fun searchCharacter(query: String) {
        _query.value = query
        val filteredList = characterList.filter { it.name.lowercase().contains(query.lowercase()) }
        _characters.value = filteredList
    }
}