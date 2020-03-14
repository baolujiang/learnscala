object hello extends App {
  def main1(args: Array[String]): Unit = {

  }

  def getArea(radius:Double):Double=math.Pi*radius*radius

  var r=5.0
  
  printf(s"the area of a circe with radius $r = ${getArea(r)}\n")

  println("Hello, World!")
  
  for (a <- args) println(a)

}

