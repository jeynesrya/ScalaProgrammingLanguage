abstract class Animal(val name: String) {
  def style(): String
  def speak(s: String): Unit = println(name + " " +  style() + " " + s.toUpperCase)
}
