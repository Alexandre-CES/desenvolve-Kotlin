
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

    if(age <= 12){
        println("child")
    }else if(age > 12 && age < 18){
        println("teenager")
    }else{
        println("adult")
    }

    val day = 3
    val dayName = when (day){
        1 -> "Sunday"
        2 -> "Monday"
        3 -> "Tuesday"
        4 -> "Wednesday"
        5 -> "Thursday"
        6 -> "Friday"
        7 -> "Saturday"
        else -> "invalid"
    }

    println(dayName)

    var counter = 0
    while (counter < day){
        println(counter)
        counter++
    }


}