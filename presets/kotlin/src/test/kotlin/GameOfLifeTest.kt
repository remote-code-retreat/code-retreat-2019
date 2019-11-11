
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions

class GameOfLifeTest {
    @Test
    fun `should Return Foo For Checking Test Enviroment Is Working Correctly`() {
        val gameOfLife = GameOfLife()

        Assertions.assertEquals("foo", gameOfLife.nextGeneration())
    }
}
