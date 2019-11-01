object KindsOfPeople {
  val myName: Option[String] = Some("Sherlock")
  val myAge: Option[Int] = Some(28)
  val myTitle: Option[String] = None

  val myHobbies: List[String] = List("forensic science", "violin playing")
  val myJobs: List[String] = List("detecting", "collecting")
  val myFavPeople: List[String] = Nil


  def main(args: Array[String]): Unit = {
    if (myTitle |+| myName) {

    }
  }
}
