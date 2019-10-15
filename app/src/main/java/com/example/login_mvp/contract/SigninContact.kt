package com.example.login_mvp.contract

interface SigninContact {
    interface View {
         fun errorMessage(text: String)
         fun checkLetterEmail(text:String)
    }

    interface Presenter {

    }
}