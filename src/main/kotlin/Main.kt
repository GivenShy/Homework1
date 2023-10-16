import java.lang.ArithmeticException
import java.lang.Exception
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

fun main(args: Array<String>) {

    problem1()

    problem2()

    problem3()

    println(isPositive(-76584))
    println(isPositive(234))
    println(isPositive(num= 0))

    greeting()

    //Problem 6
    try{ println(divide(2, 0)) }
    catch (e:ArithmeticException){
        println("Division by zero occurred")
    }

    problem7()


    //Problem 8
    val person= Person("Jivan",20)
    println("Name:${person.name}, Age:${person.age}")

    //Problem 9
    println(person.lifeStage())

    problem10()
}



fun problem1(){
    var arrayInteger = intArrayOf(1,2,3,4,5);
    for (i in arrayInteger)
        println(i)
    var listInteger = listOf<Int>(1,2,3,4,5);
    println(listInteger);
}

fun problem2(){
    var sampleString:String = "Hello"
    sampleString+=" World";
    sampleString =  sampleString.uppercase();
    sampleString+=sampleString.substring(1,4).lowercase();
    println(sampleString);
}

fun problem3() {
    var sampleMap = mapOf("firtst" to 45,"second" to 3, "third" to 89);
    for ((key,value ) in sampleMap) {
        println("The Key:${key}, The Value:${value}")
    }
}

//Problem 4
fun isPositive(num:Int):String{
    return if(num>0){
        "Positive"
    }else if (num<0){
        "Negative"
    }else {
        "Zero"
    }
}

//Problem 5
fun greeting(){
    print("Enter your name: ")
    val name = readLine()
    print("Enter your lastname: ")
    val lastname = readLine()

    println("Hello, Dear ${name} ${lastname}")
}

fun divide(num1:Int,num2:Int):Int{
        return num1/num2;
}

fun problem7(){
    val currentDate = LocalDateTime.now();
    println(currentDate)
    val formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss.S")
    val formatted = formatter.format(currentDate);
    println(formatted)
}

fun problem10(){
    var list = mutableListOf<Int>(1,-5,6,324,435,234,6)
    for(i in list.filter { a->a%2==0 }){
        println(i)
    }
}


public class Person(val name:String,val age:Int){
    fun lifeStage():String{
        return if (this.age<=12){
            "Child"
        }else if(this.age<=17){
            "Teenager"
        }else{
            "Adult"
        }
    }
}

