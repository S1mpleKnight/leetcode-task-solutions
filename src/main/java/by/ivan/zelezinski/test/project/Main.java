package by.ivan.zelezinski.test.project;


import by.ivan.zelezinski.test.project.task36.Solution36;

public class Main {
    public static void main(String[] args) {
        Solution36 solution36 = new Solution36();
        char[][] array = new char[][]{
                {'8','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}       
        };
        System.out.println(solution36.isValidSudoku(array));
    }
}