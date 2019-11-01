object Implicits {
  implicit class DocOperator(d: Document) {
    def show(): Unit = {
      d match {
        case Image(i) => println(i)
        case Video(v) => println(v)
        case _ =>
      }
    }
  }

  implicit val cvt: Convertor = new Convertor
  def process(ds: List[Document])(implicit cvt: Convertor): Unit = for (d <- ds) cvt.convert(d).show()

  def main(args: Array[String]): Unit = {
    val docs: List[Document] = List(Image("one"), Image("two"), Video("three"))
    for (d <- docs) d.show()

    println("-----")

    process(docs)

    println("-----")


  }
}
