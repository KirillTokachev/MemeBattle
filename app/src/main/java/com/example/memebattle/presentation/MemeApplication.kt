package com.example.memebattle.presentation

import android.app.Application
import com.example.memebattle.R
import com.example.memebattle.di.DaggerApplicationComponent
import com.parse.Parse

class MemeApplication : Application() {

    val component by lazy {
        DaggerApplicationComponent.factory().create(this, applicationContext)
    }

    override fun onCreate() {
        super.onCreate()
        Parse.Configuration.Builder(this)
            .applicationId(getString(R.string.back4app_app_id))
            .clientKey(getString(R.string.back4app_client_key))
            .server(getString(R.string.back4app_server_url))
            .build()
    }
}