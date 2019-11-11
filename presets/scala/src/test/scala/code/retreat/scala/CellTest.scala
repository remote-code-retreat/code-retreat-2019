package code.retreat.scala

import org.scalatest._
import org.scalatest.Matchers._

class CellTest extends WordSpec {
  "Cell" should {
    "Return not dead if the Cell is alive" in {
      val cell = Cell(isAlive = true)
      cell.isAlive should not be cell.isDead
    }
  }
}
