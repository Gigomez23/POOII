package run

import java.util.*

fun main(){
    menu()
}

fun menu(){
    var activo = true
    val scanner = Scanner(System.`in`)

    while (activo) {
        println("Menu")
        println("Digite un numero del 1-10 para ejecutar el ejercicio correspondiente:")
        var seleccion: Int

        try {
            seleccion = scanner.nextInt()
        } catch (e: InputMismatchException) {
            println("Entrada no valida. Por favor, ingrese un numero del 1-10.")
            scanner.next()
            continue
        }

        when (seleccion) {
            0 -> activo = false
            1 -> ejercicio1()
            2 -> ejercicio2()
            3 -> ejercicio3()
            4 -> ejercicio4()
            5 -> ejercicio5()
            6 -> ejercicio6()
            7 -> ejercicio7()
            8 -> ejercicio8()
            9 -> ejercicio9()
            10 -> ejercicio10()
            else -> println("Opcion Invalida")
        }
    }

}