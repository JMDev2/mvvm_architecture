package com.example.mvvm.Network

import com.example.mvvm.Model.MovieModel
import retrofit2.Call
import retrofit2.http.GET

interface APIService {
    @GET("/photos")
    fun getMovieList():  Call<MutableList<MovieModel>>
}