package run

fun sexo(numero1: Int, numero2: Int) {
    if (numero1 > numero2) {
        println("El numero mayor es: $numero1")
    } else if (numero2 > numero1) {
        println("El numero mayor es: $numero2")
    } else {
        println("Los numeros son iguales")
    }
}

fun main() {
    val numero1 = 10
    val numero2 = 20

    sexo(numero1, numero2)
}