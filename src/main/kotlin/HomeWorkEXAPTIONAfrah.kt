/*
An exception is an unwanted or unexpected event, which occurs during the execution of a program at run time, that disrupts the normal flow of the program’s instructions. Exception handling is a technique, using which we can handle errors and prevent run time crashes that can stop our program.
There are two types of Exceptions:
1-	Checked Exception – Exceptions that are typically set on methods and checked at compile time
2-	UnChecked Exception – Exceptions that are generally due to logical errors and checked at the run time
There are four different keywords used in exception handling. These are:
1-Try  // This will try to find the exception.
2-Throw  // If exception found then it will throw the exception.
3-Catch   // After throwing it will catch the exception and execute their body.
4-Finally //It will always execute either we got exception or not.
 */
//First:Kotlin program of throwing arithmetic exception:
/*fun main(args : Array<String>){
    var num = 10 / 0	 // throws exception
    println(num)
}
 */
// print: Exception in thread "main" java.lang.ArithmeticException: / by zero
//-----------------------------------------------------------------
//Second:Kotlin program of using throw keyword:
/*fun main(args: Array<String>) {
    test("abcd")
    println("executes after the validation")
}
fun test(password: String) {
    // calculate length of the entered password and compare
    if (password.length < 6)
        throw ArithmeticException("Password is too short")
    else
        println("Strong password")
}
 */
//Print: Exception in thread "main" java.lang.ArithmeticException: Password is too short
//-------------------------------------------------------------------
//Third: Kotlin program of arithmetic exception handling using try-catch block:
/*import kotlin.ArithmeticException

fun main(args : Array<String>){
    try{
        var num = 10 / 0
    }
    catch(e: ArithmeticException){
        // caught and handles it
        println("Divide by zero not allowed")
    }
}
 */

//Print: Divide by zero not allowed
//Fourth:Kotlin program of using finally block with try block:
fun main(args : Array<String>){
    try{
        var ar = arrayOf(1,2,3,4,5)
        var int = ar[6]
        println(int)
    }
    finally {
        println("This block always executes")
    }
}
//Print: This block always executes
//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 5
