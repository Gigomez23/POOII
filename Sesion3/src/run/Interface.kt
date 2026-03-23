package run

interface Calculadora{

    fun sumar(num1: Int, num2: Int): Int
    fun restar(num1: Int, num2: Int): Int
    fun multiplicar(num1: Int, num2: Int): Int
    fun dividir(num1: Double, num2: Double): Double
}

class MiCalculadora: Calculadora{
    override fun sumar(num1: Int, num2: Int): Int {
        return num1 + num2
    }

    override fun restar(num1: Int, num2: Int): Int {
        return num1 - num2
    }

    override fun multiplicar(num1: Int, num2: Int): Int {
        return num1 * num2
    }

    override fun dividir(num1: Double, num2: Double): Double {
        return num1 / num2
    }
}

fun main(args:Array<String>){
    val myCalc = MiCalculadora()

    println(myCalc.sumar(2,3))
    println(myCalc.restar(12, 3))
    println(myCalc.multiplicar(3,3))
    println(myCalc.dividir(4.0, 2.0))
}