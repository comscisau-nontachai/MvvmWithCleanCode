package com.example.mvvmwithcleancode_sample.di

import com.example.mvvmwithcleancode_sample.ui.home.HomeViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
     viewModel {HomeViewModel(get(),get()) }
}