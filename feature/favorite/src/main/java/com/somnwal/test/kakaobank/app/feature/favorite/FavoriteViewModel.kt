package com.somnwal.test.kakaobank.app.feature.favorite

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.somnwal.test.kakaobank.app.core.domain.usecase.GetFavoriteListUseCase
import com.somnwal.test.kakaobank.app.core.domain.usecase.UpdateIsFavoriteUseCase
import com.somnwal.test.kakaobank.app.data.model.search.SearchData
import com.somnwal.test.kakaobank.app.feature.favorite.state.FavoriteUiState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class FavoriteViewModel @Inject constructor(
    private val getFavoriteListUseCase: GetFavoriteListUseCase,
    private val updateIsFavoriteUseCase: UpdateIsFavoriteUseCase
) : ViewModel() {

    val uiState: StateFlow<FavoriteUiState> =
        getFavoriteListUseCase()
            .map<List<SearchData>, FavoriteUiState> { favoriteList ->
                FavoriteUiState.Success(
                    data = favoriteList
                )
            }.catch { err ->
                _errorState.emit(err)
            }.stateIn(
                scope = viewModelScope,
                started = SharingStarted.WhileSubscribed(5_000),
                initialValue = FavoriteUiState.Idle
            )

    private val _errorState = MutableSharedFlow<Throwable>()

    val errorState
        get() = _errorState.asSharedFlow()

    fun updateIsFavorite(searchData: SearchData) {
        viewModelScope.launch {
            updateIsFavoriteUseCase(searchData, !searchData.isFavorite)
        }
    }
}