package run

import models.Estudiante


fun ejercicio1(){
    val estudiante1 = Estudiante("Gabriel", 22,
        "Ingenieria en Sistemas de Informacion", 3)

    val estudiante2 = Estudiante("Gabriel", 22,
        "Ingenieria en Sistemas de Informacion", 3)

    val estudiante3 = Estudiante("Gabriel", 22,
        "Ingenieria en Sistemas de Informacion", 3)

    println(estudiante1.mostrarDatos())
    println(estudiante2.mostrarDatos())
    println(estudiante3.mostrarDatos())
}