package my.sudoku.logic;


import javax.swing.*;

/**
 * Created by Андрей on 12.11.2017.
 */
public class LogicMain {

    public void setActualValues(JButton[][] matrixButtonCells, Cell[][] cells){
        for  (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                Cell actualCell = cells[i][j];
                if (actualCell.getIsVisible()) {
                    matrixButtonCells[i][j].setText(String.valueOf(actualCell.getValue()));
                }
            }
        }
    }
}
