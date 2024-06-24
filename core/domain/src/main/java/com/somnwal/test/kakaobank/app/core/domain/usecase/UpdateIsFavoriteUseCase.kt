package com.somnwal.test.kakaobank.app.core.domain.usecase

import com.somnwal.test.kakaobank.app.data.model.search.SearchData
import javax.inject.Inject

class UpdateIsFavoriteUseCase @Inject constructor(
    private val favoriteRepository: FavoriteRepository
) {
    suspend operator fun invoke(data: SearchData, isFavorite: Boolean) {
        favoriteRepository.updateFavoriteList(data, isFavorite)
    }
}