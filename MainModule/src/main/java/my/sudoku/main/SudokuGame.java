package my.sudoku.main;

import my.sudoku.gui.frames.SudokuFrame;
import my.sudoku.logic.LogicMain;
import my.sudoku.logic.squares.Square1;

/**
 * Created by Андрей on 12.11.2017.
 */
public class SudokuGame {

    public static void main(String[] args) {

        LogicMain logicMain = new LogicMain();
        final SudokuFrame sudokuFrame = new SudokuFrame();
        logicMain.setActualValues(sudokuFrame.matrixButtonCells, new Square1().getSquare());

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                sudokuFrame.createGameFrame();
            }
        });
    }
}
