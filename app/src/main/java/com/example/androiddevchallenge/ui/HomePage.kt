package com.example.androiddevchallenge.ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.tooling.preview.Preview
import com.example.androiddevchallenge.data.PuppiesProvider

@Composable
fun HomePage() {
    val coroutineScope = rememberCoroutineScope()
//    Scaffold(
//        topBar = {
//            TopAppBar(
//                title = {
//                    Text("Puppy Home")
//                }
//            )
//        }
//    )
    PuppyList(PuppiesProvider.puppyList)
}

@Preview
@Composable
fun PreviewHomePage() {
    HomePage()
}
