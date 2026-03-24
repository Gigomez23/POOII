package run

import models.Libro

fun ejercicio10(){
    val libro1 = Libro("Codigo Limpio: Manual de estilo para el desarrollo agil de software",
        "Robert C Martin", 2008)
    val libro2 = Libro("Eloquent JavaScript", "Marijn Haverbeke", 2018)
    val libro3 = Libro("El Programador Pragmatico", "Andrew Hunt y David Thomas", 1999)
    val libro4 = Libro("Introduccion a la Programacion", "Juan Carlos Casale", 2012)

    println(libro1.mostrarInformacion())
    println(libro2.mostrarInformacion())
    println(libro3.mostrarInformacion())
    println(libro4.mostrarInformacion())
}