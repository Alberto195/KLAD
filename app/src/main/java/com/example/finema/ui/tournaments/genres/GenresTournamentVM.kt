package com.example.finema.ui.tournaments.genres

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.finema.api.MoviesRepository
import com.example.finema.database.DatabaseRepository
import com.example.finema.models.GenreRequest.GenreList
import com.example.finema.models.databaseModels.GenreModel
import com.example.finema.database.room.RoomRepository
import com.example.finema.models.movieResponse.Movie
import com.example.finema.ui.base.BaseViewModel
import com.example.finema.util.AppPreference
import com.example.finema.util.Coroutines
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class GenresTournamentVM (
    private val apiRepository: MoviesRepository,
    private val DBRepository: RoomRepository
) : BaseViewModel() {

    init {
        getGenres {
            AppPreference.setGeneratedGenres(true)
        }
    }

    // TODO Убрать, данные получаются от репозитория
    val allGenres: LiveData<List<GenreModel>>
        get() {
            return DBRepository.allGenres
        }

    val genreModel: (String) -> Unit = { genre ->
        getMovies(genre)
    }

    var filmListVM = MutableLiveData<List<Movie>>()
    var genreListVM = MutableLiveData<GenreList>()

    fun signOut() {
        DBRepository.signOut()
    }

    fun getGenres(onSuccess:() -> Unit){
        job = Coroutines.ioThenMan(
            { repository.getGenres() },
            { genreListVM.value = it }
        )
        onSuccess()
    }

    fun insert(genreModel: GenreModel) =
        viewModelScope.launch(Dispatchers.Main) {
            DBRepository.insert(genreModel) {
            }
        }
}