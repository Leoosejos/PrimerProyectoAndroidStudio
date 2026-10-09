package com.example.myapplication.composables

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.R

@Preview
@Composable
fun ImageExample(){
    Image(
        painter = painterResource(R.drawable.whatsapp_image),
        contentDescription = "Imagen de ejemplo"
    )
}