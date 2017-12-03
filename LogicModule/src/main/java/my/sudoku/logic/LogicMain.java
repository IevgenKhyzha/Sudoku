package my.sudoku.logic;


import my.sudoku.logic.squares.Square1;

import javax.swing.*;

/**
 * Created by Андрей on 12.11.2017.
 */
public class LogicMain {

    public void setActualValues(JButton[][] matrixButtonCells, Square square){
        Cell[][] cell = square.getSquare();
        for  (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                Cell actualCell = cell[i][j];
                if (actualCell.getIsVisible()) {
                    matrixButtonCells[i][j].setText(String.valueOf(actualCell.getValue()));
                }
            }
        }
    }
}
