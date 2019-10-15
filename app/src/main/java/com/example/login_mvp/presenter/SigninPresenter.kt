package com.example.login_mvp.presenter

import com.example.login_mvp.contract.SigninContact

class SigninPresenter(private val view: SigninContact.View) : SigninContact.Presenter {

    fun checkLetterCount(length: Int) {
        when (length) {
            in 1..20 -> view.checkLetterCount("")
            0 -> {
                view.checkLetterCount("비밀번호를 입력해주시길 바랍니다.")
            }

        }
    }
    fun errorMessage(email: String) {

            if (android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()){
                view.errorMessage("")
            }
            else{
                view.errorMessage("이메일 형식대로 입력해주시기 바랍니다.")
            }
    }
}