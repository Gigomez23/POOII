package ni.edu.uam.ometepeadventure.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import ni.edu.uam.ometepeadventure.ui.viewmodel.GameViewModel

@Composable
fun GameScreen(viewModel: GameViewModel) {
    val player by viewModel.player.collectAsState()

    Box(modifier = Modifier.fillMaxSize().background(Color(0xFF4CAF50))) { // Pasto
        // UI de Información
        Column(modifier = Modifier.padding(16.dp)) {
            Text("Jugador: ${player.name}", color = Color.White)
            Text("Cacao: ${player.cacao} 🍫", color = Color.White)
        }

        // El Personaje (Placeholder)
        Box(
            modifier = Modifier
                .size(50.dp)
                .align(Alignment.Center)
                .background(Color.Blue, shape = CircleShape)
        ) {
            Text("👤", modifier = Modifier.align(Alignment.Center))
        }
    }
}