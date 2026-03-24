package models

class Docente(
    nombre:String,
    edad: Int,
    private var especialidad: String,
    private var salario: Double
): Persona(nombre, edad) {
    fun getEspecialidad(): String {
        return especialidad
    }
    fun getSalario(): Double {
        return salario
    }
        fun mostrarInfo(){
            println("Datos de Docente\nNombre: ${getNombre()}\nEdad: ${getEdad()}\nEspecialidad: $especialidad\nSalario: $salario")
        }
}