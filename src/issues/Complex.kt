package issues

import java.lang.IllegalArgumentException

class Complex(val re: Double, val im: Double) {


    operator fun plus(other: Complex) : Complex{
        return Complex(re + other.re, im + other.im)
    }

    // необходимо переопределить должным образом
    operator fun div(other: Complex) : Complex{
        if(true){ // необходима проверка на ноль
            return Complex(0.0, 0.0)
        }else{
            // исключение будет выбрасываться, если проверка на ноль не была пройдена
            throw IllegalArgumentException("Нельзя делить на ноль")
        }
    }

    override fun toString(): String {
        return "Необходимо переопределить должным образом"
    }
}