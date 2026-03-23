package models

class EstudianteDos(
    nombre: String,
    edad: Int,
    private var carrera: String,
    private var anio: Int
) :Persona(nombre, edad){
    fun getCarrera(): String {
        return carrera
    }

    fun getAnio(): Int {
        return anio
    }

    override fun toString(): String {
        return "EstudianteDos(nombre='${getNombre()}', edad=${getEdad()}, carrera='$carrera', anio=$anio)"
    }
}