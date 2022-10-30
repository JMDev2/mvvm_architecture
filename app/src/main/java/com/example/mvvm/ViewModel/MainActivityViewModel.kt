package com.example.mvvm.ViewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.mvvm.Model.MovieModel
import com.example.mvvm.Repositories.MainRepo

class MainActivityViewModel: ViewModel() {
    private val mainRepo: MainRepo
    val getMovieList: LiveData<MutableList<MovieModel>>
    get() = mainRepo.getMovieModelLiveData

    init {
        mainRepo = MainRepo()
    }

}