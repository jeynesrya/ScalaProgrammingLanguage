class Employee private (val password: Int) {

  def login() = password == 1000

}

object Employee {
  val SHIFT = 500

  def apply(p: Int) = new Employee(p + SHIFT)
}