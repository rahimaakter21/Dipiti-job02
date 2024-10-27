package com.example.userregistrationdiptil404.views_dipti_amad_ict_l4_04

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.userregistrationdiptil404.Adapter_dipti_amad_ict_l4_04.ProfileAdapterDiptil404
import com.example.userregistrationdiptil404.R
import com.example.userregistrationdiptil404.viewmodel_dipti_amad_ict_l4_04.UserProfileViewModel_dipti_amad_ict_l4_04
import com.google.android.material.floatingactionbutton.FloatingActionButton

class ProfileListActivity_dipti_amad_ict_l4_04 : AppCompatActivity() {
   private  lateinit var  profileViewHolder: UserProfileViewModel_dipti_amad_ict_l4_04
    private  lateinit var  profileAdapter: ProfileAdapterDiptil404

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile_list_dipti_amad_ict_l4_04)

        profileViewHolder =  ViewModelProvider(this).get(UserProfileViewModel_dipti_amad_ict_l4_04::class.java)

        val recyclerView = findViewById<RecyclerView>(R.id.RecyclerView)
        profileAdapter = ProfileAdapterDiptil404()

        recyclerView.adapter = profileAdapter
        recyclerView.layoutManager = LinearLayoutManager(this)

        profileViewHolder.getUserProfiles().observe(this, Observer { profiles ->
            profileAdapter.submitList(profiles)
        })

        profileAdapter.setOnItemClickListener { userProfiless ->
            val intent = Intent(this, SingleProfileActivity_dipti_amad_ict_l4_04::class.java)
            intent.putExtra("USER_PROFILE",userProfiless)
            startActivity(intent)
        }

        profileAdapter.setOnUpdateClickListener { userProfiless ->
            val intent = Intent(this, UpdateProfileActivity_dipti_amad_ict_l4_04::class.java)
            intent.putExtra("USER_PROFILE",userProfiless)
            startActivity(intent)
        }
        profileAdapter.setOnDeleteClickListener { userProfiless ->
            profileViewHolder.deleteUserProfile(userProfiless)

        }

        findViewById<FloatingActionButton>(R.id.addProfileBtn).setOnClickListener {
            val intent = Intent(this, AddProfileActivity_dipti_amad_ict_l4_04::class.java)
            startActivity(intent)





        }
    }
    }
