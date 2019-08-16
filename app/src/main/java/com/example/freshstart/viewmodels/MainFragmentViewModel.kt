package com.example.freshstart.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import javax.inject.Inject

class MainFragmentViewModel @Inject constructor(): ViewModel() {

    val helloWorldMessage: LiveData<String>
        get() = _helloWorldMessage

    private val _helloWorldMessage: MutableLiveData<String> = MutableLiveData()

    fun showHelloWorldMessage() {
        _helloWorldMessage.postValue("Hello World!")
    }
}