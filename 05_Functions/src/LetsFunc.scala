object LetsFunc {
  val paint: String => String = (s: String) => s.toLowerCase()
  val format: String => String = (s: String) => "!" + s + "!"
  var fn: String => String = paint
  val timeOfDay: String = "AM"

  val formatShort: String => String = "!" + _ + "!"

  val f1: String => String = (s: String) => s"£ $s £"
  val f2: String => String = (s: String) => s"% $s %"
  val f3: String => String = (s: String) => s"& $s &"

  def main(args: Array[String]): Unit = {
    println(paint("Lets Make A Lego Model"))
    println(format("Lets Make A Lego Model"))

    if (timeOfDay.equals("AM")) {
      fn = format
    }

    println(fn("Try Again"))
    println(formatShort("Testing short formatter"))

    val fnList = List(f1, f2, f3)

    import scala.util.Random
    val rndFn = Random.shuffle(fnList).head
    println(rndFn("Great Building Skills"))
  }
}

/**
 * OUTPUT:
 *
 * lets make a lego model
 * !Lets Make A Lego Model!
 * !Try Again!
 * !Testing short formatter!
 * % Great Building Skills %
 */
