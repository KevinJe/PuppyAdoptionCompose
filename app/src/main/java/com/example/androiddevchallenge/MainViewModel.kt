package com.example.androiddevchallenge

import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.androiddevchallenge.data.PuppiesProvider
import com.example.androiddevchallenge.data.Puppy

class MainViewModel : ViewModel() {

    val puppies by mutableStateOf(
        PuppiesProvider.puppyList
    )

    var currentPuppy: Puppy? by mutableStateOf(null)

    fun puppyDetail(puppy: Puppy) {
        currentPuppy = puppy
    }

    fun closePage() {
        currentPuppy = null
    }
}