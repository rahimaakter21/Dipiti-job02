package com.example.userregistrationdiptil404.views_dipti_amad_ict_l4_04

import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.userregistrationdiptil404.Models_dipti_amad_ict_l4_04.UserProfile_dipti_amad_ict_l4_04
import com.example.userregistrationdiptil404.R
import com.example.userregistrationdiptil404.viewmodel_dipti_amad_ict_l4_04.UserProfileViewModel_dipti_amad_ict_l4_04

class SingleProfileActivity_dipti_amad_ict_l4_04 : AppCompatActivity() {
    private  lateinit var  userProfile: UserProfile_dipti_amad_ict_l4_04
    private lateinit var  nameTxt: TextView
    private lateinit var  emailTxt: TextView
    private lateinit var  dobTxt: TextView
    private lateinit var  districtTxt: TextView
    private lateinit var  mobileTxt: TextView
    private  lateinit var updateBtn: ImageButton
    private  lateinit var deleteBtn: ImageButton

    private  lateinit var  profileViewHolder: UserProfileViewModel_dipti_amad_ict_l4_04


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_single_profile_dipti_amad_ict_l4_04)

        profileViewHolder = ViewModelProvider(this).get(UserProfileViewModel_dipti_amad_ict_l4_04::class.java)
        userProfile  = intent.getSerializableExtra("USER_PROFILE") as UserProfile_dipti_amad_ict_l4_04


        nameTxt = findViewById(R.id.nameTxt)
        emailTxt = findViewById(R.id.emailTxt)
        dobTxt = findViewById(R.id.dobTxt)
        districtTxt = findViewById(R.id.districtTxt)
        mobileTxt = findViewById(R.id.mobileTxt)
        updateBtn= findViewById(R.id.editBtn)
        deleteBtn = findViewById(R.id.deleteBtn)

        updateBtn.setOnClickListener {
            val intent = android.content.Intent(this, UpdateProfileActivity_dipti_amad_ict_l4_04::class.java)
            intent.putExtra("USER_PROFILE", userProfile)
            startActivity(intent)
        }
        deleteBtn.setOnClickListener{

            profileViewHolder.deleteUserProfile(userProfile)
            finish()
        }
        populateFields()
    }
    private fun populateFields() {
        nameTxt.text = userProfile.name
        emailTxt.text = userProfile.email
        dobTxt.text = userProfile.dob
        districtTxt.text = userProfile.district
        mobileTxt.text = userProfile.mobile
    }
}
