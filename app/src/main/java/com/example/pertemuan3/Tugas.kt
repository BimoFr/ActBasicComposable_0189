package com.example.pertemuan3

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource

@Composable
fun LayarLogin(modifier: Modifier = Modifier){
    Box(modifier = modifier.fillMaxSize()) {

    }
}

@Composable
fun LatarGambar(){
    val gambarLatar = painterResource(id = R.drawable.tiumy)
    Image(
        painter = gambarLatar,
        contentDescription = "Background",
        contentScale = ContentScale.Crop,
        modifier = Modifier.fillMaxSize()
    )
}