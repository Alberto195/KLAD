package com.example.finema.ui.higherlower;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\r\u001a\u00020\u0011J\b\u0010\u0012\u001a\u00020\u0011H\u0014R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/example/finema/ui/higherlower/HigherLowerViewModel;", "Lcom/example/finema/ui/base/BaseViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "_movies", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/finema/models/movieResponse/MovieResponse;", "api", "Lcom/example/finema/api/MoviesApi;", "job", "Lkotlinx/coroutines/Job;", "movies", "getMovies", "()Landroidx/lifecycle/MutableLiveData;", "repository", "Lcom/example/finema/api/MoviesRepository;", "", "onCleared", "app_debug"})
public final class HigherLowerViewModel extends com.example.finema.ui.base.BaseViewModel {
    private final com.example.finema.api.MoviesApi api = null;
    private final com.example.finema.api.MoviesRepository repository = null;
    private kotlinx.coroutines.Job job;
    private final androidx.lifecycle.MutableLiveData<com.example.finema.models.movieResponse.MovieResponse> _movies = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.example.finema.models.movieResponse.MovieResponse> getMovies() {
        return null;
    }
    
    public final void getMovies() {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public HigherLowerViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
}