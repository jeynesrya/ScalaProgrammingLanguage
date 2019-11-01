class Manager(private var password: Int) {
  def pin(): Unit = ()
  def pin_= (i: Int): Unit = password = i * 2
  def login(): Boolean = password == 1000
}