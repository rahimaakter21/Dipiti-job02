package com.example.userregistrationdiptil404.viewmodeldiptil404

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.example.userregistrationdiptil404.ModelsDiptiL404.UserProfileDiptiL4
import com.example.userregistrationdiptil404.databasediptil404.UserDatabaseDitpiL404
import com.example.userregistrationdiptil404.repositorydiptil404.UserProfileRepositoryDiptiL404
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class UserProfileViewModelDiptiL404  (application: Application): AndroidViewModel(application) {




    private val repository:UserProfileRepositoryDiptiL404


    init{
        val userProfileDao = UserDatabaseDitpiL404.getDatabase(application)._userProfileDao()

        repository= UserProfileRepositoryDiptiL404(userProfileDao)
    }

    fun getUserProfiles(): LiveData<List<UserProfileDiptiL4>> {
        return repository.getUserProfiles()
    }
    fun insertUserProfile(userProfile: UserProfileDiptiL4) {
        viewModelScope.launch (Dispatchers.IO){
            repository.insert(userProfile)
        }

    }
    fun updateUserProfile(userProfile: UserProfileDiptiL4) {
        viewModelScope.launch(Dispatchers.IO) {
            repository.update(userProfile)
        }
    }
    fun deleteUserProfile(userProfile: UserProfileDiptiL4) {
        viewModelScope.launch(Dispatchers.IO) {
            repository.delete(userProfile)
        }
    }

}