package com.dicoding.tumoranger.api

import com.dicoding.tumoranger.api.request.*
import com.dicoding.tumoranger.api.response.*
import okhttp3.MultipartBody
import okhttp3.RequestBody
import retrofit2.Call
import retrofit2.http.*

interface ApiService {

    @POST("/auth/register")
    fun registerUser(
        @Body request: RegisterRequest
    ): Call<RegisterResponse>

    @POST("/auth/login")
    fun loginUser(
        @Body request: LoginRequest
    ): Call<LoginResponse>
}