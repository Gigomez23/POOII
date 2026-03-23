package run

fun main() {
    //mutable
    var age = 0

    println(age)

    age = 13
    println(age)

    var name = "John"
    var sex = 'm'

    println(name + " is " + sex)

    name = "Jane"
    sex = 'f'

    println(name + " is " + sex)

    //variable inmutable
    val college = "UAM"
    println(college)

    //variables de tipo entero
    val quantity : Int = 20
    var totalStudents : Int = 21
    print("Cantidad ${quantity}\nTotal de estudiantes ${totalStudents}\n")

    //variables de tipo decimal
    val price : Double = 99.99
    var average : Float = 100.0f
    println("Promedio: ${average}\nPrecio: $price")

    //texto
    val phrase : String = "Los qlos van y vienen lo que es eterno es Daniel"
    println(phrase)

    //Character
    val grade : Char = 'A'
    println("Tu calificacion es $grade")

    //Booleanos
    var isActive : Boolean = true
    isActive = false
    println(!isActive)

}