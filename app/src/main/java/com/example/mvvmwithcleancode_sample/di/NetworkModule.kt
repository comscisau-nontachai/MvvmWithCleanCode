package com.example.mvvmwithcleancode_sample.di

import com.example.mvvmwithcleancode_sample.data.remote.source.AuthRemote
import com.example.mvvmwithcleancode_sample.data.remote.source.AuthRemoteImpl
import com.example.mvvmwithcleancode_sample.data.remote.source.HomeRemote
import com.example.mvvmwithcleancode_sample.data.remote.source.HomeRemoteImpl
import org.koin.dsl.module

val networkModule = module {
    single<AuthRemote> { AuthRemoteImpl(get()) }
    single<HomeRemote> { HomeRemoteImpl(get()) }
}