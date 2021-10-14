//Q2: Like what we know in Java when you write a function with type Void, the output is wrong, but now with Kotlin language it is there to find better solutions and the code is in good condition and reduce ERROR output, now in Kotlin you can refer to void, just as you can refer to any class From Java, but you really shouldn't. Replace it, use the unit.
//We can say that there is not a single function that does not return a value, but there is a type that does not return a value, and there are many functions that you can use with a unit, for example:


fun main (args:Array<String>){
//The showGreeting() function prints a message to the terminal, it does not return anything.
    fun showGreeting(name: String): Unit {

        println("Hello $name")
    }
}
