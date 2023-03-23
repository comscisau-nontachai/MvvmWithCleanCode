package com.example.mvvmwithcleancode_sample.data.remote.source

import android.util.Log
import com.example.mvvmwithcleancode_sample.data.ApiRoutes
import com.example.mvvmwithcleancode_sample.data.ResponseResource
import com.example.mvvmwithcleancode_sample.data.remote.response.DummyResponse2
import com.example.mvvmwithcleancode_sample.data.remote.response.DummyUserResponse
import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.request.*

class HomeRemoteImpl(private val client : HttpClient) : HomeRemote {
    override suspend fun getHomeList(): ResponseResource<DummyResponse2> {
        return try {
            val response = client.get(ApiRoutes.ENDPOINT_PRODUCTS){
                // header("Authorization", "Bearer $token")
            }.body<DummyResponse2>()
            ResponseResource.success(response)
        }catch (e : java.lang.Exception){
            Log.d("LOGD", "getHomeList: ${e.message}")
            ResponseResource.error(DummyResponse2())
        }
    }

    override suspend fun getUserList(): ResponseResource<ArrayList<DummyUserResponse>> {
        return try {
            val response = client.get(ApiRoutes.ENDPOINT_USER){
            }.body<ArrayList<DummyUserResponse>>()
            ResponseResource.success(response)
        }catch (e : java.lang.Exception){
            Log.d("LOGD", "Exception:${e.message} ")
            ResponseResource.error(arrayListOf())
        }
    }
}