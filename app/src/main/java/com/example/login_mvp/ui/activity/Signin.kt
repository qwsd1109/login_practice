package com.example.login_mvp.ui.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.login_mvp.R
import com.example.login_mvp.contract.SigninContact
import kotlinx.android.synthetic.main.activity_signin.*

class Signin : AppCompatActivity(), SigninContact.View {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signin)
        signin_tv_signup.setOnClickListener {
            val nextIntent = Intent(this, Signup::class.java)
            startActivity(nextIntent)
        }
    }
}
