package com.example.hiltexample

import android.util.Log
import javax.inject.Inject

class LoggerService @Inject constructor() {
    fun LogData(message :String){
        Log.d(Tag,message)

    }
}