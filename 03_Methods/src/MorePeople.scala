object MorePeople {
  val lName: String = {
    val parts = "Sherlock Holmes".split(" ")
    parts(1)
  }
  val exampleCSV = "jefferson,pa$$,virginia,president"

  def main(args: Array[String]): Unit = {
    println(lName)
    parts(exampleCSV)
    println(getUsers("bob"))
    println(getUsers("bob-secure", "securePass"))
    println(printProfile("Irene", "Paris", "45"))
  }

  def parts(strCSV: String): Unit = {
    println(strCSV.split(",").mkString("\n"))
  }

  def getUsers(username: String, password: String = "pa$$"): Map[String, String] ={
    Map("username" -> username, "password" -> password)
  }

  // variadic
  def printProfile(args: String*): String = {
    args.last
  }
}

/**
 * OUTPUT:
 *
 * Holmes
 * jefferson
 * pa$$
 * virginia
 * president
 * Map(username -> bob, password -> pa$$)
 * Map(username -> bob-secure, password -> securePass)
 * 45
 */
