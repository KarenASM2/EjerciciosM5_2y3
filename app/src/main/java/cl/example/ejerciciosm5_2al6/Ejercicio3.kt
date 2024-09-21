package cl.example.ejerciciosm5_2al6

class Usuarios(private var nombre: String,
               private var edad: Int,
               private var trabajo: String?,
               private var referencia: Usuarios?){

    fun mostrarDatos(){
        val trabajoN = trabajo ?: "No tiene trabajo"
        val referenciaN = if (referencia != null) {
            "${referencia?.nombre} de ${referencia?.edad} años."
        } else {
            "No tiene referencia"
        }
        println("Nombre: $nombre, Edad: $edad, Trabajo: $trabajoN, Referencia: $referenciaN")
    }
}

fun main() {
    val usuario1 = Usuarios("Juan Perez", 35, "Montador", null)
    usuario1.mostrarDatos()

    val usuario2 = Usuarios("Pamela Rojas", 28, "Secretaria", usuario1)
    usuario2.mostrarDatos()
}