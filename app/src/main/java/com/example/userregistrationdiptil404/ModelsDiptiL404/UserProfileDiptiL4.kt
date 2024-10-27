package com.example.userregistrationdiptil404.ModelsDiptiL404

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(tableName = "user_profile")
  data class UserProfileDiptiL4 (
    @PrimaryKey(autoGenerate = true)
    val id: Int=0,
    val name:String="",
    val email:String="",
    val dob:String="",
    val district:String="",
    val mobile:String=""

    ): Serializable
