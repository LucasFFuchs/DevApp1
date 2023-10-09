package com.example.projetofinal

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import com.example.projetofinal.HomePage
import com.example.projetofinal.Global

@Composable
fun Metas() {

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = colorResource(id = R.color.fundo)
    ){
        Button(onClick = { Global.screen = 0 }) {}
    }
}