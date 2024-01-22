import kotlin.math.round
import kotlin.math.roundToInt

class Persona (var peso : Double, var altura : Double) {

    var nombre: String = "Sin nombre"
    val imc: Double = round( this.peso / (this.altura * this.altura)*100.00) / 100.00


    constructor(nombre: String, peso: Double, altura: Double) : this(peso, altura) {
        this.nombre = nombre
    }


    override fun toString(): String {
        return ("${this.nombre}, tu peso es de ${this.peso} kg, tu altura es de ${this.altura} m y tu IMC es de ${this.imc}.")
    }

}

    fun main () {

        val persona1 = Persona(78.0, 1.85)
        val persona2 = Persona("Federico", 90.0, 1.70)
        val persona3 = Persona("Cansa", 60.3, 1.65)

        println(persona1.toString())
        println(persona2.toString())
        println(persona3.toString())
    }
