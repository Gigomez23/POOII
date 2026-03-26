package ni.edu.uam.calificacionapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import ni.edu.uam.calificacionapp.ui.theme.CalificacionAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CalificacionAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    CalculateGrade(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun CalculateGrade(modifier: Modifier = Modifier) {
    var grade1 by remember { mutableStateOf("")}
    var grade2 by remember { mutableStateOf("")}
    var grade3 by remember { mutableStateOf("")}
    var average by remember { mutableStateOf("")}

    Column(
        modifier = modifier.padding(25.dp)
    ) {
        Text( text = "Ingrese la nota de cada corte")
        Spacer(modifier = Modifier.padding(10.dp))
        TextField(
            value = grade1,
            onValueChange = { grade1 = it},
            label = { Text("Corte 1")}
        )
        Spacer(modifier = Modifier.padding(10.dp))
        TextField(
            value = grade2,
            onValueChange = { grade2 = it},
            label = { Text("Corte 2")}
        )
        Spacer(modifier = Modifier.padding(10.dp))
        TextField(
            value = grade3,
            onValueChange = { grade3 = it},
            label = { Text("Corte 3")}
        )
        Spacer(modifier = Modifier.padding(10.dp))
        Button(onClick = {
            average = try {
                val g1 = grade1.toDouble()
                val g2 = grade2.toDouble()
                val g3 = grade3.toDouble()
                ((g1 + g2 + g3) / 3).toString()
            } catch (e: NumberFormatException) {
                "Ingrese valores válidos"
            }
        }) {
            Text(text = "Calcular Promedio")
        }
        Spacer(modifier = Modifier.padding(10.dp))
        Text(text = "Promedio: $average")
    }

}