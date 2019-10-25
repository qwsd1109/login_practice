package com.example.login_mvp.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.login_mvp.R
import com.example.login_mvp.contract.SignupContact
import com.example.login_mvp.presenter.SignupPresenter
import kotlinx.android.synthetic.main.activity_signup.*

class SignupActivity : AppCompatActivity(), View.OnClickListener, SignupContact.View {


    private lateinit var presenter: SignupPresenter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)
        presenter = SignupPresenter(this)
        initViewListener()
    }

    private fun initViewListener() {
        signup_btn_signup.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        if (view?.id == R.id.signup_btn_signup) {
            presenter.chckckContents(
                signup_edit_id.getText().toString(),
                signup_edit_password.getText()!!.length,
                signup_edit_password.getText().toString(),
                signup_edit_passwordck.getText().toString(),
                signup_edit_user.getText().toString(),
                signup_edit_code.getText().toString()
            )
            /*presenter.errorMessage(signup_edit_id.getText().toString())
            presenter.checkLetterCount(signup_edit_password.getText()!!.length)
            presenter.checkPWmatch(signup_edit_password.getText().toString(),signup_edit_passwordck.getText().toString())
            presenter.errorUsername(signup_edit_user.getText().toString())
            presenter.checkCode(signup_edit_code.getText().toString())*/
        }
    }

    override fun checkPWmatch(text: String) {
        sigup_laypasswordck.setError(text)
    }

    override fun checkLetterCount(text: String) {
        sigup_vlaypassword.setError(text)
    }

    override fun errorMessage(text: String) {
        sigup_layname.setError(text)
    }

    override fun errorUsername(text: String) {
        sigup_layuser.setError(text)
    }

    override fun checkCode(text: String) {
        sigup_laycode.setError(text)
    }
}
