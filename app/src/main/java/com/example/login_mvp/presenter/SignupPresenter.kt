package com.example.login_mvp.presenter

import com.example.login_mvp.contract.SignupContact

class SignupPresenter(private val view : SignupContact.View) : SignupContact.Presenter {
    fun checkLetterCount(length: Int) {
        when (length) {
            in 8..20 -> view.checkLetterCount("")
            0 -> {
                view.checkLetterCount("비밀번호를 입력해주시길 바랍니다.")
            }in 1..7 -> {
            view.checkLetterCount("8자이상 20자 이하로 입력해주시길 바랍니다.")
        }

        }
    }
    fun errorMessage(email: String) {

        if (android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            view.errorMessage("")
        } else {
            view.errorMessage("이메일 형식대로 입력해주시기 바랍니다.")
        }
    }
    fun checkPWmatch(pw: String,pwck:String) {

        if (pw==pwck) {
            view.checkPWmatch("")
        } else {
            view.checkPWmatch("비밀번호가 일치하지 않습니다.")
        }
    }

    fun errorUsername(name : String) {
        when (name.length) {
            in 1..20 ->{
                view.errorUsername("")
            }
            0 -> {
                view.errorUsername("이름을 입력해주시길 바랍니다.")
            }
        }
    }

    fun checkCode(code: String) {
        if (code == "021109") {
            view.checkCode("")
        }else{
            view.checkCode("인증코드가 틀렸습니다.")
        }
    }
}