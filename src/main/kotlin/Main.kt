import java.lang.ArithmeticException
import java.lang.Exception
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

fun main(args: Array<String>) {

    var arrayInteger = intArrayOf(1,2,3,4,5);
    for (i in arrayInteger)
        println(i)
    var listInteger = listOf<Int>(1,2,3,4,5);
    println(listInteger);

    var sampleString:String = "Hello"
    sampleString+=" World";
    sampleString =  sampleString.uppercase();
    sampleString+=sampleString.substring(1,4).lowercase();
    println(sampleString);

    var sampleMap = mapOf("firtst" to 45,"second" to 3, "third" to 89);
    for ((key,value ) in sampleMap) {
        println("The Key:${key}, The Value:${value}")
    }

    println(isPositive(-76584))
    println(isPositive(234))
    println(isPositive(num= 0))

    //greeting()

    try{ println(divide(2, 0)) }
    catch (e:ArithmeticException){
        println("Division by zero occurred")
    }

    val currentDate = LocalDateTime.now();
    println(currentDate)
    val formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss.S")

    val formatted = formatter.format(currentDate);
    println(formatted)

    val person= Person("Jivan",20)
    println("Name:${person.name}, Age:${person.age}")


    var list = mutableListOf<Int>(1,-5,6,324,435,234,6)
    for(i in list.filter { a->a%2==0 }){
        println(i)
    }
}

fun isPositive(num:Int):String{
    return if(num>0){
        "Positive"
    }else if (num<0){
        "Negative"
    }else {
        "Zero"
    }
}

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

public class Person(val name:String,val age:Int){

}

fun Person.lifeStage():String{
    return if (this.age<=12){
        "Child"
    }else if(this.age<=17){
        "Teenager"
    }else{
        "Adult"
    }
}