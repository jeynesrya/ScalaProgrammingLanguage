class User(val name: String, private val password: Int) {
  def login(): Boolean = {
    password == 1234
  }
}
