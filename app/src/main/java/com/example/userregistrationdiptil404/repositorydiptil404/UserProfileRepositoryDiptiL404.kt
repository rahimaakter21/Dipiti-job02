package com.example.userregistrationdiptil404.repositorydiptil404

import androidx.lifecycle.LiveData
import com.example.userregistrationdiptil404.ModelsDiptiL404.UserProfileDiptiL4
import com.example.userregistrationdiptil404.daodiptil404.UserProfileDaoDiptiL404

class UserProfileRepositoryDiptiL404 (private val userProfileDao: UserProfileDaoDiptiL404)  {

    fun  getUserProfiles(): LiveData<List<UserProfileDiptiL4>> {

        return userProfileDao.getAllProfiles()
    }
    suspend fun  insert(userProfile: UserProfileDiptiL4){
        return userProfileDao.insert(userProfile)

    }
    suspend fun  update(userProfile: UserProfileDiptiL4){
        return  userProfileDao.update(userProfile)

    }

    suspend fun  delete(userProfile: UserProfileDiptiL4){
        return  userProfileDao.delete(userProfile)

    }


}