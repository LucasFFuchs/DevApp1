package com.example.projetofinal

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.Alignment

@Composable
fun Historico() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = colorResource(id = R.color.fundo)
    ) {
        Column {
            Row {
                Button(
                    onClick = { Global.screen = 0 },
                    border = BorderStroke(width = 3.dp, color = Color.Black),
                    colors = ButtonDefaults.buttonColors(containerColor = colorResource(id = R.color.fundo))
                ) {
                    Icon(
                        imageVector = Icons.Default.Home,
                        tint = colorResource(id = R.color.letras),
                        contentDescription = ""
                    )
                }
                Image(
                    painter = painterResource(id = R.drawable.logo),
                    contentDescription = ""
                )
            }
            Divider()

            Text(
                text = ("Dados do mês " + mes()),
                color = colorResource(id = R.color.letras),
                modifier = Modifier.align(Alignment.CenterHorizontally),
                style = TextStyle(fontSize = 40.sp)
            )
            Text(
                text = "Quilômetros percorridos:\nXX km",
                modifier = Modifier.padding(top = 15.dp, start = 10.dp),
                style = TextStyle(fontSize = 30.sp),
                color = colorResource(id = R.color.letras),
            )
            Text(
                text = "Velocidade média\nXX km/h",
                modifier = Modifier.padding(top = 105.dp, start = 10.dp),
                style = TextStyle(fontSize = 30.sp),
                color = colorResource(id = R.color.letras)
            )
            Text(
                text = "Calorias gastas:\nXX kcal",
                modifier = Modifier.padding(top = 105.dp, start = 10.dp),
                style = TextStyle(fontSize = 30.sp),
                color = colorResource(id = R.color.letras)
            )
        }
    }
}