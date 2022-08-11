package com.softprodigy.deliveryapp.ui.features.create_new_password


sealed class ResetPasswordUIEvent {

    data class Submit(val token: String, val password: String) : ResetPasswordUIEvent()

}