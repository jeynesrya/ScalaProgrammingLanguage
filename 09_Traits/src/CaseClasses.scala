object CaseClasses {
  def main(args: Array[String]): Unit = {
    val colors = List(Red(1.0), Blue(2.0), Green(4.0), Gold)

    for (color <- colors) color match {
      case _: Red => println(s"Red: ${color.percent}%")
      case _: Blue => println(s"Blue: ${color.percent}%")
      case _: Green => println(s"Red: ${color.percent}%")
      case Gold => println("Shimmers!")
    }
  }
}
