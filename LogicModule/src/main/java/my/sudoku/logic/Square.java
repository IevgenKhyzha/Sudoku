package my.sudoku.logic;

public abstract class Square {

    public abstract Cell[][] createSquare();

    public Cell[][] getSquare() {
        return createSquare();
    }
}
