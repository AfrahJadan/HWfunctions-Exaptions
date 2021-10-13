
fun main(args: Array<String>) {
    println("Hello user I am your calculator")
    println("Enter First number please")
    var num1 = readLine()!!.toDouble()
    println("Enter Second number please")
    var num2 = readLine()!!.toDouble()
    println("Enter one of these operations (+.-,*,/,%)")
    var char= readLine()!!
    if (char== "+"){
        println("num1 + num2 = ${num1 + num2}")}
    else if(char== "-")
    { println("num1 - num2 = ${num1 - num2}")
    }else if(char== "*")
    { println("num1 * num2 = ${num1 * num2}")
    } else if(char== "/")
    { println("num1 / num2 = ${num1 / num2}")
    }else if(char== "%")
    { println("num1 % num2 = ${num1 % num2}") }
    else  println("the opreation is false")
}