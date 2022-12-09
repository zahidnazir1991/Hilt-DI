package com.example.hiltexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dagger.hilt.android.AndroidEntryPoint
import dagger.multibindings.IntKey
import javax.inject.Inject
@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
//    @Inject
//    lateinit var userRepository: UserRepository
//    @Inject
//    lateinit var userRepositoryInterface: UserRepositoryInterface

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       // userRepository.saveUserInfo("zah","zah@gmail.com")
       // userRepositoryInterface.saveUserInfo("","")
    }


    //note

 //   if you dont want to inject any thing here
//   but it is very necessary to attanotate with androidEntryPoint
//   when you inject something in fragments.
}