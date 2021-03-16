package com.eternalengine.wearme

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Wear(
    var name: String = "",
    var firstSubtitle: String = "",
    var lastSubtitle: String = "",
    var photo: Int = 0,
    var detail: String = "",
): Parcelable