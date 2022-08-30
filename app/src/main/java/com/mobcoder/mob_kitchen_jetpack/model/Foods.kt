package com.mobcoder.mob_kitchen_jetpack.model

import com.mobcoder.mob_kitchen_jetpack.R

data class Foods(
    val foodName: String? = null,
    val foodPrice: Int = 0,
    val foodImage: Int = R.drawable.ic_launcher_background,
    val foodCount: Int = 0
)
