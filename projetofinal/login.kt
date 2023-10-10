package com.example.projetofinal



import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.RadioButton
import androidx.compose.material3.RadioButtonDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp



fun logado(){
    if (Global.login != ""){
        if (Global.altura != 0){
            if (Global.peso != 0){
                if (Global.genero != ""){
                    if (Global.idade != 0){
                        Global.screen = 0
                    }
                }
            }
        }
    }
}

@Composable
fun Login(){
    var text by remember {
        mutableStateOf("")
    }
    var text2 by remember {
        mutableStateOf("")
    }
    var text3 by remember {
        mutableStateOf("")
    }
    var text4 by remember {
        mutableStateOf("")
    }

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = colorResource(id = R.color.fundo)
    ) {

        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxSize()
        ) {
            Column {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    RadioButton(
                        selected = Global.genero == "F",
                        onClick = { Global.genero = "F" },
                        colors = RadioButtonDefaults.colors(
                            unselectedColor = colorResource(id = R.color.letras),
                            selectedColor = colorResource(id = R.color.letras_escuro))
                    )

                    Text("Feminino", color = colorResource(id = R.color.letras))

                    RadioButton(
                        selected = Global.genero == "M",
                        onClick = { Global.genero = "M" },
                        colors = RadioButtonDefaults.colors(
                            unselectedColor = colorResource(id = R.color.letras),
                            selectedColor = colorResource(id = R.color.letras_escuro))
                    )


                    Text("Masculino", color = colorResource(id = R.color.letras))
                }
            }

            Divider(color = Color.Black, thickness = 3.dp)
            Row (modifier = Modifier.padding(vertical = 5.dp)){
                Text(
                    text = "SEU NOME: ",
                    modifier = Modifier
                        .align(Alignment.CenterVertically)
                        .padding(start = 10.dp),
                    color = colorResource(id = R.color.letras)
                )
                BasicTextField(
                    value = text,
                    onValueChange = { newText -> text = newText; Global.login = newText },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 5.dp, end = 10.dp)
                        .background(color = colorResource(id = R.color.fundo_escuro)),
                    singleLine = true
                )
            }
            Row {
                Text(
                    text = "SUA ALTURA EM CM: ",
                    modifier = Modifier
                        .align(Alignment.CenterVertically)
                        .padding(start = 10.dp),
                    color = colorResource(id = R.color.letras)
                )
                BasicTextField(
                    value = text2,
                    onValueChange = { newText2 -> text2 = newText2
                        newText2.toIntOrNull()?.let { Global.altura = it }
                    },
                    modifier = Modifier
                        .padding(start = 5.dp, end = 10.dp)
                        .background(color = colorResource(id = R.color.fundo_escuro))
                        .fillMaxWidth(),
                    singleLine = true,

                    )
            }
            Row (modifier = Modifier.padding(vertical = 5.dp)){
                Text(
                    text = "SEU PESO EM KG: ",
                    modifier = Modifier
                        .align(Alignment.CenterVertically)
                        .padding(start = 10.dp),
                    color = colorResource(id = R.color.letras)
                )
                BasicTextField(
                    value = text3,
                    onValueChange = { newText3 ->
                        text3 = newText3
                        newText3.toIntOrNull()?.let { Global.peso = it }
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 5.dp, end = 10.dp)
                        .background(color = colorResource(id = R.color.fundo_escuro)),
                    singleLine = true

                )
            }
            Row (modifier = Modifier.padding(vertical = 5.dp)){
                Text(
                    text = "SUA IDADE EM ANOS: ",
                    modifier = Modifier
                        .align(Alignment.CenterVertically)
                        .padding(start = 10.dp),
                    color = colorResource(id = R.color.letras)
                )
                BasicTextField(
                    value = text4,
                    onValueChange = { newText4 ->
                        text4 = newText4
                        newText4.toIntOrNull()?.let { Global.idade = it }
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 5.dp, end = 10.dp)
                        .background(color = colorResource(id = R.color.fundo_escuro)),
                    singleLine = true

                )
            }
            Divider(color = Color.Black, thickness = 3.dp)

            Button(
                onClick = { logado() },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp),
                border = BorderStroke(width = 3.dp, color = Color.Black),
                colors = ButtonDefaults.buttonColors(containerColor = colorResource(id = R.color.fundo))
            ) {
                Text(text = "Fazer Login", color = colorResource(id = R.color.letras))
            }
        }

    }

}


