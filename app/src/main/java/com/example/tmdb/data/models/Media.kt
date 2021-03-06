package com.example.tmdb.data.models


import com.google.gson.annotations.SerializedName

data class Media(
    @SerializedName("adult")
    val adult: Boolean,
    @SerializedName("backdrop_path")
    val backdropPath: String?,
    @SerializedName("genre_ids")
    val genreIds: List<Int>,
    @SerializedName("id")
    val id: Int,
    @SerializedName("original_language")
    val originalLanguage: String,
    @SerializedName("original_title")
    val originalTitle: String,
    @SerializedName("overview")
    val overview: String,
    @SerializedName("poster_path")
    val posterPath: String?,
    @SerializedName("release_date")
    val releaseDate: String,
    @SerializedName("title")
    val title: String,
    @SerializedName("video")
    val video: Boolean,
    @SerializedName("vote_average")
    val voteAverage: Double,
    @SerializedName("vote_count")
    val voteCount: Int,
    @SerializedName("popularity")
    val popularity: Double,
    @SerializedName("media_type")
    val mediaType: String,
    @SerializedName("original_name")
    val originalName: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("first_air_date")
    val firstAirDate: String,
    @SerializedName("origin_country")
    val originCountry: List<String>
)