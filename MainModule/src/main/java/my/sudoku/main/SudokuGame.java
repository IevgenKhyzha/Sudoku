package my.sudoku.main;

import my.sudoku.gui.frames.SudokuFrame;
import my.sudoku.logic.LogicMain;

/**
 * Created by Андрей on 12.11.2017.
 */
public class SudokuGame {

    public static void main(String[] args) {

        LogicMain logicMain = new LogicMain();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SudokuFrame().createGameFrame();
            }
        });
    }
}
