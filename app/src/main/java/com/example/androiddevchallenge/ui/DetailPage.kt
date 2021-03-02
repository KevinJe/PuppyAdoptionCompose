package com.example.androiddevchallenge.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
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
        enabled = !puppy.adopted, modifier = Modifier
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
    AlertDialog(onDismissRequest = {
        showConfirmDialog = false
    },
        text = {
            Text(
                text = "Do you want to adopt this lovely dog?",
                style = MaterialTheme.typography.body2
            )
        },
        confirmButton = {
            Button(onClick = {
                showConfirmDialog = false
                puppy.adopted = true
            }) {
                Text(
                    text = "Yes"
                )
            }
        },
        dismissButton = {
            Button(onClick = {
                showConfirmDialog = false
                puppy.adopted = false
            }) {
                Text(
                    text = "NO"
                )
            }
        }
    )
}