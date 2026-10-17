package com.example.myapplication.composables

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun CounterScreen (modifier: Modifier = Modifier) {
    var counter by rememberSaveable() { mutableStateOf(23) }
    var counter2 by rememberSaveable() { mutableStateOf(16) }
    var name by remember { mutableStateOf("") }
    Column() {
        Counter(modifier, counter, onIncrement = {counter++})
        Counter(modifier, counter2, onIncrement = {counter2++})
        TextFielCounter(name = name, onValueChange = {myText -> name = myText})
    }
}

@Composable
fun Counter(modifier: Modifier = Modifier,
            counter: Int,
            onIncrement:()-> Unit

){
    Column(modifier = modifier.padding(30.dp)) {
        Text("Pulsaciones: $counter")

        Button(onClick = {onIncrement()}) {
            Text("Sumar")
        }
    }
}

@Composable
fun TextFielCounter(modifier: Modifier = Modifier,
                    name: String,
                    onValueChange:(String)-> Unit) {
    TextField(
        value = name,
        onValueChange = {onValueChange(it)},
        label = {Text("Example")}
    )
}
