trait Locked extends Openable {
  def open(p: Int): Boolean = false
}