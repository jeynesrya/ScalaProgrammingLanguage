object Greeting {
  val time = "AM"

  val greeting: String = if (time.equals("AM")) "Hello"; else "Goodbye";

  val dog = "spot"
  val message: String = dog match {
    case "fido" => "Hello Boy!"
    case "fluffy" => "Hello Girl!"
    case "spot" => "Hello Spot!"
  }

  def main(args: Array[String]){
    println(greeting)

    time match {
      case "AM" => println("Hello")
      case "PM" => println("Goodbye")
    }

    println(message)
  }
}

/**
 * OUTPUT:
 *
 * Hello
 * Hello
 * Hello Spot!
 */