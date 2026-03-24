package run

import models.Taxi

fun ejercicio6(){
    val taxi1 = Taxi("M1405 5684", "Francis", "Toyota Yaris")
    val taxi2 = Taxi("M2154 0436", "Aurelio", "Hyundai Accent")
    val taxi3 = Taxi("M4785 6327", "David", "Kia Picanto")

    taxi1.iniciarServicio()
    taxi2.iniciarServicio()
    taxi3.iniciarServicio()
}