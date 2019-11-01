object ComplexPerson {
  val person: (String, Int) = ("Sherlock Holmes", 27)
  val pName: String = person._1
  val pAge: Int = person._2

  val data = "hobbies:photography-portraiture;programming-functional;drinking-beer"
  val categories: String = data.split(":")(1).split(";").mkString(", ")

  val city: Option[String] = Some("Manchester")
  val country: Option[String] = None

  val price: Option[Double] = Some(13.5)
  val rate: Option[Double] = None

  val birthday: (Int, Int, Int) = (12, 1, 1912)
  val myBirthday = "12-1-1912"
  val parts: Array[String] = myBirthday.split("-")

  def main(args: Array[String]): Unit ={
    print(s"My Name is $pName\n")
    print(s"My Age is $pAge\n")
    print(s"My Hobbies are $categories\n")

    println(city.getOrElse("Somewhere"))
    println(country.getOrElse("Somewhere in Europe, I assume."))

    println(price.getOrElse(1.0) * rate.getOrElse(1.0))

    if (parts(0).toInt == birthday._1 && parts(1).toInt == birthday._2 && parts(2).toInt == birthday._3) {
      println("Happy Birthday!")
    }
  }
}

/**
 * OUTPUT:
 *
 * My Name is Sherlock Holmes
 * My Age is 27
 * My Hobbies are photography-portraiture, programming-functional, drinking-beer
 * Manchester
 * Somewhere in Europe, I assume.
 * 13.5
 * Happy Birthday!
 */
