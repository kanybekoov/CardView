package com.example.cardview.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Affirmations(
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int
) {


}