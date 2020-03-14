object hello extends App {
  def main1(args: Array[String]): Unit = {

  }

  def getArea(radius:Double):Double=math.Pi*radius*radius

  printf(s"the area of a circe with radius 5 = ${getArea(5)}")

  println("Hello, World!")
  for (a <- args) println(a)


}

