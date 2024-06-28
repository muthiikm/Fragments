package com.example.koin_implementation

import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {
    private val repository = MainRepositoryImp()

    fun doNetworkCall(){

        repository.doNetworkCall()
    }
}