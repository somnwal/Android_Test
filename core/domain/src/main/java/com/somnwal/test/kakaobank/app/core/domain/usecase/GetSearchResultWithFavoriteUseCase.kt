package com.somnwal.test.kakaobank.app.core.domain.usecase

import com.somnwal.test.kakaobank.app.data.model.search.SearchData
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.combine
import javax.inject.Inject

class GetSearchResultWithFavoriteUseCase @Inject constructor(
    private val searchRepository: SearchRepository,
    private val favoriteRepository: FavoriteRepository
) {
    operator fun invoke(
        query: String,
        page: Int,
        sort: String = "recency"
    ): Flow<List<SearchData>> = searchRepository.getSearchResult(query, page, sort)
        .withFavoriteList(favoriteRepository.favoriteList)

    private fun Flow<List<SearchData>>.withFavoriteList(favoriteList: Flow<List<SearchData>>): Flow<List<SearchData>> =
        combine(favoriteList) { searchResult, favoriteResult ->
            searchResult.map {
                it.apply {
                    this.isFavorite = this in favoriteResult
                }
            }
        }
}