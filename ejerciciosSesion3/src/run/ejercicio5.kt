package run

import models.CuentaBancaria

fun ejercicio5(){
    val cuentaPersonal = CuentaBancaria()
    println(cuentaPersonal.getNumeroCuenta())
    cuentaPersonal.setSaldo(1000.0)
    cuentaPersonal.depositar(100.00)
    cuentaPersonal.retirar(50.0)
    println(cuentaPersonal.consultarSaldo())

}