package com.example.login_mvp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_signin.*

class Signin : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signin)
        signin_tv_signup.setOnClickListener {
            val nextIntent = Intent(this, Signup::class.java)
            startActivity(nextIntent)
        }
    }
}
