package com.example.userregistrationdiptil404.dao_dipti_amad_ict_l4_04

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.userregistrationdiptil404.Models_dipti_amad_ict_l4_04.UserProfile_dipti_amad_ict_l4_04

@Dao

 interface  UserProfileDao_dipti_amad_ict_l4_04 {

    @Insert
    suspend fun   insert(userProfile: UserProfile_dipti_amad_ict_l4_04)

    @Update
    suspend fun   update(userProfile: UserProfile_dipti_amad_ict_l4_04)

    @Delete
    suspend fun   delete(userProfile: UserProfile_dipti_amad_ict_l4_04)

    @Query("SELECT * FROM user_profile")
    fun   getAllProfiles(): LiveData<List<UserProfile_dipti_amad_ict_l4_04>>

}