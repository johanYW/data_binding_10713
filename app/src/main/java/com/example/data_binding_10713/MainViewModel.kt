package com.example.data_binding_10713

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {
    val currentRandomFruitNames: LiveData<String>
    get() = FakeRepository.currentRandomFruitName

    fun onChangeRandomFruitClick() = FakeRepository.changeCurrentRandomFruitName()

    val editTextContent = MutableLiveData<String>()

    private val _displayEditTextContent = MutableLiveData<String>()
    val  displayEditTextContent: LiveData<String>
        get() = _displayEditTextContent

    fun onDisplayEditTextContentClick(){
        _displayEditTextContent.value = editTextContent.value
    }

    fun onSelectRandomEditTextFruit(){
        editTextContent.value = FakeRepository.getRandomfruitName()
    }
}