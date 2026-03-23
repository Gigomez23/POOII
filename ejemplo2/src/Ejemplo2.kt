import javax.swing.JOptionPane

class Ejemplo2 {
    fun saludar(nombre: String) {
        println("Hola $nombre")
    }

    fun product(a: Int, b: Int): Int {
        return a * b
    }
}

fun main(args: Array<String>) {
    val saludo = Ejemplo2()
    saludo.saludar("Manuel")

    val resultado = saludo.product(5, 3)
    println("El producto es: $resultado")
    println(saludo.product(5, 3))
    JOptionPane.showMessageDialog(null, "El producto es: ${saludo.product(5, 3)}")

    val c = Calculadora()
    val suma = c.suma(5, 3)
    println(suma)
}