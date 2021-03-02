package com.example.androiddevchallenge.ui

import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.androiddevchallenge.MainViewModel
import com.example.androiddevchallenge.data.PuppiesProvider

var showHomeTitle by mutableStateOf(true)

@Composable
fun HomePage() {
    if (showHomeTitle) {
        Scaffold(
            topBar = {
                TopAppBar(
                    title = {
                        Text(
                            text = "Puppies Home",
                        )
                    },
                    backgroundColor = Color.Transparent, elevation = 0.dp
                )
            }
        ) {
            PuppyHome()
        }
    } else {
        PuppyHome()
    }
}

@Composable
fun PuppyHome() {
    val viewModel: MainViewModel = viewModel()
    val currentPuppy = viewModel.currentPuppy
    PuppyList(PuppiesProvider.puppyList) { puppy ->
        if (currentPuppy == null) {
            showHomeTitle = false
            viewModel.puppyDetail(puppy)
        }
    }

    if (currentPuppy != null) {
        DetailPage(currentPuppy)
    }
}

@Preview
@Composable
fun PreviewHomePage() {
    HomePage()
}
