package com.example.userregistrationdiptil404.repository_dipti_amad_ict_l4_04

import androidx.lifecycle.LiveData
import com.example.userregistrationdiptil404.Models_dipti_amad_ict_l4_04.UserProfile_dipti_amad_ict_l4_04
import com.example.userregistrationdiptil404.dao_dipti_amad_ict_l4_04.UserProfileDao_dipti_amad_ict_l4_04

class UserProfileRepository_dipti_amad_ict_l4_04 (private val userProfileDao: UserProfileDao_dipti_amad_ict_l4_04)  {

    fun  getUserProfiles(): LiveData<List<UserProfile_dipti_amad_ict_l4_04>> {

        return userProfileDao.getAllProfiles()
    }
    suspend fun  insert(userProfile: UserProfile_dipti_amad_ict_l4_04){
        return userProfileDao.insert(userProfile)

    }
    suspend fun  update(userProfile: UserProfile_dipti_amad_ict_l4_04){
        return  userProfileDao.update(userProfile)

    }

    suspend fun  delete(userProfile: UserProfile_dipti_amad_ict_l4_04){
        return  userProfileDao.delete(userProfile)

    }


}