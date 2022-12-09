package com.example.hiltexample

import android.util.Log

import javax.inject.Inject
const val Tag = "HiltExample"
class UserRepository @Inject constructor(){
   fun saveUserInfo(name : String,email :String){
        Log.d(Tag,"Save user info with field injection")
    }
}



// Field injection example



