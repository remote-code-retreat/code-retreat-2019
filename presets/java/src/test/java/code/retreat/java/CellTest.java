package code.retreat.java;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CellTest {


    @Test
    public void a_new_cell_is_in_dead_state() throws Exception {
        var cell = new Cell();

        assertTrue(cell.isDead());
    }
    
    @Test
    public void a_cell_with_2_neighbours_evolves_to_alive() throws Exception {
        var cell = new Cell();
        cell.evolveWith(2);

        assertTrue(cell.isAlive());
    }

}