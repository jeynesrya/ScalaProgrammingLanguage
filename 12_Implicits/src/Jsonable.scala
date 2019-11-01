trait Jsonable[J] {
  def toJson(j: J): String
}
