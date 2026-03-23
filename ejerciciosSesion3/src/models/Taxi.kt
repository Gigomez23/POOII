package models

class Taxi(
    private var placa: String,
    private var conductor: String,
    private var modelo: String,
) {
    fun getPlaca(): String {
        return placa
    }

    fun getConductor(): String {
        return conductor
    }

    fun getModelo(): String {
        return modelo
    }

    fun iniciarServicio() {
        println("Iniciando servicio con conductor $conductor y taxi modelo $modelo con numero de placa $placa")
    }
}