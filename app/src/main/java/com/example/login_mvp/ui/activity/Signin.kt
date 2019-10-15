package com.example.login_mvp.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.login_mvp.R
import com.example.login_mvp.contract.SigninContact
import com.example.login_mvp.presenter.SigninPresenter
import kotlinx.android.synthetic.main.activity_signin.*

class Signin : AppCompatActivity(), View.OnClickListener,SigninContact.View {



    private lateinit var presenter: SigninPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signin)

        presenter = SigninPresenter(this)
        initViewListener()
        /*
        signin_tv_signup.setOnClickListener {
            val nextIntent = Intent(this, Signup::class.java)
            startActivity(nextIntent)
        }*/

    }

    private fun initViewListener() {
        signin_tv_signup.setOnClickListener(this)
        sigin_btn_signin.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        if(view?.id == R.id.sigin_btn_signin){
            presenter.checkLetterEmail(signin_edit_id.getText().toString())

        }
    }
    override fun errorMessage(text: String) {
        layname.setError(text)
    }
    override fun checkLetterEmail(text: String) {
        layname.setError(text)
    }
}
