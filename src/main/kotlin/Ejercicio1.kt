import org.w3c.dom.css.Rect
class Rectangulo (var base2 : Double, var altura : Double) {

    var area : Double = base2 * altura
    var perimetro : Double = 2 * base2 + 2 * altura

    fun checkSize (){
        if (this.base2 > 0.0 && this.altura > 0.0) {
            println("ERROR! El elemento se ha creado vacío.")
        }else{
            println("NO ERROR")
        }
    }
    //Consultores siempre get---
    //Modificadores siempre set

    fun getBaseData(): Double{
        return this.base2
    }

    fun getAlturaData() : Double{
        return this.altura
    }


    fun getBaseToString() : String{
        return this.base2.toString()
    }

    15 h
    25 2h
    36 3h

    fun setBaseData(newBase : Double){
        this.base2 = newBase
    }

    override fun toString(): String {
        return ("${this.base2}, es la base y la altura es ${this.altura} ")
    }
}

fun main () {
    println("Introduzca la base y la altura: ")
    val base : Double =  readln().toDouble()
    val altura : Double=  readln().toDouble()

    if (base > 0.0 && altura > 0.0) {
        val rectangulo4 = Rectangulo(base, altura)
        println(rectangulo4.toString())
        println("Para una base de 5 seria...")
        rectangulo4.setBaseData(5.0)
        println(rectangulo4.toString())
        println("La base de este rectangulo es " + rectangulo4.getBaseData().toString())
    } else {
        println("ERROR")
    }
}



