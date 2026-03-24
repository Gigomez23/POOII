package models

data class Pedido(
    var cliente: String,
    var nombre: String,
    var precio: Double
) {
    override fun toString(): String {
        return "Pedido (cliente='$cliente', nombre='$nombre', precio=$precio)"
    }
}
