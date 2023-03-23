package com.example.mvvmwithcleancode_sample.di

import com.example.mvvmwithcleancode_sample.data.remote.source.AuthRemoteImpl
import com.example.mvvmwithcleancode_sample.data.remote.source.HomeRemoteImpl
import com.example.mvvmwithcleancode_sample.data.repositoryImpl.AuthRepositoryImpl
import com.example.mvvmwithcleancode_sample.data.repositoryImpl.HomeRepositoryImpl
import com.example.mvvmwithcleancode_sample.domain.repository.AuthRepository
import com.example.mvvmwithcleancode_sample.domain.repository.HomeRepository
import org.koin.dsl.module

val repositoryModule = module {
    single<AuthRepository> { AuthRepositoryImpl(get()) }
    single<HomeRepository> { HomeRepositoryImpl(get(),get()) }
}