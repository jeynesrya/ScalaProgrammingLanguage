class Box() extends Openable {
  def open(pin: Int): Boolean = {
    pin > 100
  }
}
