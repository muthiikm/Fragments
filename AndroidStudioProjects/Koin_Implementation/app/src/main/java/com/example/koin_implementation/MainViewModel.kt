package com.example.koin_implementation

import androidx.lifecycle.ViewModel

//Constructor injection
class MainViewModel(

    private val repository:MainRepositoryImp

): ViewModel() {


    fun doNetworkCall(){

        repository.doNetworkCall()
    }
}