package com.example.hiltexample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import dagger.hilt.EntryPoint
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
import javax.inject.Named

@AndroidEntryPoint
class HiltFragment : Fragment() {
    @Inject
    lateinit var userRepository: UserRepository
    @Inject
    lateinit var userRepositoryConstructor: UserRepositoryConstructor
//    @Inject
//    @Named("SQL")
//    lateinit var  userRepositoryInterface: UserRepositoryInterface
    @Inject
    @Firebasequlifier
    lateinit var  userRepositoryInterface: UserRepositoryInterface

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        userRepository.saveUserInfo("","")
        userRepositoryConstructor.saveUserInfo("Save user info with constructor injection")
        userRepositoryInterface.saveUserInfo("","")

        return inflater.inflate(R.layout.fragment_hilt, container, false)
    }


}