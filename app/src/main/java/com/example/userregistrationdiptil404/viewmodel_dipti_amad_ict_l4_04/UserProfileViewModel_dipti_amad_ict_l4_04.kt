package com.example.userregistrationdiptil404.viewmodel_dipti_amad_ict_l4_04

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.example.userregistrationdiptil404.Models_dipti_amad_ict_l4_04.UserProfile_dipti_amad_ict_l4_04
import com.example.userregistrationdiptil404.database_dipti_amad_ict_l4_04.UserDatabase_dipti_amad_ict_l4_04
import com.example.userregistrationdiptil404.repository_dipti_amad_ict_l4_04.UserProfileRepository_dipti_amad_ict_l4_04
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class UserProfileViewModel_dipti_amad_ict_l4_04  (application: Application): AndroidViewModel(application) {




    private val repository:UserProfileRepository_dipti_amad_ict_l4_04


    init{
        val userProfileDao = UserDatabase_dipti_amad_ict_l4_04.getDatabase(application)._userProfileDao()

        repository= UserProfileRepository_dipti_amad_ict_l4_04(userProfileDao)
    }

    fun getUserProfiles(): LiveData<List<UserProfile_dipti_amad_ict_l4_04>> {
        return repository.getUserProfiles()
    }
    fun insertUserProfile(userProfile: UserProfile_dipti_amad_ict_l4_04) {
        viewModelScope.launch (Dispatchers.IO){
            repository.insert(userProfile)
        }

    }
    fun updateUserProfile(userProfile: UserProfile_dipti_amad_ict_l4_04) {
        viewModelScope.launch(Dispatchers.IO) {
            repository.update(userProfile)
        }
    }
    fun deleteUserProfile(userProfile: UserProfile_dipti_amad_ict_l4_04) {
        viewModelScope.launch(Dispatchers.IO) {
            repository.delete(userProfile)
        }
    }

}