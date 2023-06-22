package com.example.testingapp

fun main() {
    /* val myName = "Sum"
     var myAge = 31
     //this gives the first letter of the Str
     val firstChar = myName[0]
     //myName.length requests the whole Str and minus it by 1 to get the last letter of Str
     val lastChar = myName[myName.length - 1]
     //Arithmetic Operators
     var results = 5+3
     results *= 2

     println("Hello $myName!\nFirst letter, $firstChar" +
             "\nLast letter, $lastChar\n" +
             //This is called a string expression
             "To include a statement: ${myName.length}")
     println(results)

     //Comparison Operators
     val isEqual = 5==3 //boolean expression
     //String interpolation
     println("isEqual is $isEqual")
     println("is 5 greater than 3: ${5>3}")

     //Increment operator
     var myNum = 2*5

     println("$myNum\n${myNum++}\n${myNum--}\n${++myNum}\n${--myNum}"
     )

     //if statement

     var heightPerson1 = 170
     var heightPerson2 = 189

     if (heightPerson1 > heightPerson2) {
         println("use raw force")
     }else if (heightPerson1 == heightPerson2){
         println("use your power technique 1337")
     }else{
         println("use technique")
     }

     //When Expression
     var season = 3
     when(season){
         1 -> println("Spring")
         2 -> println("Summer")
         3 -> { //multi line code
             println("Fall")
             println("Autumn")
         }
         4 -> println("Winter")
         else -> println("Invalid Season")
         }
     var month = 3
     when(month){
         //within those months between 3 and 5 ((with in 3 - 5//.. seems to stand for -(it's called a range) to show within a range of numbers))
         in 3..5 -> println("Spring")
         in 6..8 -> println("Summer")
         in 9..11 -> println("Fall")
         in 12 downTo 2 -> println("Winter")
         //or 12, 1, 2 ->// gives more than one value.
         else -> println("Invalid Season")
     }
     //is keyword
     var x : Any = 13.37
     when(x){
         is Int -> println("$x is an Int")
         is Double -> println("$x is a Double")
         is String -> println("$x is a String")
         else -> println("$x is none of the above")
     }

     // While Loop
     var x = 1
     while( x <= 10) {
         print("$x")
         x++
 //code to be executed
 }
 println("\nwhile loop is done")
 //do loop
     var a = 15
     do{
         print("$a")
         x++
     }while (x <= 10)
     println("\ndo while loop is done")

     var feltTemp = "cold"
     var roomTemp = 10
     while (feltTemp == "cold"){
         roomTemp++
         if(roomTemp >= 20){
             feltTemp = "comfy"
             println("It's comfy now.")
         }
     }
     //For Loops
     for(num in 1..10){
         print("$num")
     }
 //until is a range too
     for(i in 1 until 10){
         println("$i ")
     }
     println("______")
     // downTo (counts down) step (counts by how many steps are given)
     for(i in 10 downTo 1 step 2){ //Same as - for(i in 10.downTo(1).step(2)
         print("$i ")
     }*/

    for (i in 1 until 20) {
        if (i / 2 == 5) {
            continue
        }
        print("$i ")
    }
    print("Done with the loop")
}


//You can input a TODO within a comment and view that todo from the command bottom bar.