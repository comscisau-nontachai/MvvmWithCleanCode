package com.example.mvvmwithcleancode_sample

import android.app.Application
import com.example.mvvmwithcleancode_sample.di.*
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.dsl.module

class App : Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger()
            androidContext(this@App)
            modules(
                appModule,
                cacheModule,
                networkModule,
                repositoryModule,
                viewModelModule,
                //useCaseModule
            )
        }
    }
}