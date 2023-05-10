
    fun birthdayGreetings(name: String, age:Int): String{
        val nameBirthdayGreetings="Happiest Birthday $name."
        val ageBirthdayGreetings="You are turning $age Years Old!!"
        val name1=""

        return "$nameBirthdayGreetings\n$ageBirthdayGreetings"
        return "You are a blessing  $name. Congratulations for turning $age Old."

    }
    fun main(){
        println(birthdayGreetings(name = "Joshua",23))
        println(birthdayGreetings("Jane",21))
        println(birthdayGreetings(name= "Joab", age = 25))
        println(birthdayGreetings(name = "Karimi", age = 30))
        }
