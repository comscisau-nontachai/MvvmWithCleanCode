package com.example.mvvmwithcleancode_sample.data.remote.source

import com.example.mvvmwithcleancode_sample.data.ResponseResource
import com.example.mvvmwithcleancode_sample.data.remote.response.DummyResponse2
import com.example.mvvmwithcleancode_sample.data.remote.response.DummyUserResponse

interface HomeRemote {

    suspend fun getHomeList() : ResponseResource<DummyResponse2>
    suspend fun getUserList() : ResponseResource<ArrayList<DummyUserResponse>>
}