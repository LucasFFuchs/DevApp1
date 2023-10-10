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



var metros = Global.altura.toDouble()

var taxa1 : Double = 66 + (13.7 * Global.peso) + (5 * Global.altura) - (6.8 * Global.idade)
var taxa2 : Double = 655 + (9.6 * Global.peso) + (1.1 * Global.altura) - (4.7 * Global.idade)

var taxaM = String.format("%.2f", taxa1)
var taxaF = String.format("%.2f", taxa2)


@Composable
fun Metas() {

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = colorResource(id = R.color.fundo)
    ) {
        Column() {
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
            Divider(color = Color.White)

            Text(
                text = ("Peso: " + Global.peso + " kg"),
                modifier = Modifier.padding(top = 15.dp, start = 5.dp),
                style = TextStyle(fontSize = 30.sp),
                color = colorResource(id = R.color.letras),
            )

            Text(
                text = ("Altura: " + metros/100 + " m"),
                style = TextStyle(fontSize = 30.sp),
                color = colorResource(id = R.color.letras),
                modifier = Modifier.padding(start = 5.dp)
            )
            Divider(modifier = Modifier.padding(vertical = 25.dp), color = Color.White)

            Text(

                text = ("Taxa metabólica basal:\n" +if (Global.genero == "M"){
                    taxaM + " kcal"
                }else {
                    taxaF + " kcal"
                }),

                style = TextStyle(fontSize = 30.sp),
                color = colorResource(id = R.color.letras),
                modifier = Modifier.padding(start = 5.dp)
            )

            Text(
                text = "Quilos a perder:\nXX kg",
                modifier = Modifier.padding(top = 105.dp, start = 5.dp),
                style = TextStyle(fontSize = 30.sp),
                color = colorResource(id = R.color.letras)
            )
            Text(
                text = "Distância a correr\nXX km",
                modifier = Modifier.padding(top = 105.dp, start = 5.dp),
                style = TextStyle(fontSize = 30.sp),
                color = colorResource(id = R.color.letras)
            )
        }
    }
}