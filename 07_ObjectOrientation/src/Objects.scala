object Objects {

  def main(args: Array[String]): Unit = {
    println(Earth.describe())

    val me = Employee(500)
    println(me.login())

    val people = List( Profile("Michael", 29), Profile("John", 39), Profile("Albert", 79) )
    println(people)

    for(p <- people) p match {
      case Profile(n, a) => println(s"$n is $a years old!")
    }

  }
}

/**
 * OUTPUT:
 *
 * There are 7.1 B people on earth
 * true
 * List(Profile(Michael,29), Profile(John,39), Profile(Albert,79))
 * Michael is 29 years old!
 * John is 39 years old!
 * Albert is 79 years old!
 */
