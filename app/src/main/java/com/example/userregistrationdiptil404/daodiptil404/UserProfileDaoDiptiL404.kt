package com.example.userregistrationdiptil404.daodiptil404

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.userregistrationdiptil404.ModelsDiptiL404.UserProfileDiptiL4

@Dao

 interface  UserProfileDaoDiptiL404 {

    @Insert
    suspend fun   insert(userProfile: UserProfileDiptiL4)

    @Update
    suspend fun   update(userProfile: UserProfileDiptiL4)

    @Delete
    suspend fun   delete(userProfile: UserProfileDiptiL4)

    @Query("SELECT * FROM user_profile")
    fun   getAllProfiles(): LiveData<List<UserProfileDiptiL4>>

}