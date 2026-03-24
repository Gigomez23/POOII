package models

data class Producto(
    val nombre: String,
    var precio: Double,
    var cantidad: Int
) {
    override fun toString(): String {
        return "Producto (nombre='$nombre', precio=$precio, cantidad=$cantidad)"
    }
}