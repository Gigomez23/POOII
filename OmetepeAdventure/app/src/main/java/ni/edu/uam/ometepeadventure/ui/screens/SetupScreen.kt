package ni.edu.uam.ometepeadventure.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import ni.edu.uam.ometepeadventure.ui.viewmodel.GameViewModel

@Composable
fun SetupScreen(viewModel: GameViewModel, onConfirm: () -> Unit) {
    var nameInput by remember { mutableStateOf("") }

    Column(modifier = Modifier.fillMaxSize().padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally) {
        Text("¿Cómo te llamas, viajero?")
        TextField(
            value = nameInput,
            onValueChange = { nameInput = it },
            label = { Text("Tu nombre") }
        )
        Button(onClick = {
            viewModel.updateName(nameInput)
            onConfirm()
        }) {
            Text("DESEMBARCAR EN MOYOGALPA")
        }
    }
}