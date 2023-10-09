package com.example.projetofinal


import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp


class Global {
    companion object {
        var screen by mutableStateOf(0)
    }
}

@Composable
fun HomePage() {
    when (Global.screen) {
        0 -> {
            Surface(
                modifier = Modifier.fillMaxSize(),
                color = colorResource(id = R.color.fundo)
            ) {
                Column {
                    Column {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(top = 5.dp, start = 5.dp)
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.user),
                                contentDescription = ""
                            )
                            Text(
                                text = "Lucas",
                                color = colorResource(id = R.color.letras),
                                modifier = Modifier.padding(top = 9.dp, start = 5.dp)

                            )
                        }
                        Image(
                            painter = painterResource(id = R.drawable.logo),
                            contentDescription = "",
                            modifier = Modifier.align(Alignment.CenterHorizontally)
                        )
                        Divider(modifier = Modifier.padding(horizontal = 3.dp))
                    }
                    Column(
                        modifier = Modifier.align(Alignment.CenterHorizontally),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Row(modifier = ) {
                            Button(
                                onClick = { Global.screen = 1},
                                modifier = Modifier
                                    .size(width = 130.dp, height = 130.dp)
                                    .background(color = colorResource(id = R.color.fundo)),
                                shape = MaterialTheme.shapes.large,
                                border = BorderStroke(width = 3.dp, color = Color.Black),
                                colors = ButtonDefaults.buttonColors(containerColor = colorResource(id = R.color.fundo))
                            ) {

                                Text(text = "Estatísticas do dia", color = colorResource(id = R.color.letras))
                            }
                            Button(
                                onClick = { Global.screen = 2},
                                modifier = Modifier
                                    .size(width = 130.dp, height = 130.dp)
                                    .background(color = colorResource(id = R.color.fundo)),
                                shape = MaterialTheme.shapes.large,
                                border = BorderStroke(width = 3.dp, color = Color.Black),
                                colors = ButtonDefaults.buttonColors(containerColor = colorResource(id = R.color.fundo))
                            ) {
                                Text(text = "Metas", color = colorResource(id = R.color.letras))
                            }
                        }
                        Button(
                            onClick = { Global.screen = 3},
                            modifier = Modifier
                                .size(width = 130.dp, height = 130.dp)
                                .background(color = colorResource(id = R.color.fundo)),
                            shape = MaterialTheme.shapes.large,
                            border = BorderStroke(width = 3.dp, color = Color.Black),
                            colors = ButtonDefaults.buttonColors(containerColor = colorResource(id = R.color.fundo))
                        ) {
                            Text(text = "Histórico", color = colorResource(id = R.color.letras))

                        }
                    }
                }
            }
        }
        1 -> Dia()
        2 -> Metas()
        3 -> Historico()
    }
}

