package com.example.login_mvp.contract

interface SigninContact {
    interface View {
         fun errorMessage(text: String)
        fun checkLetterCount(text:String)
    }

    interface Presenter {

    }
}