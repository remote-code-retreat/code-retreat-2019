package code.retreat.scala

case class Cell(isAlive: Boolean) {
  val isDead: Boolean = !isAlive
}
