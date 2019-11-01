object Contracts {
  val isq: IndexedSeq[String] = IndexedSeq("A", "B", "C")
  val openables: List[Openable] = List(new Box(), new Website(), new Box())

  def show(seq: Seq[String]): Unit = {
    seq.foreach(println(_))
  }

  def main(args: Array[String]): Unit = {
    println(isq.getClass.getName)
    show(isq)
    show(List("H","I"))
    show("Hello".map(_.toString))

    for(o <- openables) println(o.open(100))
  }
}

/**
 * OUTPUT:
 *
 * scala.collection.immutable.Vector
 * A
 * B
 * C
 * H
 * I
 * H
 * e
 * l
 * l
 * o
 * false
 * true
 * false
 */
