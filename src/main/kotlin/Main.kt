//Program Entry point
//println prints the line in the next line whereas print just prints the lines without jumping to the next line
//and
//Functions
//An Example of a function with two Int parameters and Int return type.
//Function Definition

//fun add(a:Int, b:Int):Int{
    //return b + a
fun add(a:Int, b:Int)=a+b
//}
fun printSum(c: Int, d: Int): Unit {
    println("sum of $c and $d is ${c + d}")
}
//variables declared at the top of the function
var PIE=3.14
var y=1
fun main(args:Array<String>) {
    print("Hello!!")
    println("Welcome To GDSC CHUKA Community!!")

    println("Thank You For Availing ${args.joinToString()}")

    //print("The summation of a and b is:")
    //Function call
    //println(add(3, 5))
    //A function body can be an expression. Its return type is inferred.
    println("The Results of the Summation is: ${add(3,5)}")
    printSum(-1,8)
//variable Declaration
    val num1: Int = 1  // immediate assignment
    val num2 = 2   // `Int` type is inferred
    val num3: Int  // Type required when no initializer is provided
    num3 = 3       // deferred assignment
    println("num1 = $num1, num2 = $num2, num3 = $num3")

    //Reassigning variables
    //Variables that can be reassigned use the var keyword.
    var x = 5 // `Int` type is inferred
    x += 1
    println("x = $x")

    //You can declare variables at the top level.

       PIE+=1
        println(PIE)

}
