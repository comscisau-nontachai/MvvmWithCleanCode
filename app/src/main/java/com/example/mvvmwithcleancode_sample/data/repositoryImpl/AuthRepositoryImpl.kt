package com.example.mvvmwithcleancode_sample.data.repositoryImpl

import com.example.mvvmwithcleancode_sample.data.ResponseResource
import com.example.mvvmwithcleancode_sample.data.pref.Prefs
import com.example.mvvmwithcleancode_sample.data.remote.response.DummyResponse2
import com.example.mvvmwithcleancode_sample.data.remote.response.DummyUserResponse
import com.example.mvvmwithcleancode_sample.data.remote.source.AuthRemote
import com.example.mvvmwithcleancode_sample.data.remote.source.HomeRemote
import com.example.mvvmwithcleancode_sample.domain.repository.AuthRepository
import com.example.mvvmwithcleancode_sample.domain.repository.HomeRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class AuthRepositoryImpl(private val remote: AuthRemote) : AuthRepository {

    // override suspend fun signup(requestDto: SignupRequestDto): Flow<ResponseResource<SignupResponseDto>> =
    //     flow {
    //         when (val response = remote.signup(requestDto)) {
    //             is ResponseResource.Error -> emit(ResponseResource.error(response.errorMessage))
    //             is ResponseResource.Success -> emit(ResponseResource.success(response.data))
    //         }
    //     }

    // override suspend fun login(request: LoginRequestDto): Flow<ResponseResource<LoginResponseDto>> =
    //     flow {
    //         when (val response = remote.login(request)) {
    //             is ResponseResource.Error -> emit(ResponseResource.error(response.errorMessage))
    //             is ResponseResource.Success -> emit(ResponseResource.success(response.data))
    //         }
    //     }

}