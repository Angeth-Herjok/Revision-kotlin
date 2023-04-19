import java.util.Arrays

fun main() {
    numsArray()
    arraysNum()
    arraySNames()
    var car=Car("Nissan","Subaru","KBD 456",60)
    println(car.make)
    start()
    stop()

    var book=Book("The girl was mine",389,"David Karanja")
    println( book.author)
    println(book.title)
    println(book.pages)


    var farmer=Farmer("Achol",35,62.5)
    println(farmer.age)
    println(farmer.weight)
    println(farmer.name)
    farmer.talk("I am a farmer lady")
    farmer.walk()



    var doctor=Doctor("Becky",23,52.2)
    println(doctor.age)
    println(doctor.weight)
    println(doctor.name)
    doctor.treatPeople("Many","malaria")


    var banker=Banker("Herjok",54,60.8)
    println( banker.age)
    println( banker.name)
   println( banker.sleep())
  println(  banker.countMoney(mutableListOf(500,200,100,150)))

}
fun numsArray(){
    var nums= arrayOf(22,32,43,57,89)
    println(nums[2])
    println(nums.max())
    println(nums.min())
    println(nums.count())
    println(nums.sum())
    println(nums.average())
}
fun arraysNum(){
    var names= arrayOf("becky","her","hok","lkog")
    println(names.get(3))
    names.set(1,"kong")
    println(names.get(1))
    var num1=names.plus("Jonh")
    println(num1[4])
//to access all values in an array
    for (u in names)
        println(u)
}
fun arraySNames(){
    var studentsNames= arrayOf("foina","flora","tina","hito","goto","peoyo","yero")
    var sortedNames=studentsNames.sort()
    println(Arrays.toString(studentsNames))

    var studentsNumber= arrayOf(21,98,76,54,32,22,56,1,2,3)
    var sortedNumber=studentsNumber.sort()
    println(Arrays.toString(studentsNumber))
}
//oop
class Car(var make:String,var model:String,var registration:String,var speed:Int)
fun start(){
    println("I want to start")
}
fun stop(){
    println("I am a stopping")
}
data class Book(var title:String,var pages:Int,var author:String)


//Inheritance
open class Person(var name:String,var age:Int,var weight:Double) {
     open fun talk(words: String) {
        println(words)
    }

    fun walk() {
        println("I am going to the farm")
    }

    fun eat() {
        println("yummyummmmmy")
    }

    fun sleep() {
        println("zzzzzzzzz")
    }
}
class Banker(name:String,age:Int,weight:Double):Person(name,age,weight) {
    fun countMoney(notes: List<Int>): Int {
        var sum = 0
        for (x in notes) {
          sum+=x
        }
        return  sum

    }
}

open class Farmer(name:String,age:Int,weight:Double):Person(name,age,weight) {
    override fun talk(words: String) {
//        super.talk(words)
        println("I am a farmer")
    }

    fun cultivate() {
        println("digdigdig")
    }
}

class Doctor(name:String,age:Int,weight:Double): Farmer (name, age, weight){

fun treatPeople(patients:String,disease:String){
    println("Treat $patients for $disease")
}
}











