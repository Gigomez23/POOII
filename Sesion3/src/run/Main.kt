package run

class Estudiante{
    var nombre = ""
    var edad = 0
    fun estudiar(){
        println("$nombre Estudiante esta estudiando...")
    }
}

class Asignatura(private val nombre: String, private val precio: Double){
    fun getNombre(): String{
        return nombre
    }
    fun getPrecio(): Double{
        return precio
    }
}

fun main(){
    val estudiante = Estudiante()

    estudiante.nombre = "Frank"
    estudiante.edad = 12
    estudiante.estudiar()

    val pooAsignatura = Asignatura("Programacion Orientada a Objetos", 100.0)
    println("Asignatura: ${pooAsignatura.getNombre()}, Precio: ${pooAsignatura.getPrecio()}")
}