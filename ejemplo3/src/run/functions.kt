package run

fun sayHello() {
    println("Hola mundo")
}

fun greet(name: String) {
    println("Hola $name")
}

fun addGrade(grade : Int, extra: Int): Int{
    return grade + extra
}

fun getScore(score : Int, bonus : Int) : Int = score + bonus

fun createUser(name : String, rol : String = "Usuario") {
    println("Usuario $name y su rol $rol")
}

fun scholarship(grade : Int) : Double{
    return when (grade) {
        in 70..<79 -> {
            0.25
        }
        in 90 ..95 -> {
            0.50
        }
        in 96..100 -> {
            0.75
        }
        else -> 0.0
    }

}

fun main(args: Array<String>){
    sayHello()
    greet("Marcos")
    val grade = "Nota final ${addGrade(70, 10)}"
    println(grade)
    println("Aumento ${getScore(100, 20)}")
    createUser("Marcos")
    createUser(name = "Alejandro", rol = "Admin")
}