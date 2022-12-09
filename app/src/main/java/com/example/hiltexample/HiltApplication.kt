package com.example.hiltexample

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

@HiltAndroidApp
class HiltApplication : Application() {
    // This is the Example of field injection
//    @Inject
//    lateinit var userRepository: UserRepository

    override fun onCreate() {
        super.onCreate()
        //userRepository.saveUserInfo("zahid", "zahid@gmail.com")
    }

}

// Zorori points
// 1 application class define karni perti ha
//2 @HiltAndroidapp ko use karna perta ha application class ma ur
// jis class ko ap ne inject karna hota ha us k constroctor
// ma ap ne inject lagna hota ha ur
// usy access wali class a field ki tahra
// declare karna hota ha with inject es taha hilt ko pata chal jata ha k us ne kasay object create karna ha
