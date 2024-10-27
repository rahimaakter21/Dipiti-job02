package com.example.userregistrationdiptil404

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.userregistrationdiptil404.views_dipti_amad_ict_l4_04.ProfileListActivity_dipti_amad_ict_l4_04

class MainActivity_dipti_amad_ict_l4_04 : AppCompatActivity() {
    private lateinit var listButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_dipti_amad_ict_l4_04)
        listButton = findViewById(R.id.showUserListBtn)

        listButton.setOnClickListener {
            startActivity(Intent(this, ProfileListActivity_dipti_amad_ict_l4_04::class.java))
            finish()
        }
    }
}