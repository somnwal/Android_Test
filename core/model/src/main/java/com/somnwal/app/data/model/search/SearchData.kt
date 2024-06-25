package com.somnwal.app.data.model.search

import kotlinx.serialization.Serializable

@Serializable
enum class SearchDataType {
    IMAGE,
    VIDEO
}

@Serializable
data class SearchResult (
    val isNextPageExist: Boolean,
    val resultList: List<SearchData>
)

@Serializable
data class SearchData (
    val type: SearchDataType,
    val title: String,

    val thumbnailUrl: String,
    val url: String,

    val datetime: String,
    var isFavorite: Boolean = false
)

