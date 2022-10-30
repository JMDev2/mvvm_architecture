package com.example.mvvm.Common

import com.example.mvvm.Network.APIService
import retrofit2.Retrofit

object Common {
    private const val BASE_URL = "https://jsonplaceholder.typicode.com/"
    val getAPIService: APIService
    get() = com.example.mvvm.Network.Retrofit.getRetrofitClient(BASE_URL).create(APIService::class.java)

}