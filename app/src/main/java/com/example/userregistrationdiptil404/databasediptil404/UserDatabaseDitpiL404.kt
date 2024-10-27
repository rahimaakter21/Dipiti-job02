package com.example.userregistrationdiptil404.databasediptil404

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.userregistrationdiptil404.ModelsDiptiL404.UserProfileDiptiL4
import com.example.userregistrationdiptil404.daodiptil404.UserProfileDaoDiptiL404


@Database(entities = [UserProfileDiptiL4::class], version = 1)

    abstract class UserDatabaseDitpiL404 : RoomDatabase() {
        abstract fun _userProfileDao(): UserProfileDaoDiptiL404

        companion object {
            @Volatile
            private var INSTANCE: UserDatabaseDitpiL404? = null
            fun getDatabase(context: Context): UserDatabaseDitpiL404 {

                return INSTANCE ?: synchronized(this) {
                    val instance = Room.databaseBuilder(
                        context.applicationContext,
                        UserDatabaseDitpiL404::class.java,
                        "user_profile_database"

                    ).build()
                    INSTANCE = instance
                    instance
                }
            }


        }
    }

