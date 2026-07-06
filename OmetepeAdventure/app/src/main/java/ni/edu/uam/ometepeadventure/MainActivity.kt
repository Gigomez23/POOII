package ni.edu.uam.ometepeadventure

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import ni.edu.uam.ometepeadventure.ui.screens.GameScreen
import ni.edu.uam.ometepeadventure.ui.screens.MenuScreen
import ni.edu.uam.ometepeadventure.ui.screens.SetupScreen
import ni.edu.uam.ometepeadventure.ui.viewmodel.GameViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            val viewModel: GameViewModel = viewModel()

            NavHost(navController = navController, startDestination = "menu") {
                composable("menu") {
                    MenuScreen { navController.navigate("setup") }
                }
                composable("setup") {
                    SetupScreen(viewModel) { navController.navigate("game") }
                }
                composable("game") {
                    GameScreen(viewModel)
                }
            }
        }
    }
}