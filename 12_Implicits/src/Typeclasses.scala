object Typeclasses {
  def send[J](o: J)(implicit inst: Jsonable[J]): Unit =
    println(inst.toJson(o))

  implicit object AJ extends Jsonable[Address] {
    override def toJson(a: Address) = s"""{"street": "${a.street}"}"""
  }

  implicit object ccJ extends Jsonable[CreditCard] {
    override def toJson(cc: CreditCard) = s"""{"cc-no": "${cc.number}"}"""
  }

  def jsonableInstance[J](convertor: J => String): Jsonable[J] = (j: J) => convertor(j)

  implicit val CJ: Jsonable[Customer] = jsonableInstance(
    (c: Customer) => s"""{"name": "${c.name}"}"""
  )

  def main(args: Array[String]): Unit = {
    send(Address("150 Polly Street"))
    send(CreditCard(1234561))
    send(Customer("Ryan"))
  }
}

/**
 * OUTPUT:
 *
 * {"street": "150 Polly Street"}
 * {"cc-no": "1234561"}
 * {"name": "Ryan"}
 *
 */