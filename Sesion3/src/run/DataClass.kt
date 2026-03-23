package run

data class Estudiante(
    val cif: String,
    val nombre: String,
    val carrera: String,
    val promedio: Double
)

fun main(){
    val soliet = Estudiante("991", "Soliet", "ISI", 92.0)
}