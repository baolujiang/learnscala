trait Flyable {
  def fly: String
}

trait BulletProof {
  def hitByBullet: String

  def richochet(startSpeed: Double): String = "the speed of bullet is %.1f".format(startSpeed * .75)
}

class SuperHero(name: String) extends Flyable with BulletProof {
  def fly = "%s fly through the air.".format(this.name)

  def hitByBullet: String = "the bullet bounces off %s".format(this.name)
}
