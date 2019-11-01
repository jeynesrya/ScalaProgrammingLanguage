class House(l: String, val owner: String) extends Building(l) {
  override def toString: String = super.toString + ", " + owner
}