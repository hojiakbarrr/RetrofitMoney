package com.example.retrofitmoney.screens.second

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.retrofitmoney.data.repository.Repository
import com.example.retrofitmoney.model.beznal.Beznal
import kotlinx.coroutines.launch
import retrofit2.Response

class SecondViewModel: ViewModel(){

    var repo = Repository()
    val myMoneyList: MutableLiveData<Response<Beznal>> = MutableLiveData()

    fun getBezNalMoney(){
        viewModelScope.launch {
            myMoneyList.value = repo.getBezNal()
        }
    }



}