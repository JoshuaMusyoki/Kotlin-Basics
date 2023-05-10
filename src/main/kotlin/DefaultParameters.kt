fun displayAlertMessage(emailId: String, firstUserEmailId: String): String {
    val secondUserEmailId = ""
    val emailId = firstUserEmailId
    return "$emailId\n$secondUserEmailId"
}

fun main() {
    val firstUserEmailId = "musyokijoxhua@gmail.com"
    val secondUserEmailId2= "chris@swahilipothub.co.ke"
    println(displayAlertMessage(firstUserEmailId, secondUserEmailId2))

    val secondUserOperatingSystem = "Ubuntu 22.04"
    val secondUserEmailId = "rahma254@gmail.com"
    println(displayAlertMessage(secondUserEmailId, secondUserEmailId))

    val thirdUserOperatingSystem = "Mac OS"
    val thirdUserEmailId = "james@gmail.com"
    println(displayAlertMessage(thirdUserEmailId, thirdUserEmailId))
}
