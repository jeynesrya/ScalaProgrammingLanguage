object Implementation {
  def main(args: Array[String]): Unit = {
    val lockedOpenables = List(new Secret with Locked, new Website)

    for(lo <- lockedOpenables) println(lo.open(100))
  }
}
