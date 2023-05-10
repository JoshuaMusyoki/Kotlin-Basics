fun displayMessageAlert(operatingSystem: String, emailId: String): String {
    return "There's a new sign-in request on $operatingSystem for your Google Account $emailId."
}
fun PEDOMETERstepsToCalories(NumberOfSteps:Int):Double{
    val caloriesBURNEDEachStep=0.04
    val TotalCALORIESburned=NumberOfSteps*caloriesBURNEDEachStep;
    return TotalCALORIESburned
}
fun main()
{
    val operatingSystem = "ChromeOS"
    val emailId = "musyokijoxhua@gmail.com"

    val message = displayMessageAlert(operatingSystem, emailId)
    println(message)

    val Steps=4000
    val caloriesBurned=PEDOMETERstepsToCalories(Steps)
    println("Walking $Steps burns $caloriesBurned calories")
    val a=2
    val b=3
    var sum=a+b
    val sum2=sum+1
var sum3=sum2-1
    sum3-=1
    sum3++
    println(sum)
    println(sum2)
    println(sum3)

}