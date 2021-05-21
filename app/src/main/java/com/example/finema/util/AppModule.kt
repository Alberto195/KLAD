package com.example.finema.util

import com.example.finema.api.*
import com.example.finema.database.DatabaseRepository
import com.example.finema.database.room.*
import com.example.finema.ui.higherlower.HigherLowerViewModel
import com.example.finema.ui.movieDetail.MovieDetailsViewModel
import com.example.finema.ui.signIn.SignInViewModel
import com.example.finema.ui.tmp.TmpViewModel
import com.example.finema.ui.tournaments.TournamentVM
import com.example.finema.ui.tournaments.genres.GenresTournamentVM
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.module.Module
import org.koin.dsl.module

val viewModelModule: Module = module {

    viewModel { HigherLowerViewModel(get()) }

    viewModel { SignInViewModel() }

    viewModel { TmpViewModel() }

    viewModel { GenresTournamentVM(get(), get()) }

    viewModel { MovieDetailsViewModel(get()) }

    viewModel { TournamentVM() }
}

val apiModule: Module = module {

    single { MoviesApi() }
}

val databaseModule: Module = module {

    single { RoomDataBase.getInstance(androidContext()) }

    single { RoomDataBase.getInstance(androidContext()).getRoomDao() }

}

val repositoryModule: Module = module {

    single { RoomRepository(get()) }

    single { MoviesRepository(get(), get(), androidContext()) }
}
