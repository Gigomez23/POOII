package models

class Libro(
    private var titulo: String,
    private var autor: String,
    private var anioPublicacion: Int
) {
    fun getTitulo(): String {
        return titulo
    }

    fun getAutor(): String {
        return autor
    }

    fun getAnioPublicacion(): Int {
        return anioPublicacion
    }

    fun mostrarInformacion(): String {
        return "Información del Libro\nTítulo: $titulo\nAutor: $autor\nAño de Publicación: $anioPublicacion"
    }
}