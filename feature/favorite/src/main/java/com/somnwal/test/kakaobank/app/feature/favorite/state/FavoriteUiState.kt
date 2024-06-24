package com.somnwal.test.kakaobank.app.feature.favorite.state

import androidx.compose.runtime.Immutable
import com.somnwal.test.kakaobank.app.data.model.search.SearchData

sealed interface FavoriteUiState {

    @Immutable
    data object Idle: FavoriteUiState

    @Immutable
    data object Loading: FavoriteUiState

    @Immutable
    data object Empty: FavoriteUiState

    @Immutable
    data class Success(
        val data: List<SearchData>
    ) : FavoriteUiState
}