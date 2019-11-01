object Bar {
  val barDistance = 100
  val barCrowd = 50
  val barBeer = 5

  val isFree: Boolean = barBeer == 0
  val isBusy: Boolean = barCrowd > 25
  val isClose: Boolean = barDistance < 500
  val isCheap: Boolean = barBeer < 3.50

  def main(args: Array[String]): Unit = {
    if (!isClose && isCheap) {
      println("GOING TO BAR!")
    } else {
      println("NOT GOING TO BAR!")
    }

    if (isBusy && (isCheap || isCheap)) {
      println("It'll do!")
    } else {
      println("Nope, won't do!")
    }
  }
}

/**
 * OUTPUT:
 *
 * NOT GOING TO BAR!
 * Nope, won't do!
 */
