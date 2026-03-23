package models

class Estudiante(
    private var nombre: String,
    private var edad: Int,
    private var carrera: String,
    private var anio: Int){
    fun getNombre(): String{
        return nombre
    }
    fun getEdad(): Int{
        return edad
    }
    fun getCarrera(): String {
        return carrera
    }
    fun getAnio(): Int {
        return anio
    }

    fun mostrarDatos(): String{
        return "Datos de Estudiante\nNombre: $nombre\nEdad: $edad\nCarrera: $carrera\nAño: $anio"
    }
}