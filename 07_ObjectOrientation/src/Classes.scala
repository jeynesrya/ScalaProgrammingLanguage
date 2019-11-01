object Classes {
  val fred = new Human()
  val fido = new Dog()
  val p1 = new Person("ryan")

  val u1 = new User("user1", 1234)
  val u2 = new User("user2", 4321)

  val s1 = new Staff("staff1", 1234)
  val s2 = new Staff("staff2", 4321)

  def main(args: Array[String]): Unit = {
    println("fred class: " + fred.getClass.getName)
    println("fido class: " + fido.getClass.getName)

    println("-----")

    println("p1's name: " + p1.name)

    println("-----")

    println("u1 login: " + u1.login())
    println("u2 login: " + u2.login())

    println("-----")

    println("s1 login (no pass): " + s1.login())
    println("s1 login (pass): " + s1.login(4321))
    println("s2 login (no pass): " + s2.login())
    println("s2 login (pass): " + s2.login(4321))

    println("-----")

    val me = new Manager(0)
    me.pin_=(500)
    println(me.login())
  }
}

/**
 * OUTPUT:
 *
 * fred class: Human
 * fido class: Dog
 * -----
 * p1's name: ryan
 * -----
 * u1 login: true
 * u2 login: false
 * -----
 * s1 login (no pass): true
 * s1 login (pass): false
 * s2 login (no pass): false
 * s2 login (pass): true
 * -----
 * true
 *
 */