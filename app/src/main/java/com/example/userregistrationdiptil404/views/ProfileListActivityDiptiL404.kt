package com.example.userregistrationdiptil404.views

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.userregistrationdiptil404.AdapterDiptiL404.ProfileAdapterDiptil404
import com.example.userregistrationdiptil404.R
import com.example.userregistrationdiptil404.viewmodeldiptil404.UserProfileViewModelDiptiL404
import com.google.android.material.floatingactionbutton.FloatingActionButton

class ProfileListActivityDiptiL404 : AppCompatActivity() {
   private  lateinit var  profileViewHolder: UserProfileViewModelDiptiL404
    private  lateinit var  profileAdapter: ProfileAdapterDiptil404

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile_list_dipti_l404)

        profileViewHolder =  ViewModelProvider(this).get(UserProfileViewModelDiptiL404::class.java)

        val recyclerView = findViewById<RecyclerView>(R.id.RecyclerView)
        profileAdapter = ProfileAdapterDiptil404()

        recyclerView.adapter = profileAdapter
        recyclerView.layoutManager = LinearLayoutManager(this)

        profileViewHolder.getUserProfiles().observe(this, Observer { profiles ->
            profileAdapter.submitList(profiles)
        })

        profileAdapter.setOnItemClickListener { userProfiless ->
            val intent = Intent(this, SingleProfileActivityDiptiL404::class.java)
            intent.putExtra("USER_PROFILE",userProfiless)
            startActivity(intent)
        }

        profileAdapter.setOnUpdateClickListener { userProfiless ->
            val intent = Intent(this, UpdateProfileActivityDiptiL404::class.java)
            intent.putExtra("USER_PROFILE",userProfiless)
            startActivity(intent)
        }
        profileAdapter.setOnDeleteClickListener { userProfiless ->
            profileViewHolder.deleteUserProfile(userProfiless)

        }

        findViewById<FloatingActionButton>(R.id.addProfileBtn).setOnClickListener {
            val intent = Intent(this, AddProfileActivityDiptiL404::class.java)
            startActivity(intent)





        }
    }
    }
