package my.sudoku.logic.squares;

import my.sudoku.logic.Cell;
import my.sudoku.logic.Square;

/**
 * Created by Андрей on 17.11.2017.
 */
public class Square2 extends Square {


    @Override
    public Cell[][] createSquare() {
        return new Cell[][]{{new Cell(6, false), new Cell(1, true), new Cell(3, true), new Cell(2, false), new Cell(5, true), new Cell(4, false)},
                {new Cell (2, false), new Cell(4, false), new Cell(5, true), new Cell(3, false), new Cell(6, false), new Cell(1, false)},
                {new Cell(5, true), new Cell(2, false), new Cell(6, false), new Cell(4, true), new Cell(1, true), new Cell(3, false)},
                {new Cell(1, true), new Cell(3, false), new Cell(4,false), new Cell(5, false), new Cell(2, false), new Cell(6,false)},
                {new Cell(4,false), new Cell(6, false), new Cell(2,true), new Cell(1,true), new Cell(3, false), new Cell(5, true)},
                {new Cell(3,true), new Cell(5,false), new Cell(1, true), new Cell(6, false), new Cell(4, true), new Cell(2, false)}
        };
    }
}
