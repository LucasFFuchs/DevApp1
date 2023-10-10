package com.example.projetofinal


import android.annotation.SuppressLint
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HorizontalScrollScreen() {
    Scaffold(
        topBar = { TopAppBar(title = { Text(text = stringResource(R.string.app_name)) }) }
    ) {

        Column(modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
        ) {

            val scrollState = rememberScrollState()
            Row(modifier = Modifier
                .horizontalScroll(scrollState)
                .fillMaxWidth()
            ) {
                repeat(20) { index ->
                    Box(
                        modifier = Modifier
                            .padding(8.dp)
                            .size(100.dp)
                            .background(MaterialTheme.colorScheme.primary)
                    ) {
                        Text(
                            text = "Item $index",
                            style = MaterialTheme.typography.bodyLarge,
                            modifier = Modifier.padding(8.dp)
                        )
                    }
                }
            }
        }
    }
}

val tamanho = 130

class Global {
    companion object {
        var screen by mutableStateOf(0)
        var login by mutableStateOf("Lucas")
        var altura by mutableStateOf(189)
        var peso by mutableStateOf(77)
        var genero by mutableStateOf("M")
        var idade by mutableStateOf(17)

    }
}

val imagens = listOf(
    R.drawable.academia,
    R.drawable.ginasio,
    R.drawable.parque
)

fun deslogar(){
    Global.screen = 4
    Global.login = ""
    Global.altura = 0
    Global.peso = 0
    Global.genero = ""
    Global.idade = 0
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
                                text = Global.login,
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

                        Row(modifier = Modifier.padding(top = 10.dp, bottom = 10.dp)) {

                            Button(
                                onClick = { Global.screen = 1},
                                modifier = Modifier
                                    .size(width = tamanho.dp, height = (tamanho - 10).dp)
                                    .background(color = colorResource(id = R.color.fundo))
                                    .padding(end = 10.dp),
                                shape = MaterialTheme.shapes.large,
                                border = BorderStroke(width = 3.dp, color = Color.Black),
                                colors = ButtonDefaults.buttonColors(containerColor = colorResource(id = R.color.fundo))
                            ) {
                                Text(

                                    text = "ESTATÍSTICAS DO DIA\n☀️",
                                    color = colorResource(id = R.color.letras),
                                    textAlign = TextAlign.Center,
                                    style = TextStyle(fontSize = 10.sp)
                                )
                            }

                            Button(
                                onClick = { Global.screen = 2},
                                modifier = Modifier
                                    .size(width = tamanho.dp, height = (tamanho - 10).dp)
                                    .background(color = colorResource(id = R.color.fundo))
                                    .padding(start = 10.dp),
                                shape = MaterialTheme.shapes.large,
                                border = BorderStroke(width = 3.dp, color = Color.Black),
                                colors = ButtonDefaults.buttonColors(containerColor = colorResource(id = R.color.fundo))
                            ) {
                                Text(text = "METAS\n📍", color = colorResource(id = R.color.letras), textAlign = TextAlign.Center)
                            }
                        }

                        Button(
                            onClick = { Global.screen = 3},
                            modifier = Modifier
                                .size(width = tamanho.dp, height = tamanho.dp)
                                .background(color = colorResource(id = R.color.fundo)),
                            shape = MaterialTheme.shapes.large,
                            border = BorderStroke(width = 3.dp, color = Color.Black),
                            colors = ButtonDefaults.buttonColors(containerColor = colorResource(id = R.color.fundo))
                        ) {
                            Text(text = "HISTÓRICO\n📖", color = colorResource(id = R.color.letras), textAlign = TextAlign.Center)
                        }

                        Text(
                            text = "Nosso aplicativo é muito útil em diversos lugares...",
                            modifier = Modifier.padding(top = 20.dp,),
                            color = colorResource(id = R.color.letras),
                            textAlign = TextAlign.Center

                        )
                        LazyRow {
                            items(imagens.size) { index ->
                                Image(
                                    painter = painterResource(id = imagens[index]),
                                    contentDescription = "",
                                    modifier = Modifier
                                        .size(200.dp)
                                        .padding(2.dp)
                                )
                            }
                        }
                        Divider(color = colorResource(id = R.color.white))


                        Row {
                            Button(
                                onClick = { deslogar() },
                                modifier = Modifier
                                    .size(width = 130.dp, height = 50.dp)
                                    .background(color = colorResource(id = R.color.fundo)),
                                shape = MaterialTheme.shapes.large,
                                border = BorderStroke(width = 3.dp, color = Color.Black),
                                colors = ButtonDefaults.buttonColors(
                                    containerColor = colorResource(
                                        id = R.color.fundo
                                    )
                                )
                            ) {
                                Text(text = "Deslogar", color = colorResource(id = R.color.letras))
                            }
                        }



                    }//Fim da Coluna
                }
            }
        }//Fim do HomePage
        1 -> Dia()
        2 -> Metas()
        3 -> Historico()
        4 -> Login()
    }
}

