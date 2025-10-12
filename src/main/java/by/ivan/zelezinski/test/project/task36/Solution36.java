package by.ivan.zelezinski.test.project.task36;

public class Solution36 {
    public boolean isValidSudoku(char[][] board) {
        for (int k = 0; k < board.length; k++) {
            if(!isRowValid(board, k)) {
                return false;
            }
            if (!isColumnValid(board, k)){
                return false;
            }
        }
         if (!isSquareValid(board, 1, 1)){
             return false;
         }
         if (!isSquareValid(board, 1, 4)){
             return false;
         }
         if (!isSquareValid(board, 1, 7)){
             return false;
         }
         if (!isSquareValid(board, 4, 1)){
             return false;
         }
         if (!isSquareValid(board, 4, 4)){
             return false;
         }
         if (!isSquareValid(board, 4, 7)){
             return false;
         }
         if (!isSquareValid(board, 7, 1)){
             return false;
         }
         if (!isSquareValid(board, 7, 4)){
             return false;
         }
        return isSquareValid(board, 7, 7);
    }

    private boolean isSquareValid(char[][] board, int iCenter, int jCenter) {
        boolean[] states = new boolean[9];
        int value = getValue(board, iCenter, jCenter);
        if (!(isValidCurrentStep(states, value))) {
            return false;
        }
        value = getValue(board, iCenter - 1, jCenter - 1);
        if (!(isValidCurrentStep(states, value))) {
            return false;
        }
        value = getValue(board, iCenter - 1, jCenter);
        if (!(isValidCurrentStep(states, value))) {
            return false;
        }
        value = getValue(board, iCenter - 1, jCenter + 1);
        if (!(isValidCurrentStep(states, value))) {
            return false;
        }
        value = getValue(board, iCenter, jCenter - 1);
        if (!(isValidCurrentStep(states, value))) {
            return false;
        }
        value = getValue(board, iCenter, jCenter + 1);
        if (!(isValidCurrentStep(states, value))) {
            return false;
        }
        value = getValue(board, iCenter + 1, jCenter - 1);
        if (!(isValidCurrentStep(states, value))) {
            return false;
        }
        value = getValue(board, iCenter + 1, jCenter);
        if (!(isValidCurrentStep(states, value))) {
            return false;
        }
        value = getValue(board, iCenter + 1, jCenter + 1);
        return isValidCurrentStep(states, value);
    }

    private boolean isValidCurrentStep(boolean[] states, int value) {
        if (value != -1) {
            if (!states[value]) {
                states[value] = true;
                return true;
            } else {
                return false;
            }
        }
        return true;
    }

    private int getValue(char[][] board, int i, int j) {
        char symbol = board[i][j];
        return symbol == '.'
                ? -1
                : (symbol - '0') - 1;
    }

    private boolean isRowValid(char[][] board, int i) {
        boolean[] states = new boolean[9];
        for (int j = 0; j < board.length; j++) {
            char symbol = board[i][j];
            if (symbol != '.') {
                int index = (symbol - '0') - 1;
                if (!states[index]) {
                    states[index] = true;
                } else {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean isColumnValid(char[][] board, int j) {
        boolean[] states = new boolean[9];
        for (int i = 0; i < board.length; i++) {
            char symbol = board[i][j];
            if (symbol != '.') {
                int index = (symbol - '0') - 1;
                if (!states[index]) {
                    states[index] = true;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
