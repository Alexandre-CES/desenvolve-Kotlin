
fun main() {
    //basics()
    //hello("Alexandre")
    //println("sum(2,3) : ${sum(2,3)}")
    //lists()

    /*
    val myCar = Car()
    myCar.model = "Ferrari"
    myCar.year = 2020

    println("Model: ${myCar.model}, Year: ${myCar.year}")
    myCar.turnOn()
    */

    val person = Person("Alexandre", 19)
    person.hello()
}

fun basics(){
    val name:String = "Kotlin"
    val age:Int = 12
    var payment:Double = 1500.30

    for (i in 1..3) {
        payment += 15.5
        println("i = $i | payment = $payment")
    }

    println("Hello, " + name + "!")
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

fun hello(name: String){
    println("Hello, $name!")
}

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun lists(){
    val numbers = listOf(1,2,3,4,5)

    println(numbers[0])
    println(numbers[1])

    val fruits = mutableListOf("Appl", "Banana")

    println(fruits.size)
    println(fruits)

    fruits.add("Grape")
    fruits.removeAt(1)
    fruits[0] = "Apple"

    println(fruits.size)
    println(fruits)
}

class Car{
    var model:String = "Unknown"
    var year:Int = 0

    fun turnOn(){
        println("Car $model is turning on")
    }
}

class Person(val name:String,val age:Int){
    fun hello(){
        println("Hello, my name is $name and i am $age")
    }
}