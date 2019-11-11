package code.retreat.scala

import org.scalacheck.Arbitrary

trait ArbitraryCell {
  implicit val arbitraryCell: Arbitrary[Cell] = Arbitrary {
    for {
      isAlive <- Arbitrary.arbitrary[Boolean]
    } yield Cell(isAlive)
  }
}
