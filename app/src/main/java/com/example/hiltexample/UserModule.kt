package com.example.hiltexample

import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.components.FragmentComponent
import javax.inject.Named

@InstallIn(FragmentComponent::class)
//@InstallIn(FragmentComponent::class)
@Module
class UserModule {

    // jb aik se zaida implementation ho kisi b interface ki tu hum us ko name qulifer se identify karty hian but mistake ko avoid karny k lea hum custom qulifier b create kar sakty hian
    @Provides
    @Firebasequlifier
 fun  provideUserRepository() : UserRepositoryInterface{
     return FirebaseRepository()
 }


    @Provides
    @Named("SQL")
    fun  provideSQLUserRepository() : UserRepositoryInterface{
        return SQLRepository()
    }


    //how to bind interface with its implementation by usinig provde
    // aesa es lea ha k sqlrepository ma hum ne inject use kia hoa ha tu hilt ko pata ha k kasy object create karna ha
    // bind wala kam hum bind attanotion k sth b kar skty hian jb jo k nechy wali class ma example ha
//    @Provides
//    fun  provideUserRepository(sqlRepository: SQLRepository) : UserRepositoryInterface{
//        return sqlRepository
//    }



}


//@InstallIn(FragmentComponent::class)
////@InstallIn(FragmentComponent::class)
//@Module
//abstract class UserModule {
//    @Binds
//   abstract fun  bindUserRepository(sqlRepository: SQLRepository) : UserRepositoryInterface
//
//// bind function always abstract hoty hian ur un k class b
////yani jb es ma USserRepsoitoryinterface ko mane sqlRepository se bind kar dia ha jb b es ko call ki jay ge tu ya just userrepinterface return kar dy ga
//// lakin ya tub hota ha jb implemented clas ma inject constuctor ma ho
//}