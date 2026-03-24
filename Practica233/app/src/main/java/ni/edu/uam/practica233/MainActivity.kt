package ni.edu.uam.practica233

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Saludar()
        }
    }
}

@Composable
fun Saludar(){
    var nombre by remember {
        mutableStateOf("")
    }
    var saludo by remember {
        mutableStateOf("")
    }

    Column() {
        Text(text = "Escribe tu nombre")

        TextField(
            value = nombre,
            onValueChange = {nombre = it},
            label = { Text(text = "Nombre")}
        )

        Button(onClick = {
            saludo = "Hola $nombre"
        }) {
            Text(text = "Saludar")
        }

        Text(text = saludo)
    }
}