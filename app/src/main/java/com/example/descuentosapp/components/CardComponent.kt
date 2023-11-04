package com.example.descuentosapp.components

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun dosCard(title1: String , number1 : Double , title2: String , number2: Double){
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly
    ){
        MainCard(title = title1 , number = number1 , modifier = Modifier.padding(start = 30.dp).weight(1f))
        SpaceW()
        MainCard(title = title2 , number = number2 , modifier = Modifier.padding(end = 30.dp).weight(1f))

    }
}

@Composable
fun MainCard(title: String , number: Double , modifier: Modifier){
    Card(
        modifier = Modifier,
        colors = CardDefaults.cardColors(
            containerColor = Color.LightGray
        )
    ){
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .padding(16.dp)
        ){
            Text(text = title , color = Color.Black , fontSize = 20.sp)
            Text(text = "$$number", color = Color.Black , fontSize = 20.sp)

        }
    }
}