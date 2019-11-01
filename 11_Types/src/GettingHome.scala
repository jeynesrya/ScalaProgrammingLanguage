object GettingHome {
  def distance(start: Location, end: Location): Double = end.loc._2 - start.loc._2

  def cost(s: Location, e: Location, v: Vehicle): Double = v match {
    case Car(c) => c * distance(s, e)
    case Bus(b) => b * distance(s, e)
  }

  def minPrice(s: Location, e: Location, vehicles: Seq[Vehicle]): Vehicle =
    vehicles.reduce((v1: Vehicle, v2: Vehicle) => if (cost(s, e, v1) < cost(s, e, v2)) v1 else v2)

  val home = Location(0, 1)
  val work = Location(0, 3)

  def main(args: Array[String]): Unit = {
    println(minPrice(home, work, List(Car(11), Car(7), Bus(6))))
  }
}

/**
 * OUTPUT:
 *
 * Bus(6.0)
 */
