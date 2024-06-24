package com.somnwal.test.kakaobank.app.core.domain.usecase

import com.somnwal.test.kakaobank.app.data.model.search.SearchData
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class GetFavoriteListUseCase @Inject constructor(
    private val favoriteRepository: FavoriteRepository
) {
    operator fun invoke() : Flow<List<SearchData>> = favoriteRepository.favoriteList.map { favoriteList ->
        favoriteList.map {
            it.apply {
                isFavorite = true
            }
        }
    }
}