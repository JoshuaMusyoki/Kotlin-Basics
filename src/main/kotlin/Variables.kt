//Creating classes and Instances
//To define a class, use the class keyword.
//Properties of a class can be listed in its declaration or body.
open class shape(open var height:Double, open var length: Double){
    open var perimeter=(height + length)*2
    var perimeter2=(height+length)/2

}
fun main(){
    val rectangle=shape(5.0, 2.0)
    val triangle=shape(12.0,6.0)
    println("The perimeter of the Rectangle Shape is ${rectangle.perimeter}")
    println("The perimeter of the Triangle is ${triangle.perimeter2}")
}
//nheritance between classes is declared by a colon (:).
// Classes are final by default; to make a class inheritable, mark it as open
class Triangle(override var height: Double, override var length: Double): shape(height, length) {
  override var perimeter=(height+length)/2

}