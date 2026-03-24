package run

import models.Bus

fun ejercicio3() {
    val ruta101 = Bus(101, 75, "Franklin")
    val ruta121 = Bus(121, 80, "Juan")
    val ruta110 = Bus(110, 85, "Austin")

    ruta101.iniciarRuta()
    ruta121.iniciarRuta()
    ruta110.iniciarRuta()
}