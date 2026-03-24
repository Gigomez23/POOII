package run

import models.Camion
import models.Motocicleta

fun ejercicio7() {
    val CamionCocaCola = Camion()
    val MotoPersonal = Motocicleta()

    CamionCocaCola.mover()
    MotoPersonal.mover()
}