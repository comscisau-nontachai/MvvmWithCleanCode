package com.example.mvvmwithcleancode_sample.di

import com.example.mvvmwithcleancode_sample.data.ktorHttpClient
import org.koin.dsl.module

val appModule = module {
 single { ktorHttpClient }
}