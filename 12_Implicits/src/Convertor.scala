class Convertor {
  def convert(d: Document): Document = d match {
    case Image(i) => Image(i.toUpperCase)
    case Video(v) => Video(v.toLowerCase)
  }
}
