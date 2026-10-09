package com.example.myapplication.composables

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun RowExample() {
    Row(modifier = Modifier.size(150.dp), verticalAlignment = Alignment.Bottom) {
        Text("Hola 1")
        Text("Hola 2")
        Text("Hola 3")
        Column() {
            Text("Hola 4")
            Text("Hola 5")
            Text("Hola 6")
        }
    }
}