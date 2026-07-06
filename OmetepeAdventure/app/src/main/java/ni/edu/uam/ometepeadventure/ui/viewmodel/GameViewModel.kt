package ni.edu.uam.ometepeadventure.ui.viewmodel

// ui/viewmodel/GameViewModel.kt
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import ni.edu.uam.ometepeadventure.data.model.Player

class GameViewModel : ViewModel() {
    private val _player = MutableStateFlow(Player())
    val player: StateFlow<Player> = _player

    fun updateName(newName: String) {
        _player.value = _player.value.copy(name = newName)
    }
}