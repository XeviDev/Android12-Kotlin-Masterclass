package jvmm.dev.kotlinbasics

// TYPES OF DATA
fun main() {
       // TODO: Add some things
       /*
       * Coments multiline
       * */
       print("Hola Mundo")

       //Para poner un float, se le pone F al final
       //Si no pongo la F, lo detecta como Double
       var a: Float = 12.43F
       var b: Double = 3.256418587755
       var c: Byte = 12
       var d: Short = 234
       var e: Int = 23
       var f: Long = 324_2345_345_3245 //_ use it for read better the number
       println()
       println(f.toString())

       var g: Boolean = true //false
       var char = 'A' // '' for Char type

       var myString = "Hola Mundo"
       var firstletter = myString[0]
       println()
       println(myString.length.toString())
       println(firstletter)

       println("Hola empieza por: $firstletter y tiene ${myString.length} letras")

       //Arithmetic operators (+, -, *, /, %)
       var result = 5 + 3
       result = result / 2
       // alternatively
       // result /= 2
       result = result * 5
       result = result - 1
       var moduloResult = 5 % 2
       println(moduloResult)

       //Comparison operators (==, !=, <, >, <=, >=)
       val isEqual = 5 == 3
       // Concatenation - adding of "Strings"
       println("isEqual is " + isEqual)
       val isNotEqual = 5 != 5
       // Kotlin has a feature called String Interpolation.
       // This feature allows you to directly insert a template expression inside a String.
       // Template expressions are tiny pieces of code that are evaluated and
       // their results are concatenated with the original String.
       // A template expression is prefixed with $ symbol.
       // Following are examples of String interpolation
       println("isNotEqual is $isNotEqual")

       println("is5Greater3 ${5 > 3}")
       println("is5LowerEqual3 ${5 >= 3}")
       println("is5LowerEqual5 ${5 >= 5}")

       //Assignment operators (+=, -=, *=, /=, %=)
       var myNum = 5
       myNum += 3
       println("myNum is $myNum")
       myNum *= 4
       println("myNum is $myNum")


       //Increment & Decrement operators (++, --)
       myNum++
       println("myNum is $myNum")
       // increments after use
       println("myNum is ${myNum++}")
       // increments before use
       println("myNum is ${++myNum}")
       println("myNum is ${--myNum}")

       //create a variable for testing all condition
       val age = 16
       //create a variable for drinkingAge
       val drinkingAge = 21
       //create a variable for votingAge
       val votingAge = 18
       //create a variable for drivingAge
       val drivingAge = 16

       //Assign the if statement to a variable
       val currentAge = if (age >= drinkingAge) {
        println("Now you may drink in the US")
       //return the value for this block
        drinkingAge
       } else if (age >= votingAge) {
        println("You may vote now")
       //return the value for this block
        votingAge
       } else if (age >= drivingAge) {
        println("You may drive now")
       //return the value for this block
        drivingAge
       } else {
        println("You are too young")
       //return the value for this block
        age
       }
       //print the age for the passing condition
       print("current age is $currentAge")
       // Control Flows
       // If Statements
       var age = 17
       if(age >= 21){
              print("now you may drink in the US")
       }
       // Else If Statement - only executed if the if statement is not true
       else if(age >= 18){
              print("now you may vote")
       }
       // Else If Statement - only executed if the foregoing else if statement is not true
       else if (age >= 16){
              print("you now may drive")
       }
       // else is only executed if all of the foregoing statements weren't true
       else{
              print("you're too young")
       }

       // Kotlin’s "when" expression is the replacement of the switch statement
       // from other languages like C, C++, and Java.
       // It is compact and more powerful than switch statements.
       var season = 3
       when(season) {
              1 -> println("Spring")
              2 -> println("Summer")
              3 -> println("Fall")
              4 -> println("Winter")
              else -> println("Invalid Season")
       }
       var month = 3
       when(month) {
              1,2,3 -> println("Spring")
              in 4..6 -> println("Summer")
              in 7..9 -> println("Fall")
              in 10..12 -> println("Winter")
              else -> println("Invalid Season")
       }

       // challenge - translate the if statement with the age to a when expression
       when(age){
              // with the !in it's the same as saying not in ...
              !in 0..20  -> print("now you may drink in the US")
              in 18..20  -> print("now you may vote")
              16,17 -> print("you now may drive")
              else -> print("you're too young")
       }

       var x : Any = 13.37
       when(x) {
              is Int -> println("$x is an Int")
              !is Double -> println("$x is not Double")
              is String -> println("$x is a String")
              else -> println("$x is none of the above")
       }

       /**
       var x : Any = 13.37
       when(x) {
       is Int -> println("$x is an Int")
       !is Double -> println("$x is not Double")
       is String -> println("$x is a String")
       else -> println("$x is none of the above")
       }
        **/

       val x : Any = 13.37
       //assign when to a variable
       val result =  when(x) {
       //let condition for each block be only a string
              is Int -> "is an Int"
              !is Double -> "is not Double"
              is String -> "is a String"
              else -> "is none of the above"
       }
       //then print x with the result
       print("$x $result")
       var condition = true
       // Loops
       // While Loop
       // While loop executes a block of code repeatedly as long as a given condition is true
       while(condition) {
              // code to be executed
       }

       var y = 1
       while(y <= 10) {
              println("$y ")
              y++
       }

       // Do while loop
       // The do-while loop is similar to while loop except that it
       // tests the condition at the end of the loop.
       // This means that it will at least execute the body once
       var z = 1
       do {
              print("$z ")
              z++
       } while(z <= 10)

       var feltTemp = "cold"
       var roomTemp = 10
       while (feltTemp == "cold"){
              roomTemp++
              if(roomTemp == 20){
                     feltTemp = "comfy"
                     println("it's comfy now")
              }
       }


       // For Loop
       // A for-loop is used to iterate through ranges, arrays, collections, or anything
       // that provides an iterator (You’ll learn about iterator, arrays, ranges and collections in a future lectur    e).
       for(num in 1..10) {
              print("$num ")
       }

       // infix notation
       for(i in 1 until 10) { // Same as - for(i in 1.until(10))
              print("$i ")
       }

       for(i in 10 downTo 1) {     // Same as - for(i in 10.downTo(1))
              print("$i ")
       }

       for(i in 1 until 10 step 2) { // Same as - for(i in 1.until(10).step(2))
              print("$i ")
       }
}
