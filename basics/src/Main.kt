
fun main() {
    val name:String = "Kotlin"
    val age:Int = 12
    var payment:Double = 1500.30

    for (i in 1..3) {
        payment += 15.5
        println("i = $i | payment = $payment")
    }

    fun sum(a: Int, b: Int): Int {
        return a + b
    }

    println("Hello, " + name + "!")
    println("sum(1,2) : ${sum(age,3)}")
    println(age <= payment)
}