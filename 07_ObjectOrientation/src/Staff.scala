class Staff(val name: String, private val password: Int) {
  def login(): Boolean = {
    password == 1234
  }

  def login(pin: Int): Boolean = {
    pin == password
  }
}
