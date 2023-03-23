package com.example.mvvmwithcleancode_sample.data.repositoryImpl

import com.example.mvvmwithcleancode_sample.data.ResponseResource
import com.example.mvvmwithcleancode_sample.data.pref.Prefs
import com.example.mvvmwithcleancode_sample.data.remote.response.DummyResponse2
import com.example.mvvmwithcleancode_sample.data.remote.response.DummyUserResponse
import com.example.mvvmwithcleancode_sample.data.remote.source.HomeRemote
import com.example.mvvmwithcleancode_sample.domain.repository.HomeRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class HomeRepositoryImpl(
private val remote : HomeRemote,
private val sessionPrefs : Prefs
) : HomeRepository {
    override suspend fun getHomeData(): Flow<ResponseResource<DummyResponse2>> {
        return flow {
            val responseResource = when(val response = remote.getHomeList()){
                is ResponseResource.Error -> ResponseResource.error(response.errorMessage)
                is ResponseResource.Success -> ResponseResource.success(response.data)
            }
            emit(responseResource)
        }
    }

    override suspend fun getUserListData(): Flow<ResponseResource<ArrayList<DummyUserResponse>>> {
        return flow {
            val responseResource = when(val response = remote.getUserList()){
                is ResponseResource.Error -> ResponseResource.error(response.errorMessage)
                is ResponseResource.Success -> ResponseResource.success(response.data)
            }
            emit(responseResource)
        }
    }
}