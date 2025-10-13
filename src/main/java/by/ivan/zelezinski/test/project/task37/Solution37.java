package by.ivan.zelezinski.test.project.task37;

import java.util.Arrays;

public class Solution37 {

    private static char[] numbers = new char[]{
            '1', '2', '3', '4', '5', '6', '7', '8', '9'
    };

    public boolean solveSudoku(char[][] board) {
        char[][] copy = Arrays.copyOf(board, 9);
        return trySolve(copy, 0, 0, 0);
    }

    private boolean trySolve(char[][] board, int i, int j, int initValue) {
        while (i != - 1 && getValue(board, i, j) != -1) {
            int[] nextCoordinates = getNextCoordinates(i, j);
            i = nextCoordinates[0];
            j = nextCoordinates[1];
        }
        if (i == -1 && j == -1) {
            return true;
        }

        for (int k = initValue; k < board.length; k++) {
            boolean solved = trySolveCell(board, i, j, k);
            if (!solved) {
                board[i][j] = '.';
                continue;
            } else {
                int[] nextCoordinates = getNextCoordinates(i, j);
                boolean nextCellTry = trySolve(board, nextCoordinates[0], nextCoordinates[1], 0);
                if (!nextCellTry) {
                    board[i][j] = '.';
                } else {
                    return true;
                }
            }
        }

        return false;
    }

    private int[] getNextCoordinates(int i, int j) {
        if (j < numbers.length - 1) {
            j++;
            return new int[]{i, j};
        } else {
            if (i == numbers.length - 1) {
                return new int[]{-1, -1};
            } else {
                i++;
                j = 0;
                return new int[]{i, j};
            }
        }
    }

    private boolean trySolveCell(char[][] board, int i, int j, int k) {
        char number = numbers[k];
        board[i][j] = number;
        if (!isColumnValid(board, j)) {
            return false;
        }
        if (!isRowValid(board, i)) {
            return false;
        }
        return validateSquare(board, i, j);
    }

    private boolean validateSquare(char[][] board, int i, int j) {
        if (i <= 2) {
            i = 1;
        } else if (i <= 5) {
            i = 4;
        } else {
            i = 7;
        }
        if (j <= 2) {
            j = 1;
        } else if (j <= 5) {
            j = 4;
        } else {
            j = 7;
        }
        return isSquareValid(board, i, j);
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
