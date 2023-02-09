fun main() {
   naming()

    var result = div(22.5, 5.5)
    println(result)

    var total = div(23,56, 64, 8)
    println(total)

    interesting()
}


fun naming(){
    var name = "Ada"
    println("hello" + " " + name)

}


fun div(num1: Double, num2: Double): Double {
    var division = num1 % num2
    return division
}


fun div(num1: Int, num2: Int, num3: Int, num4: Int): Int{
    var sum = num1 + num2 + num3 + num4
    return sum

}

fun interesting(){
    var fact = "I have american height"
    println(fact)
}