package models

class Bus (
    var numeroRuta: Int,
    var capacidad: Int,
    var conductor: String
){
    fun getNumeroRuta(): Int{
        return numeroRuta
    }
    fun getCapacidad(): Int{
        return capacidad
    }
    fun getConductor(): String {
        return conductor
    }
    fun iniciarRuta(){
        println("Iniciando ruta $numeroRuta con conductor $conductor")
    }
}