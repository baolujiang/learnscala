abstract class Mammal(var name: String) {

  protected var moveSpeed: Double

  def getMoveSpeed():Double=moveSpeed

  def move: String

}

class Wolf(name:String ) extends Mammal(name){
protected var moveSpeed=35.0
  def move: String={
    return s"${this.name} moves at the speed of ${this.moveSpeed}"
  }
}