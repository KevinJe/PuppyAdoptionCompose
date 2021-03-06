/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge.ui

import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
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
