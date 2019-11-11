package code.retreat.scala

import org.scalatest.{FlatSpec, Matchers}
import org.scalatestplus.scalacheck.ScalaCheckPropertyChecks

class CellSpec extends FlatSpec with Matchers with ScalaCheckPropertyChecks with ArbitraryCell {
  it should "a cell can be either alive or dead" in {
    forAll { cell: Cell =>
      cell.isAlive should not be cell.isDead
    }
  }
}
