package com.example.testingapp




fun main(){

    var seasons = listOf("Summer","Spring","Winter","Fall")

    print(seasons.reversed())


    //var name
}













































/*fun main(){
    // Creating instances of classes
    var denis  = Person("Denis", "Simple")
    //var john = Person()
    //var johnPeterson = Person(lastName = "Peterson")
    //var nameOs = Person.MobilePhone(osName = "Android", "Linux", "")
    denis.hobby = "to skateboard"
    denis.stateHobby()
    var john = Person()
    john.hobby = "play video games"
    john.stateHobby()

}
//scope
//parameter a
/*fun myFunction(a:Int){
    //a = 5 doesn't work because a is a parameter, ypu can call an argument in the fun main to make it work (myFunction(a:5)
    //variable a (different)
    var a = a
    println("a is $a")
}*/


class Person constructor(firstName :String = "John", lastName: String = "Doe"){
    //Member Variables - Properties
    var age : Int? = null
    var hobby : String = "watch Netflix"

    //Initializer Block
    init {
        println("Person created" +
        "firstName = $firstName and lastName = $lastName")
    }

    //Member functions - METHODS
    fun stateHobby(){
        println("My Hobby is $hobby")
}

 class MobilePhone constructor(osName :String = "ios", brandName :String = "Apple", modelType :String = "Iphone 12") {

    init {
        println("My os name: $osName.\nMy brand name: $brandName.\nMy model type: $modelType.")
    }
}
} */
