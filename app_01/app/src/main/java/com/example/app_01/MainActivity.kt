package com.example.app_01

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { //Define o conteúdo da Activity usando Compose.
            MinhaTela()
        }
    }
}

@Composable
fun MinhaTela() {
    Column( //Organiza os componentes verticalmente.
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ){
        Text(text = "Olá, Jetpack Compose!", style = MaterialTheme.typography.headlineMedium)
        //Exibe um texto.
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { /* Ação do botão */ }){
            //Cria um botão interativo.
            Text(text = "Clique Aqui")
        }
    }
}
