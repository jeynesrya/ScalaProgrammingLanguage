object Inherit {
  def main(args: Array[String]): Unit = {
    val newUser = new Guest
    println(newUser.isInstanceOf[User])
    println(newUser.isInstanceOf[Admin])

    println("-----")

    val building = new Building("UK")
    println(building.toString)
    val house = new House("UK", "Ryan")
    println(house.toString)

    println("-----")

    new Lion("Penny").speak("great!")
  }
}

/**
 * OUTPUT:
 *
 * true
 * false
 * -----
 * UK
 * UK, Ryan
 * -----
 * Penny grrs GREAT!
 */
