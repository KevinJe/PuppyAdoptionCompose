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
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.data.Puppy

@Composable
fun PuppyList(puppies: List<Puppy>, onClick: (Puppy) -> Unit = {}) {
    LazyColumn(contentPadding = PaddingValues(10.dp)) {
        items(puppies) { puppy ->
            PuppyItem(
                puppy,
                Modifier.padding(10.dp)
                    .clickable {
                        onClick(puppy)
                    }.fillMaxWidth()
            )
        }
    }
}

@Composable
fun PuppyItem(puppy: Puppy, modifier: Modifier = Modifier) {
    MaterialTheme() {
        val typography = MaterialTheme.typography
        Card(modifier = modifier, elevation = 3.dp) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Image(
                    painterResource(puppy.image),
                    puppy.name,
                    Modifier.size(150.dp).clip(RoundedCornerShape(5.dp)),
                    contentScale = ContentScale.Crop,
                )
                Column(Modifier.padding(10.dp)) {
                    Text(puppy.name, style = typography.h4)
                    Text("age: ${puppy.age} years old")
                    Text("Height: ${puppy.height} inches")
                    Text("Weight: ${puppy.weight} pounds")
                }
            }
        }
    }
}
