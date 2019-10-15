package com.example.login_mvp.contract

interface SignupContact {
    interface View {
        fun errorMessage(text: String)
        fun checkLetterCount(text:String)
        fun checkPWmatch(text:String)
        fun errorUsername(text:String)
        fun checkCode(text:String)
    }

    interface Presenter {

    }
}