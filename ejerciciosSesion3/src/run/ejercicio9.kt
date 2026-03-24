package run

import models.Docente
import models.EstudianteDos

fun ejercicio9() {
    val ProfeEric = Docente("Eric Vado", 42, "Sistemas Embebidos", 500.0)
    val estudiante1 = EstudianteDos("Natan Castro", 20, "Ingenieria Electronica", 3)

    ProfeEric.mostrarInfo()
    println(estudiante1)
}