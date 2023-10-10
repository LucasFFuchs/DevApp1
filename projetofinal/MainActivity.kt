package com.example.projetofinal

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.projetofinal.ui.theme.ProjetoFinalTheme
import com.example.projetofinal.HomePage


class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ProjetoFinalTheme {
                HomePage()

            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ProjetoFinalTheme {
        HomePage()
    }
}
