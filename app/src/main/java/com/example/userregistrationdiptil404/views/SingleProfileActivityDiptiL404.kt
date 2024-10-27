package com.example.userregistrationdiptil404.views

import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.ViewModelProvider
import com.example.userregistrationdiptil404.ModelsDiptiL404.UserProfileDiptiL4
import com.example.userregistrationdiptil404.R
import com.example.userregistrationdiptil404.viewmodeldiptil404.UserProfileViewModelDiptiL404

class SingleProfileActivityDiptiL404 : AppCompatActivity() {
    private  lateinit var  userProfile: UserProfileDiptiL4
    private lateinit var  nameTxt: TextView
    private lateinit var  emailTxt: TextView
    private lateinit var  dobTxt: TextView
    private lateinit var  districtTxt: TextView
    private lateinit var  mobileTxt: TextView
    private  lateinit var updateBtn: ImageButton
    private  lateinit var deleteBtn: ImageButton

    private  lateinit var  profileViewHolder: UserProfileViewModelDiptiL404


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_single_profile_dipti_l404)

        profileViewHolder = ViewModelProvider(this).get(UserProfileViewModelDiptiL404::class.java)
        userProfile  = intent.getSerializableExtra("USER_PROFILE") as UserProfileDiptiL4


        nameTxt = findViewById(R.id.nameTxt)
        emailTxt = findViewById(R.id.emailTxt)
        dobTxt = findViewById(R.id.dobTxt)
        districtTxt = findViewById(R.id.districtTxt)
        mobileTxt = findViewById(R.id.mobileTxt)
        updateBtn= findViewById(R.id.editBtn)
        deleteBtn = findViewById(R.id.deleteBtn)

        updateBtn.setOnClickListener {
            val intent = android.content.Intent(this, UpdateProfileActivityDiptiL404::class.java)
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
