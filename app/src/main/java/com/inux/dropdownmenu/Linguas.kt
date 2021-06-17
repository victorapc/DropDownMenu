package com.inux.dropdownmenu

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Linguas(
    val id: Int,
    val descricao: String
) : Parcelable {
    override fun toString(): String {
        return descricao
    }
}
