package models

class Programador(
    nombre: String,
    salario: Double,
    private var lenguaje: String
):Empleado(nombre, salario){
    fun mostrarInfo(){
        println("Datos de Programador\nNombre: ${getNombre()}\nSalario: ${getSalario()}\nLenguaje: $lenguaje")
    }
}