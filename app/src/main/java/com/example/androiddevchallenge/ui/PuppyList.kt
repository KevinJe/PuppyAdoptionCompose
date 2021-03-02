package com.example.androiddevchallenge.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
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
            PuppyItem(puppy, Modifier.padding(10.dp)
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


