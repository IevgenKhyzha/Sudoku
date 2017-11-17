package my.sudoku.main;

import ThirdClass.ThirdModule;
import my.sudoku.logic.LogicMain;

/**
 * Created by Андрей on 12.11.2017.
 */
public class SudokuGame {
    public static void main(String[] args) {
        LogicMain logicMain = new LogicMain();
        ThirdModule thirdModule = new ThirdModule();
        System.out.println(logicMain.logic());
        System.out.println(logicMain.nextMethod());
        System.out.println(logicMain.nextMetho());
        System.out.println(thirdModule.thirdClass());
    }
}
