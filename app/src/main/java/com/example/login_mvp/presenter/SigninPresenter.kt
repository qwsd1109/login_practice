package com.example.login_mvp.presenter

import com.example.login_mvp.contract.SigninContact
import com.example.login_mvp.ui.activity.Signin
import java.util.regex.Pattern

class SigninPresenter(private val view: SigninContact.View) : SigninContact.Presenter {

    fun checkLetterCount(length: Int) {
        when (length) {
            in 1..50 -> view.errorMessage("아이디 설정이 완료되었습니다.")
            0 -> {
                view.errorMessage("이메일을 입력해주시기 바랍니다.")
            }

        }
    }
    fun checkLetterEmail(email: String) {

            if (android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()){
                view.errorMessage("")
            }
            else{
                view.errorMessage("이메일 형식대로 입력해주시기 바랍니다.")
            }

    }
}