package com.example.deliveryprojectstructuredemo.network

import com.example.deliveryprojectstructuredemo.common.ApiConstants
import com.example.deliveryprojectstructuredemo.data.request.LoginRequest
import com.example.deliveryprojectstructuredemo.data.request.SignUpRequest
import com.example.deliveryprojectstructuredemo.data.response.LoginResponse
import com.example.deliveryprojectstructuredemo.data.response.SignUpResponse
import com.delivery_app.core.model.NetworkError
import com.slack.eithernet.ApiResult
import retrofit2.http.Body
import retrofit2.http.POST

interface APIService {

    @POST(ApiConstants.LOGIN)
    suspend fun userLogin(@Body loginRequest: LoginRequest):ApiResult<LoginResponse,NetworkError>

    @POST(ApiConstants.SIGNUP)
    suspend fun userSignUp(@Body signUpRequest: SignUpRequest):ApiResult<SignUpResponse,NetworkError>
}