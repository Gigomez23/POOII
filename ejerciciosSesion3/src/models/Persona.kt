package models

open class Persona(
    private var nombre: String,
    private var edad: Int
) {
    fun getNombre(): String {
        return nombre
    }

    fun getEdad(): Int {
        return edad
    }

    override fun toString(): String {
        return "Persona(nombre='$nombre', edad=$edad)"
    }
}