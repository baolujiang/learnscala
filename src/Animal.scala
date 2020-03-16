class Animal(var name:String, var sound:String) {

  private var id=Animal.newIdNum

  def setName(name: String) = {
    if (!name.matches(".*\\d+.*"))
    this.name=name
    else
      this.name="invalid name"
  }

  def getName()=this.name

  this.setName(name)

  def setSound(sound:String)={this.sound=sound}
  def this(name:String){
    this(name,"no sound")
  }
  override def toString():String ="%d: name=%s, sound=%s".format(this.id, this.name,this.sound)
}

object Animal {
  private var idNumber=0
  private def newIdNum={idNumber+=1; idNumber}
}