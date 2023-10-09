package com.example.projetofinal

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import com.example.projetofinal.Global
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource

@Composable
fun Dia() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = colorResource(id = R.color.fundo)
    ){
        Button(onClick = { Global.screen = 0 }) {}
    }

}