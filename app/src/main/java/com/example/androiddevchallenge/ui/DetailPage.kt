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

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.AlertDialog
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.data.Puppy

var showConfirmDialog by mutableStateOf(false)

@Composable
fun PuppyDetail(puppy: Puppy) {
    Column(
        Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        PuppyHeader(puppy)
        PuppyDesc(puppy)
        PuppyAdoptedButton(puppy)

        if (showConfirmDialog) {
            AdoptConfirmDialog(puppy)
        }
    }
}

@Composable
fun DetailPage(puppy: Puppy) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "Puppy Detail",
                    )
                },
                backgroundColor = Color.Transparent, elevation = 0.dp
            )
        }
    ) {
        PuppyDetail(puppy)
    }
}

@Composable
fun PuppyAdoptedButton(puppy: Puppy) {
    Button(
        onClick = { showConfirmDialog = true },
        enabled = !puppy.adopted,
        modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp, 25.dp)
            .clip(shape = CutCornerShape(15.dp, 0.dp, 15.dp, 0.dp))
    ) {
        Text(text = if (puppy.adopted) "Adopted" else "Adopt", Modifier.padding(5.dp))
    }
}

@Composable
fun PuppyDesc(puppy: Puppy) {
    Column(Modifier.padding(20.dp, 10.dp)) {
        Text(puppy.name, style = MaterialTheme.typography.h4)
        Text(puppy.temperament, style = MaterialTheme.typography.h5)
        Text(
            puppy.desc,
            style = MaterialTheme.typography.body1,
            modifier = Modifier.padding(0.dp, 5.dp)
        )
    }
}

@Composable
fun PuppyHeader(puppy: Puppy) {
    Image(
        painterResource(puppy.image),
        puppy.name,
        Modifier
            .aspectRatio(1.5f)
            .padding(20.dp, 10.dp)
            .clip(RoundedCornerShape(10.dp)),
        contentScale = ContentScale.Crop,
    )
}

@Composable
fun AdoptConfirmDialog(puppy: Puppy) {
    AlertDialog(
        onDismissRequest = {
            showConfirmDialog = false
        },
        text = {
            Text(
                text = "Do you want to adopt this lovely puppy?",
                style = MaterialTheme.typography.body2
            )
        },
        confirmButton = {
            Button(
                onClick = {
                    showConfirmDialog = false
                    puppy.adopted = true
                }
            ) {
                Text(
                    text = "Yes"
                )
            }
        },
        dismissButton = {
            Button(
                onClick = {
                    showConfirmDialog = false
                    puppy.adopted = false
                }
            ) {
                Text(
                    text = "NO"
                )
            }
        }
    )
}
