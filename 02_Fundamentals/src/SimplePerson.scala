object SimplePerson {
  val name: String = "Ryan"
  var age: Double = 65
  val isBirthday: Boolean = true

  def main(args: Array[String]): Unit = {
    if (isBirthday) {
      age += 1
      age = Math.floor(age)
    } else
      age += 1.0/365

    println(age)
  }
}

/**
 * OUTPUT:
 *
 * 66.0
*/