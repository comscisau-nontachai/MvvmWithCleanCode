package com.example.mvvmwithcleancode_sample.ui.home

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mvvmwithcleancode_sample.data.ResponseResource
import com.example.mvvmwithcleancode_sample.data.pref.Prefs
import com.example.mvvmwithcleancode_sample.data.remote.response.DummyResponse2
import com.example.mvvmwithcleancode_sample.domain.repository.HomeRepository
import com.example.mvvmwithcleancode_sample.utils.AppConstants
import com.example.mvvmwithcleancode_sample.utils.networking.State
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch


class HomeViewModel(
    private val repository : HomeRepository,
    private val sessionPrefs : Prefs
) : ViewModel() {

    val homeDataList = MutableLiveData<List<DummyResponse2.Result>>()
    val userDataList = MutableLiveData<State<List<DummyResponse2.Result>>>()

    init {
        //getUserData()
        getHomeData()
    }

    private fun getUserData(){
        viewModelScope.launch {
            repository.getUserListData().collect{
                when(it){
                    is ResponseResource.Error -> Log.d("LOGD", "getUserData: Some error happened : ${it.errorMessage}")
                    is ResponseResource.Success -> {
                        userDataList.postValue(
                            State.success(
                                msg = AppConstants.APP_SUCCESS_MESSAGE,
                                data = null
                            )
                        )
                        Log.d("LOGD", "getUserData: ${it.data}")
                    }
                }
            }
        }
    }
    private fun getHomeData() {
        viewModelScope.launch {

            repository.getHomeData().collect {
                when (it) {
                    is ResponseResource.Error -> {
                        Log.d("HomeViewModel", "Some error happened ${it.errorMessage}")
                    }
                    is ResponseResource.Success -> {
                        homeDataList.postValue(it.data.results!!)
                        Log.d("HomeViewModel", "${it.data}")
                    }
                }
            }
        }
    }
}