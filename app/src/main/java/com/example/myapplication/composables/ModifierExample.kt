package com.example.myapplication.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.R
import java.nio.file.WatchEvent

@Preview(showSystemUi = true)
@Composable
fun ProfileExample(){
    Box(contentAlignment = Alignment.Center,
        modifier = Modifier
            .fillMaxSize()
            .clickable {}
    ){
        Row(modifier = Modifier
            .fillMaxWidth()
            .background(Color.Red)
            .padding(vertical = 8.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceAround
        ){
            Image(
                modifier = Modifier.size(50.dp),
                painter = painterResource(R.drawable.whatsapp_image),
                contentDescription = "Foto de perfil")
            Column(modifier = Modifier

            ){
                Text("Leoosejos")
                Text("Developer")
            }

            Button(onClick = {}
            ){
                Text("Seguir")
            }
        }
    }
}


@Preview
@Composable
fun Test() {
    Column() {
        Box(modifier = Modifier.fillMaxWidth().weight(1f).background(Color.Red))
        Box(modifier = Modifier.fillMaxWidth().weight(1f).background(Color.Blue))
    }
}