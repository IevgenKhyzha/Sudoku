package my.sudoku.logic;

public abstract class Square {

//    protected Cell[][] cell;

    public abstract Cell[][] createSquare();

    public Cell[][] getSquare() {
        return createSquare();
    }
}
