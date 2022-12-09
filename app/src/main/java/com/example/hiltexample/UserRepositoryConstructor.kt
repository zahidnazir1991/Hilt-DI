package com.example.hiltexample

import android.util.Log
import javax.inject.Inject


// Constructor injection example
class UserRepositoryConstructor @Inject constructor(val loggerService: LoggerService) {
    fun saveUserInfo(message :String){
        loggerService.LogData(message)
    }
}