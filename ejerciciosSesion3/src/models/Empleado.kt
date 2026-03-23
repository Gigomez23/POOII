package models

open class Empleado(
    private var nombre: String,
    private var salario: Double
) {
    fun getNombre(): String{
        return nombre
    }
    fun getSalario(): Double{
        return salario
    }
}