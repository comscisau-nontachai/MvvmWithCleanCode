package com.example.mvvmwithcleancode_sample.domain.repository

import com.example.mvvmwithcleancode_sample.data.ResponseResource
import com.example.mvvmwithcleancode_sample.data.remote.response.DummyResponse2
import com.example.mvvmwithcleancode_sample.data.remote.response.DummyUserResponse
import kotlinx.coroutines.flow.Flow

interface HomeRepository {
    suspend fun getHomeData() : Flow<ResponseResource<DummyResponse2>>
    suspend fun getUserListData() : Flow<ResponseResource<ArrayList<DummyUserResponse>>>
}