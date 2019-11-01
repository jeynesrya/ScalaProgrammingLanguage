object PeopleCombine {
  var names: List[String] = List(
    "Michael Burgess", "Sherlock Holmes",
    "John Watson", "        "
  )

  val city: Option[String] = Some("London")
  val day: Option[String] = None

  val capitals: Map[String, String] = Map(
    "London" -> "UK",
    "Paris"  -> "FR"
  )

  val dates: List[(Int, Int, Int)] = List(
    (3, 12, 1900),
    (4, 11, 1901),
    (7, 12, 1902)
  )

  def main(args: Array[String]): Unit = {

    names.map((n: String) => println(s"Length($n):" + n.length()))
    names.map((n: String) => println(s"isEmpty($n):" + n.isEmpty()))

    // Remove empty
    names.filter(_.trim.length > 0).map((n: String) => println("FName:" + n.split(" ")(1)))

    println("-----")

    println(city.map({_.toUpperCase()}))
    println(day.map({_.toUpperCase()}))

    println("-----")

    val parts = names.filter(_.trim.length > 0).map({_.split(" ")})
    println(parts(0)(0))
    println(parts.last.last)

    println("-----")

    val splitNames: List[String] = names.flatMap(_.split(" "))
    splitNames.foreach((n: String) => println(n))

    println("-----")

    val lookup: String => Option[String] = capitals.get
    println(city.flatMap(lookup))

    println("-----")

    println(names.filter(_.trim.length > 0).reduce({ _.split(" ")(0) + _.split(" ")(0)}))

    println("-----")

    if (names.forall((n: String) => n.contains(" "))) {
      println("every name has a space!")
    }

    if (dates.forall((date => date._2 > 10))) {
      println("Nope")
    }

    if (dates.exists(date => date._1 == 1)) {
      println("Yup")
    }

    names.foreach(name => println(name))
    dates.foreach(date => println(date._3))

    println("-----")

    // rewrite as for-comprehension
    //names flatMap {  _.split(" ") } foreach println
    for (name <- names.map(_.split(" "))) name.foreach(println(_))
  }
}

/**
 * OUTPUT:
 * Length(Michael Burgess):15
 * Length(Sherlock Holmes):15
 * Length(John Watson):11
 * Length(        ):8
 * isEmpty(Michael Burgess):false
 * isEmpty(Sherlock Holmes):false
 * isEmpty(John Watson):false
 * isEmpty(        ):false
 * FName:Burgess
 * FName:Holmes
 * FName:Watson
 * -----
 * Some(LONDON)
 * None
 * -----
 * Michael
 * Watson
 * -----
 * Michael
 * Burgess
 * Sherlock
 * Holmes
 * John
 * Watson
 * -----
 * Some(UK)
 * -----
 * MichaelSherlockJohn
 * -----
 * every name has a space!
 * Nope
 * Michael Burgess
 * Sherlock Holmes
 * John Watson
 *
 * 1900
 * 1901
 * 1902
 * -----
 * Michael
 * Burgess
 * Sherlock
 * Holmes
 * John
 * Watson
 */
