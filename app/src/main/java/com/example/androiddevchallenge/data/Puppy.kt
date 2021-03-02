package com.example.androiddevchallenge.data

import androidx.annotation.DrawableRes

data class Puppy(
    val id: Int,
    val name: String,
    val age: Int,
    val temperament: String,
    val height: Int,
    val weight: Int,
    val desc: String,
    @DrawableRes val image: Int,
    var adopted: Boolean
)