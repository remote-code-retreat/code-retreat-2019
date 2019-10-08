module GameOfLifeTest exposing (..)

import Expect exposing (Expectation)
import GameOfLife exposing (..)
import Test exposing (..)


suite : Test
suite =
    describe "A Game Of Life"
        [ test "Game Of Life is defined" <|
            \_ ->
                Expect.equal GameOfLife {}
        ]
