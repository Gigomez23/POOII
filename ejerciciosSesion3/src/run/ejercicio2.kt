package run

import models.Producto

fun ejercicio2(){
    val bolsaFrijoles = Producto("Frijoles la Finca", 15.99, 25)
    val bolsaArroz = Producto("Arroz la Finca", 12.99, 21)
    val aceiteDeCocina = Producto("Aceite para cocinar", 10.99, 30)
    val teHiC = Producto("HI-C Te", 5.99, 125)
    val queso = Producto("Libra de Queso", 25.99, 15)

    println(bolsaFrijoles)
    println(bolsaArroz)
    println(aceiteDeCocina)
    println(teHiC)
    println(queso)
}