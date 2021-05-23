package com.example.finema.ui.higherlower

import android.app.DownloadManager
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.map
import androidx.lifecycle.viewModelScope
import androidx.paging.PagingData
import androidx.paging.cachedIn
import com.example.finema.models.movieResponse.MovieResponse
import com.example.finema.api.MoviesRepository
import com.example.finema.models.movieResponse.Movie
import com.example.finema.ui.base.BaseViewModel
import com.example.finema.util.Coroutines

class HigherLowerViewModel(
    private val repository: MoviesRepository
) : BaseViewModel() {

    private var _movies = MutableLiveData<MovieResponse>()
    val movies: LiveData<MovieResponse>
    get() = _movies

    var score = RESET_SCORE_INDEX
    var img1 = IMG1_INDEX
    var img2 = IMG2_INDEX
    private var page = DEFAULT_PAGE_INDEX

    init {
        getMovies()
    }

    fun shuffle() {
        _movies.value?.movies.let {
            _movies.value?.movies = it?.shuffled()!!
        }
    }

    private fun getMovies() {
            job = Coroutines.ioThenMan(
                { repository.getMovies(page) },
                { _movies.value = it }
            )
    }

    private fun clickedRight() {
        score += ADD_SCORE_POINT
        changeMovRes()
    }

    private fun clickedWrong() {
        score = RESET_SCORE_INDEX
        page = DEFAULT_PAGE_INDEX
        getMovies()
    }

    private fun changeMovRes() {
        if(score % MOVIE_SIZE_RESET == 0) {
            page += NEXT_PAGE
            getMovies()
        } else {
            _movies.value?.movies = _movies.value?.movies?.drop(1)!!
            _movies.value = _movies.value
        }
    }

    fun onMovieClicked(position: Int) {
        when(position){
            img1 ->
                if (movies.value?.movies?.get(img1)?.popularity!!
                    >= movies.value?.movies?.get(img2)?.popularity!!
                ) {
                    clickedRight()
                } else {
                    clickedWrong()
                }
            img2 ->
                if (movies.value?.movies?.get(img2)?.popularity!!
                    >= movies.value?.movies?.get(img1)?.popularity!!
                ) {
                    clickedRight()
                } else {
                    clickedWrong()
                }
        }
    }

    companion object {
        const val DEFAULT_PAGE_INDEX = 1
        const val RESET_SCORE_INDEX = 0
        const val ADD_SCORE_POINT = 1
        const val NEXT_PAGE = 1
        const val MOVIE_SIZE_RESET = 19
        const val IMG1_INDEX = 0
        const val IMG2_INDEX = 1
    }
}
