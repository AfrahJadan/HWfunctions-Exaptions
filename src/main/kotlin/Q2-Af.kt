import java.util.*




fun main(args: Array<String>) {
    calculateSalary()
}

private fun calculateSalary() {
    val scanner = Scanner(System.`in`)

    println("Insert current annual salary: ")
    val salary = scanner.nextDouble()

    println("choose the rating: \n(1=excellent, 2=good, and 3=poor)") //تقييم الموظف ,
    val rating = scanner.nextInt()


    val result: Double
    val raise: Double

    if (rating == 1) {
        raise = 0.06
        result = (salary * raise) + salary
    } else if (rating == 2) {
        raise = 0.04
        result = (salary * raise) + salary
    } else if (rating == 3) {
        raise = 0.015
        result = (salary * raise) + salary
    } else {
        println("Error! select correct rating from 1 to 3")
        return
    }

    println("Salary is: $salary \nraise is: $raise\nnew salary is: $result")
}