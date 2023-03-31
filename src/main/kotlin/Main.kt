fun main() {
println( returnIndices(listOf("Janauary","Februray","March","boy","Girl","Adalab","AkiraChix","52","Kotlin","Code")))
personsObjects()
println( peoplesHeight(listOf(5.34,6.20,5.70)))
    var carList = listOf(
        cars("KWD",50.0),
        cars("KDE",80.0),
        cars("KAA",60.0),
        cars("KBN",100.0)
    )
    println(magari(carList))
addPeople()
}

//1.Given a list of 10 strings, write a function that returns a list of the strings
//at even indices i.e index 2,4,6 etc.

fun returnIndices(names:List<String>):List<String>{
    var evenStrings = listOf<String>()
    for (x in names) {
        if (names.indexOf(x) % 2 == 0) {
            evenStrings += x
        }
    }


return evenStrings
}


//2. Given a list of people’s heights in metres. Write a function that returns
//the average height and the total height
data class Height(var sum:Double,var avr:Double)
fun peoplesHeight(people:List<Double>): Height {
    var sums = people.sum()
    var avr = people.average()
    var totavr = Height(sums,avr)
    return totavr
}


//3. Given a list of Person objects, each with the attributes, name, age,
//height and weight. Sort the list in order of descending age
data class Product(var name:String,var age:Int,var height:Double,var weight:Double)
fun personsObjects(){
    val meg = Product("Megan",10,50.0,40.7)
    val flo = Product("Florence",8,30.5,30.0)
    val vicky = Product("Victoria",15,70.0,50.0)
    val red = Product("Rediet",17,90.0,60.0)
    val lily = Product("Lilian",2,15.0,20.0)

    var product = listOf(meg,flo,vicky,red,lily)
    val sortAge = product.sortedByDescending { product -> product.age }
    println(sortAge)
}


//4. Given a list similar to the one above, write a function in which you will
//create 2 more people objects and add them to the list at one go.
fun addPeople() {
    var person7= Product("Joy",22,124.0,68.0)
    var person8= Product("Joe",22,142.0,58.0)

    println(listOf(person7, person8,))
println()
}



//5. Write a function that takes in a list of Car objects each with a
//registration and mileage attribute and returns the average mileage of
//all the vehicles in the list.
data class cars (var registration:String,var mileage:Double)
fun magari(car:List<cars>):Double{
    var avi = 0.0
    for (x in car){
        avi += x.mileage
    }
    return avi/car.size
  }


