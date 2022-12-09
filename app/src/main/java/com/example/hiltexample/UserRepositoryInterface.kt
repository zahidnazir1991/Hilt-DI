package com.example.hiltexample

import android.util.Log
import javax.inject.Inject

interface UserRepositoryInterface {
    fun saveUserInfo(name: String, email: String)

}

class SQLRepository @Inject constructor() : UserRepositoryInterface{
    override fun saveUserInfo(name: String, email: String) {
        Log.d(Tag,"Save into local db with interface")
    }
}

class FirebaseRepository : UserRepositoryInterface{
    override fun saveUserInfo(name: String, email: String) {
        Log.d(Tag,"Save into firebase db with interface")
    }
}