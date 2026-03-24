package models

class CuentaBancaria(
    private val numeroCuenta: Int = (100000..999999).random(),
    private var saldo: Double = 0.0,
) {
    fun getNumeroCuenta(): Int {
        return numeroCuenta
    }
    fun getSaldo(): Double {
        return saldo
    }
    fun setSaldo(saldo: Double) {
        this.saldo = saldo
    }
    fun depositar(monto: Double){
        println("Depositando $monto en la cuenta $numeroCuenta")
        saldo += monto
    }
    fun retirar(monto: Double){
        println("Retirando $monto de la cuenta $numeroCuenta")
        if (monto > saldo) {
            println("Saldo insuficiente. No se puede retirar $monto.")
        } else {
            saldo -= monto
        }
    }
    fun consultarSaldo(): String {
        return "El saldo actual de la cuenta $numeroCuenta es: $saldo"
    }
}