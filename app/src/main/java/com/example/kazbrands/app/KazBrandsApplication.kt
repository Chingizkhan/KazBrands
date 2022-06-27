package com.example.kazbrands.app

import android.app.Application
import com.example.kazbrands.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class KazBrandsApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        setKoin()
    }

    private fun setKoin() {
        startKoin {
            androidLogger()
            androidContext(this@KazBrandsApplication)
            modules(appModule)
        }
    }
}