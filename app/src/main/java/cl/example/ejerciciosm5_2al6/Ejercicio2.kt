package cl.example.ejerciciosm5_2al6

fun main() {

    var edad: Int
    println("Ingrese la edad: ")

    while (true) {
        try {
            edad = readln().toInt()
            if (edad in 0..100) {
                break
            } else {
                println("Error: la edad debe estar entre 0 y 100")
            }
        } catch (e: NumberFormatException) {
            println("Error: Ingresa un número válido")
        }
    }

    when (edad) {
        in 0..4  -> println("No paga entrada")
        in 5..15  -> println("El valor de la entrada es 15.000")
        in 16..60 -> {
            while (true) {
                try {
                    println("Ingrese día (del 1 lunes al 7 domingo): ")
                    val dia = readln().toInt()
                    if (dia in 1..7) {
                        if (dia == 1 || dia == 2) {
                            println("El valor de la entrada es 25.000")
                        } else {
                            println("El valor de la entrada es 30.000")
                        }
                        break
                    } else {
                        println("Error: ingrese un número de día entre 1 y 7")
                    }
                } catch (e: NumberFormatException) {
                    println("Error: ingresa un número válido")
                }
            }
        }
        in 61..100 -> println("El valor de la entrada es 20.000")
    }
}