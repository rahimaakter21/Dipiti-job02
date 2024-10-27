package com.example.userregistrationdiptil404.views

import android.app.DatePickerDialog
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.ViewModelProvider
import com.example.userregistrationdiptil404.ModelsDiptiL404.UserProfileDiptiL4
import com.example.userregistrationdiptil404.R
import com.example.userregistrationdiptil404.viewmodeldiptil404.UserProfileViewModelDiptiL404
import java.util.Calendar

class AddProfileActivityDiptiL404 : AppCompatActivity() {
    private  lateinit var   profileViewModel: UserProfileViewModelDiptiL404
    private  lateinit var  nameTxt: EditText
    private  lateinit var  emailTxt: EditText
    private  lateinit var  dobTxt: EditText
    private  lateinit var  districtTxt: EditText
    private  lateinit var  mobileTxt: EditText
    private  lateinit var  saveBtn: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_profile_dipti_l404)

        profileViewModel = ViewModelProvider(this).get(UserProfileViewModelDiptiL404::class.java)

        nameTxt = findViewById(R.id.profileNameEt)
        emailTxt = findViewById(R.id.emailEt)
        dobTxt = findViewById(R.id.dobEt)

        dobTxt.setOnClickListener{
            showDatePickerDialog()
        }
        districtTxt = findViewById(R.id.districtEt)
        mobileTxt = findViewById(R.id.mobileEt)

        saveBtn = findViewById(R.id.addBtn)
        saveBtn.setOnClickListener{

            val name = nameTxt.text.toString().trim()
            val email = emailTxt.text.toString().trim()
            val dob = dobTxt.text.toString().trim()
            val district = districtTxt.text.toString().trim()
            val mobile = mobileTxt.text.toString().trim()
            val userProfile = UserProfileDiptiL4(name = name, email=email, dob=dob, district=district, mobile=mobile)
            profileViewModel.insertUserProfile(userProfile)
            finish()
        }

    }

    private fun showDatePickerDialog() {
        val calendar = Calendar.getInstance()
        val year = calendar.get(Calendar.YEAR)
        val month = calendar.get(Calendar.MONTH)
        val day = calendar.get(Calendar.DAY_OF_MONTH)
        val datePickerDialog = DatePickerDialog(this, { _, selectedYear, selectedMonth, selectedDay ->
            val date = "$selectedDay/${selectedMonth + 1}/$selectedYear"
            dobTxt.setText(date)
        }, year, month, day)

        datePickerDialog.show()

    }

}