package com.example.myapplication.composables

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun ColimnExample(){
    Column(modifier = Modifier.size(150.dp), horizontalAlignment = Alignment.End) {
        Text("Hola 1")
        Text("Hola 2")
        Text("Hola 3")
        Text("Hola 4")
        Text("Hola 5")
        Text("Hola 6")
    }
}