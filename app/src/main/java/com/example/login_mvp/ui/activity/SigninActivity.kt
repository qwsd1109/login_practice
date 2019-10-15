package com.example.login_mvp.ui.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.login_mvp.R
import com.example.login_mvp.contract.SigninContact
import com.example.login_mvp.presenter.SigninPresenter
import kotlinx.android.synthetic.main.activity_signin.*

class SigninActivity : AppCompatActivity(), View.OnClickListener,SigninContact.View {



    private lateinit var presenter: SigninPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signin)

        presenter = SigninPresenter(this)
        initViewListener()
    }

    private fun initViewListener() {
        signin_tv_signup.setOnClickListener(this)
        sigin_btn_signin.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        if(view?.id == R.id.sigin_btn_signin){
            presenter.errorMessage(signin_edit_id.getText().toString())
            presenter.checkLetterCount(signin_edit_password.getText()!!.length)
        }/*else{
            서버연동 성공시 인텐트해주기
            val nextIntent = Intent(this, MainActivity::class.java)
            startActivity(nextIntent)
        }*/
        if(view?.id==R.id.signin_tv_signup){
            val nextIntent = Intent(this, SignupActivity::class.java)
            startActivity(nextIntent)
        }
    }
    override fun checkLetterCount(text: String) {
        sigin_laypassword.setError(text)
    }
    override fun errorMessage(text: String) {
        sigin_layname.setError(text)
    }
}
