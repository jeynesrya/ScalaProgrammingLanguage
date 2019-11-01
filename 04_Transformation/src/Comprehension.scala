object Comprehension {
  val mixed: List[Any] = List(1, "2", false, 3.4)
  val people: List[String] = List("Michael 10", "John 20", "Watson 40")

  def main(args: Array[String]): Unit = {
    for (n <- mixed) println(n)

    for (i <- 1 to 3) {
      println("Ho!")
    }

    val newMixed: List[String] = for (m <- mixed) yield {
      m.toString
    }
    println(newMixed)

    val ages: List[Int] = for (p <- people) yield {
      p.split(" ")(1).toInt
    }
    println("Total of ages: " + ages.sum / ages.length)

    printAdults(people)
    createGrid()
  }

  def printAdults(people: List[String]): Unit = {
    for (p <- people) {
      val parts = p.split(" ")
      if (parts(1).toInt > 18) {
        println(s"you're allowed in ${parts(0)}")
      }
    }
  }

  def createGrid(): Unit = {
    val row = for(_ <- 1 to 5) yield "."
    val grid = for(_ <- 1 to 5) yield row
    for(row <- grid) println(row.mkString)
  }
}

/**
 * OUTPUT:
 *
 * 1
 * 2
 * false
 * 3.4
 * Ho!
 * Ho!
 * Ho!
 * List(1, 2, false, 3.4)
 * Total of ages: 23
 * you're allowed in John
 * you're allowed in Watson
 * .....
 * .....
 * .....
 * .....
 * .....
 */
