package run

import models.Pedido

fun ejercicio8() {
    val servicio1 = Pedido("Estefany", "Servicio de Carne Asada", 10.99)
    val servicio2 = Pedido("Jose", "Servicio de Pollo Asado", 10.99)
    val servicio3 = Pedido("Oscar", "Sopa de Res", 15.99)

    println(servicio1)
    println(servicio2)
    println(servicio3)
}