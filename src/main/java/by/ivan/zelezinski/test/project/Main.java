package by.ivan.zelezinski.test.project;


import by.ivan.zelezinski.test.project.task37.Solution37;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution37 solution37 = new Solution37();
        char[][] array = new char[][]{
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}       
        };
        System.out.println(solution37.solveSudoku(array));
        for (char[] row : array) {
            System.out.println(Arrays.toString(row));
        }
    }
}