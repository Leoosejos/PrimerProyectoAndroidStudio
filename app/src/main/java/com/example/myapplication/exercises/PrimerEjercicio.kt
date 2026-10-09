package com.example.myapplication.exercises

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.AlignmentLine
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun PrimerEjercicio(){
    Column(modifier = Modifier.fillMaxSize()){
        Box(modifier = Modifier
            .background(Color.Gray)
            .fillMaxWidth().weight(1f),
            contentAlignment = Alignment.Center
        ){
            Text("Texto 1")
        }
        Row(modifier = Modifier
            .fillMaxWidth()
            .size(300.dp),
        ){
            Box(modifier = Modifier
                .background(Color.Red)
                .fillMaxWidth().weight(7f)
                .size(300.dp),
                contentAlignment = Alignment.Center
            ){
                Text("Texto 2")
            }
            Box(modifier = Modifier
                .background(Color.Yellow)
                .fillMaxWidth().weight(7f)
                .size(300.dp),
                contentAlignment = Alignment.Center
            ){
                Text("Texto 3")
            }
        }
        Box(modifier = Modifier
            .background(Color.Blue)
            .fillMaxWidth().weight(1f),
            contentAlignment = Alignment.BottomCenter
        ){
            Text("Texto 4")
        }
    }
}