package com.example.userregistrationdiptil404.database_dipti_amad_ict_l4_04

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.userregistrationdiptil404.Models_dipti_amad_ict_l4_04.UserProfile_dipti_amad_ict_l4_04
import com.example.userregistrationdiptil404.dao_dipti_amad_ict_l4_04.UserProfileDao_dipti_amad_ict_l4_04


@Database(entities = [UserProfile_dipti_amad_ict_l4_04::class], version = 1)

    abstract class UserDatabase_dipti_amad_ict_l4_04 : RoomDatabase() {
        abstract fun _userProfileDao(): UserProfileDao_dipti_amad_ict_l4_04

        companion object {
            @Volatile
            private var INSTANCE: UserDatabase_dipti_amad_ict_l4_04? = null
            fun getDatabase(context: Context): UserDatabase_dipti_amad_ict_l4_04 {

                return INSTANCE ?: synchronized(this) {
                    val instance = Room.databaseBuilder(
                        context.applicationContext,
                        UserDatabase_dipti_amad_ict_l4_04::class.java,
                        "user_profile_database"

                    ).build()
                    INSTANCE = instance
                    instance
                }
            }


        }
    }

