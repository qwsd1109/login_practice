package com.example.login_mvp.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.login_mvp.R
import com.example.login_mvp.contract.SignupContact

class Signup : AppCompatActivity() , SignupContact.View{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)
    }
}
