package com.example.mymovielist.database

import androidx.room.Entity
import androidx.room.vo.Entity
import kotlinx.parcelize.Parcelize

@Entity
@Parcelize
data class Film (
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    var id: Int = 0,

    @ColumnInfo(name = "judul")
    var judul: String? = null,

    @ColumnInfo(name = "genre")
    var genre: String? = null,

    @ColumnInfo(name = "rating")
    var rating: Double? = null,

    @ColumnInfo(name = "poster")
    var poster: String? = null,

    @ColumnInfo(name = "desc")
    var desc: String? = null,

    @ColumnInfo(name = "director")
    var director: String? = null,

    @ColumnInfo(name = "tahunRilis")
    var tahunRilis: Int? = null,
) : Parcelable