package code.retreat.java;

public class Cell {

    private boolean alive;

    public void evolveWith(int neighbours) {
        alive = true;
    }

    public boolean isDead() {
        return !alive;
    }

    public boolean isAlive() {
        return alive;
    }

}
