package com.example.userregistrationdiptil404

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.userregistrationdiptil404.views.ProfileListActivityDiptiL404

class MainActivityDitpiL404 : AppCompatActivity() {
    private lateinit var listButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_dipti_l404)
        listButton = findViewById(R.id.showUserListBtn)

        listButton.setOnClickListener {
            startActivity(Intent(this, ProfileListActivityDiptiL404::class.java))
            finish()
        }
    }
}