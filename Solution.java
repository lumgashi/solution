

public class Solution {
    public static void main(String[]args){

        int [][] sample = {
                {1, 2, 3, 4, 5, 6, 7, 8, 9},
                {4, 5, 6, 7, 8, 9, 1, 2, 3},
                {7, 8, 9, 1, 2, 3, 4, 5, 6},
                {9, 1, 2, 3, 4, 5, 6, 7, 8},
                {3, 4, 5, 6, 7, 8, 9, 1, 2},
                {6, 7, 8, 9, 1, 2, 3, 4, 5},
                {8, 9, 1, 2, 3, 4, 5, 6, 7},
                {2, 3, 4, 5, 6, 7, 8, 9, 1},
                {5, 6, 7, 8, 9, 1, 2, 3, 4}
        };
        System.out.println(solveSoduku(sample));

        int [][] columnError = {
                {4, 3, 5, 2, 6, 9, 7, 8, 1},
                {6, 8, 2, 5, 7, 1, 4, 9, 3},
                {1, 9, 7, 8, 3, 4, 5, 6, 2},
                {8, 2, 6, 1, 9, 5, 3, 4, 7},
                {3, 7, 4, 6, 8, 2, 9, 1, 5},
                {1, 5, 9, 7, 4, 3, 6, 2, 8},
                {5, 1, 9, 3, 2, 6, 8, 7, 4},
                {2, 4, 8, 9, 5, 7, 1, 3, 6},
                {7, 6, 3, 4, 1, 8, 2, 5, 9}
        };
        System.out.println(solveSoduku(columnError));

        int [][] outofRange = {
                {10, 3, 5, 2, 6, 9, 7, 8, 1},
                {6, 8, 2, 5, 7, 1, 4, 9, 3},
                {1, 9, 7, 8, 3, 4, 5, 6, 2},
                {8, 2, 6, 1, 9, 10, 3, 4, 7},
                {3, 7, 4, 6, 8, 2, 9, 1, 5},
                {9, 5, 1, 7, 4, 3, 6, 2, 8},
                {5, 1, 9, 3, 2, 6, 8, 7, 4},
                {2, 4, 8, 9, 5, 7, 1, 3, 6},
                {7, 6, 3, 4, 1, 8, 2, 5, 9}
        };
        System.out.println(solveSoduku(outofRange));

        int[][] rowError = {
                {4, 3, 2, 2, 6, 9, 7, 8, 1},
                {6, 8, 5, 5, 7, 1, 4, 9, 3},
                {1, 9, 7, 8, 3, 4, 5, 6, 2},
                {8, 2, 6, 1, 9, 5, 3, 4, 7},
                {3, 7, 4, 6, 8, 2, 9, 1, 5},
                {9, 5, 1, 7, 4, 3, 6, 2, 8},
                {5, 1, 9, 3, 2, 6, 8, 7, 4},
                {2, 4, 8, 9, 5, 7, 1, 3, 6},
                {7, 6, 3, 4, 1, 8, 2, 5, 9}
        };

        System.out.println(solveSoduku(rowError));

        int[][] subError = {
                {4, 3, 5, 2, 6, 9, 7, 8, 1},
                {6, 8, 2, 5, 7, 1, 4, 9, 3},
                {8, 9, 7, 1, 3, 4, 5, 6, 2},
                {1, 2, 6, 8, 9, 5, 3, 4, 7},
                {3, 7, 4, 6, 8, 2, 9, 1, 5},
                {9, 5, 1, 7, 4, 3, 6, 2, 8},
                {5, 1, 9, 3, 2, 6, 8, 7, 4},
                {2, 4, 8, 9, 5, 7, 1, 3, 6},
                {7, 6, 3, 4, 1, 8, 2, 5, 9}
        };
        System.out.println(solveSoduku(subError));

        int[][] sumValidationError = {
                {1, 3, 3, 4, 5, 6, 7, 7, 9},
                {4, 5, 6, 7, 7, 9, 1, 3, 3},
                {7, 7, 9, 1, 3, 3, 4, 5, 6},
                {9, 1, 3, 3, 4, 5, 6, 7, 7},
                {3, 4, 5, 6, 7, 7, 9, 1, 3},
                {6, 7, 7, 9, 1, 3, 3, 4, 5},
                {7, 9, 1, 3, 3, 4, 5, 6, 7},
                {3, 3, 4, 5, 6, 7, 7, 9, 1},
                {5, 6, 7, 7, 9, 1, 3, 3, 4}
        };
        System.out.println(solveSoduku(sumValidationError));
    }

    public static boolean solveSoduku(int[][]grid){
        //if numbers are not within range or if grid isnt 9x9, then return false ;
        if(!numbersInRange(grid) || !outOfRange(grid)) {
            return false;
        }

        // checks rows
        for(int row = 0; row < 9; row++) {
            for (int col = 0; col < 8; col++) {
                for (int col2 = col + 1; col2 < 9; col2++) {
                    //if any number in row is duplicated return false
                    if (grid[row][col] == grid[row][col2])
                        return false;
                }
            }
        }

        //checks columns
        for(int col = 0; col < 9; col++) {
            for (int row = 0; row < 8; row++) {
                for (int row2 = row + 1; row2 < 9; row2++) {
                    //if any number in column is duplicated return false
                    if (grid[row][col] == grid[row2][col])
                        return false;
                }
            }
        }

        // checks grid
        //since sub-grids are 3x3
        for(int row = 0; row < 9; row += 3) {
            for (int col = 0; col < 9; col += 3) {
                  //check if sub-grids have duplicates
                for (int index = 0; index < 8; index++) {
                    for (int index2 = index + 1; index2 < 9; index2++) {
                        if (grid[row + index % 3][col + index / 3] == grid[row + index2 % 3][col + index2 / 3])
                            return false;
                    }
                }
            }
        }


        return true;
    }

    private static boolean numbersInRange(int[][] grid) {

        // loop the grid[][] array
        for(int i = 0; i < grid.length; i++)
            for(int j = 0; j < grid[i].length; j++)
                // Check if number in grid[i][j] is within range 1 to 9
                if (grid[i][j] <= 0 ||
                        grid[i][j] > 9)
                {
                    return false;
                }


        return true;
    }

    private static boolean outOfRange(int[][] grid) {

        //check if grid is 9x9
        int numberTotal = 0;
        // loop the grid[][] array
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++) {
                numberTotal++;
            }
        }
        return numberTotal == 81;
    }
}
