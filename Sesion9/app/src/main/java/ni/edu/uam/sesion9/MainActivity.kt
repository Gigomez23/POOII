package ni.edu.uam.sesion9

import android.app.DatePickerDialog
import android.os.Build
import android.os.Bundle
import android.widget.DatePicker
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
//import androidx.compose.material.icons.Icons
//import androidx.compose.material.icons.filled.DateRange
//import androidx.compose.material.icons.filled.List
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*

// 1. Modelo de datos actualizado
enum class TaskStatus(val label: String) {
    WAITING("En espera"),
    IN_PROGRESS("En proceso"),
    FINISHED("Finalizado")
}

data class Task(
    val name: String,
    val status: TaskStatus,
    val createdDate: String,
    val dueDate: String
)

class MainActivity : ComponentActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    TaskManagerScreen()
                }
            }
        }
    }
}

@RequiresApi(Build.VERSION_CODES.O)
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TaskManagerScreen() {
    val context = LocalContext.current
    val formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy")

    // Estados
    var taskName by remember { mutableStateOf("") }
    var selectedStatus by remember { mutableStateOf(TaskStatus.WAITING) }
    var dueDate by remember { mutableStateOf(LocalDate.now().format(formatter)) }
    val taskList = remember { mutableStateListOf<Task>() }

    // Configuración del DatePickerDialog
    val calendar = Calendar.getInstance()
    val datePickerDialog = DatePickerDialog(
        context,
        { _: DatePicker, year: Int, month: Int, dayOfMonth: Int ->
            val selectedDate = LocalDate.of(year, month + 1, dayOfMonth)
            dueDate = selectedDate.format(formatter)
        },
        calendar.get(Calendar.YEAR),
        calendar.get(Calendar.MONTH),
        calendar.get(Calendar.DAY_OF_MONTH)
    )

    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        // LOGO: Usamos un icono de sistema como logo
//                        Icon(
//                            imageVector = Icons.Default.List,
//                            contentDescription = null,
//                            tint = MaterialTheme.colorScheme.primary,
//                            modifier = Modifier.size(32.dp)
//                        )
                        Spacer(modifier = Modifier.width(8.dp))
                        Text("Task Master", style = MaterialTheme.typography.headlineMedium)
                    }
                }
            )
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .padding(paddingValues)
                .padding(16.dp)
                .fillMaxSize()
        ) {
            // --- FORMULARIO ---
            Card(
                modifier = Modifier.fillMaxWidth(),
                colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant)
            ) {
                Column(modifier = Modifier.padding(16.dp)) {
                    OutlinedTextField(
                        value = taskName,
                        onValueChange = { taskName = it },
                        label = { Text("Nombre de la tarea") },
                        modifier = Modifier.fillMaxWidth()
                    )

                    Spacer(modifier = Modifier.height(12.dp))

                    // Botón para seleccionar fecha
                    OutlinedButton(
                        onClick = { datePickerDialog.show() },
                        modifier = Modifier.fillMaxWidth()
                    ) {
//                        Icon(Icons.Default.DateRange, contentDescription = null)
                        Spacer(modifier = Modifier.width(8.dp))
                        Text("Fecha límite: $dueDate")
                    }

                    Spacer(modifier = Modifier.height(12.dp))

                    Text("Estado:", style = MaterialTheme.typography.labelLarge)
                    Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {
                        TaskStatus.values().forEach { status ->
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                RadioButton(
                                    selected = (selectedStatus == status),
                                    onClick = { selectedStatus = status }
                                )
                                Text(text = status.label, style = MaterialTheme.typography.bodySmall)
                            }
                        }
                    }

                    Button(
                        onClick = {
                            if (taskName.isNotBlank()) {
                                val today = LocalDate.now().format(formatter)
                                taskList.add(Task(taskName, selectedStatus, today, dueDate))
                                taskName = ""
                            }
                        },
                        modifier = Modifier.fillMaxWidth().padding(top = 8.dp)
                    ) {
                        Text("Guardar Tarea")
                    }
                }
            }

            Spacer(modifier = Modifier.height(24.dp))

            Text("Mis Tareas", style = MaterialTheme.typography.titleLarge)

            LazyColumn(
                modifier = Modifier.fillMaxSize(),
                contentPadding = PaddingValues(vertical = 8.dp),
                verticalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                items(taskList) { task ->
                    TaskItem(task)
                }
            }
        }
    }
}

@Composable
fun TaskItem(task: Task) {
    val statusColor = when (task.status) {
        TaskStatus.WAITING -> MaterialTheme.colorScheme.outline
        TaskStatus.IN_PROGRESS -> MaterialTheme.colorScheme.primary
        TaskStatus.FINISHED -> MaterialTheme.colorScheme.tertiary
    }

    Card(
        modifier = Modifier.fillMaxWidth(),
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(text = task.name, style = MaterialTheme.typography.titleMedium)

                Surface(color = statusColor, shape = MaterialTheme.shapes.extraSmall) {
                    Text(
                        text = task.status.label,
                        modifier = Modifier.padding(horizontal = 6.dp, vertical = 2.dp),
                        style = MaterialTheme.typography.labelSmall,
                        color = MaterialTheme.colorScheme.onPrimary
                    )
                }
            }

            Divider(modifier = Modifier.padding(vertical = 8.dp), thickness = 0.5.dp)

            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
                Text(
                    text = "Creada: ${task.createdDate}",
                    style = MaterialTheme.typography.bodySmall,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
                Text(
                    text = "Límite: ${task.dueDate}",
                    style = MaterialTheme.typography.bodySmall,
                    color = MaterialTheme.colorScheme.error,
                    fontWeight = androidx.compose.ui.text.font.FontWeight.Bold
                )
            }
        }
    }
}