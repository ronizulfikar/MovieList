package com.example.mymovielist

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Movie(
    var judul: String,
    var genre: String,
    var rating: String,
    var tahunRilis: String,
    var description: String,
    var poster: String
): Parcelable
