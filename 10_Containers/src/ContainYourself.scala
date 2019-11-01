object ContainYourself {

  def getRow(index: Int): Option[(String, Int)] = {
    val database = Map(
      1 -> ("michael", 1234),
      2 -> ("tom", 8888)
    )

    database.get(index)
  }

  def getPassword(pin: Int): Option[(String)] = {
    if (pin == 1234) {
      Some("pa$$")
    } else {
      None
    }
  }

  def main(args: Array[String]): Unit = {
    for {
      user <- getRow(1)
      _ <- getPassword(user._2)
    } println(s"${user._1} authenticated!")

    for {
      user <- getRow(2)
      _ <- getPassword(user._2)
    } println(s"${user._2} authenticated!")

    println("-----")

    import scala.util._

    def div(x: Int, y: Int) = Try { x / y }

    val resultA: Try[Int] =  div(10, 10)
    val resultB: Try[Int] =  div(20, 10)
    val resultC: Try[Int] =  div(30, 0)

    val sumAB = for {
      a <- resultA
      b <- resultB
    } yield a + b

    val sumABC = for {
      a <- resultA
      b <- resultB
      c <- resultC
    } yield a + b + c

    sumAB match {
      case Success(v) =>
        println(v)
      case Failure(e) =>
        println(e)
    }

    sumABC match {
      case Success(v) =>
        println(v)
      case Failure(e) =>
        println(e)
    }

    println("-----")

    def animals(): Seq[String] = Seq("Lion", "Tiger", "Dog")
    animals() match {
      case Nil =>
      case h :: t => println("head: " + h + ", tail: " + t)
    }

    println("-----")

    def interval(v: Vector[Int], initial: Int, diff: Int): Int = {
      v(diff+initial) - v(initial)
    }

    val distances = (10 to 1000 by 100).toVector
    println(interval(distances,0,5))
    println(interval(distances,1,6))

    println("-----")

    val animalTypes = Map("Cat" -> "Mammal", "Raven" -> "Bird")
    for ((animal, kind) <- animalTypes) println(s"$animal is a $kind")

    println("-----")

    val ports = (1 to 100).toSet
    val openPorts = Set(80, 22)
    val closedPorts = ports.diff(openPorts)

    println("Closed Ports: " + closedPorts)
    println("Is 100 closed? -> " + closedPorts.contains(100))

    println("-----")

    val names = List("Michael", "Mark", "Tim")
    val cols = Array("Purple", "Green", "Blue")

    for ((n, c) <- names.zip(cols)) println(s"$n likes $c")

    println("-----")

    val letters = "ABCD"
    val letterList = letters.toList

    println(letterList)

    val countries = List("UK", "UK", "US")
    val countrySet = countries.toSet

    println(countrySet)

    val person = List( ("name", "sherlock"),  ("email", "s@example.com") )
    val personMap = person.toMap

    println(personMap)
  }
}

/**
 * OUTPUT:
 *
 * michael authenticated!
 * -----
 * 3
 * java.lang.ArithmeticException: / by zero
 * -----
 * head: Lion, tail: List(Tiger, Dog)
 * -----
 * 500
 * 600
 * -----
 * Cat is a Mammal
 * Raven is a Bird
 * -----
 * Closed Ports: HashSet(5, 84, 69, 88, 10, 56, 42, 24, 37, 25, 52, 14, 20, 46, 93, 57, 78, 29, 61, 89, 1, 74, 6, 60, 85, 70, 21, 33, 28, 38, 92, 65, 97, 9, 53, 77, 96, 13, 41, 73, 2, 45, 64, 17, 32, 34, 44, 59, 27, 71, 12, 54, 49, 86, 81, 76, 7, 39, 98, 91, 66, 3, 35, 48, 63, 18, 95, 50, 67, 16, 31, 11, 72, 43, 99, 87, 40, 26, 55, 23, 8, 75, 58, 82, 36, 30, 51, 19, 4, 79, 94, 47, 15, 68, 62, 90, 83, 100)
 * Is 100 closed? -> true
 * -----
 * Michael likes Purple
 * Mark likes Green
 * Tim likes Blue
 * -----
 * List(A, B, C, D)
 * Set(UK, US)
 * Map(name -> sherlock, email -> s@example.com)
 */
