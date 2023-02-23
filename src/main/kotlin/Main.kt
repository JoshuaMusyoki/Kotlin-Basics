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

}
