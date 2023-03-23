package com.example.mvvmwithcleancode_sample.di

import com.example.mvvmwithcleancode_sample.data.pref.Prefs
import com.example.mvvmwithcleancode_sample.data.pref.PrefsImpl
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module
import kotlin.math.sin

val cacheModule = module {
    single<Prefs> { PrefsImpl(androidContext()) }
}