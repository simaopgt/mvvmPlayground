package com.simao.mvvmtraining

import android.app.Application
import com.simao.mvvmtraining.di.modules
import org.koin.android.ext.koin.androidContext

import org.koin.core.context.startKoin


class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin{

            androidContext(this@MyApplication)

            modules(modules)
        }

    }
}