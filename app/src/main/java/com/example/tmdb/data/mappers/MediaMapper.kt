package com.example.tmdb.data.mappers

import com.example.tmdb.data.cache.models.MediaEntity
import com.example.tmdb.data.models.MovieDetailResponse
import com.example.tmdb.data.models.TvShowDetailResponse
import javax.inject.Inject

class MediaMapper @Inject constructor() {

    fun map(model: TvShowDetailResponse): MediaEntity {
        return MediaEntity(
            model.id,
            "tv",
            model.name,
            model.firstAirDate,
            model.overview,
            model.voteAverage,
            model.posterPath ?: "",
            model.backdropPath ?: ""
        )
    }

    fun map(model: MovieDetailResponse): MediaEntity {
        return MediaEntity(
            model.id,
            "movie",
            model.title,
            model.releaseDate,
            model.overview,
            model.voteAverage,
            model.posterPath ?: "",
            model.backdropPath ?: ""
        )
    }
}