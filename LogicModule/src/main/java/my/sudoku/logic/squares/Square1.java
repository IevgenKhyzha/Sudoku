package my.sudoku.logic.squares;

import my.sudoku.logic.Cell;
import my.sudoku.logic.Square;

public class Square1 extends Square{

    @Override
    public Cell[][] createSquare() {
        return new Cell[][]{{new Cell(4, true), new Cell(5, true), new Cell(6, false), new Cell(2, false), new Cell(1, false), new Cell(3, false)},
                {},
                {},
                {},
                {},
                {}
        };
    }
}
