package models

class Bus (
    private var numeroRuta: Int,
    private var capacidad: Int,
    private var conductor: String
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