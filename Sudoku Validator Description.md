# Sudoku Validator
## Description
You get a sudoku grid from a player and you have to check if it has been correctly filled in a programming language of your choice.

A sudoku grid consists of 9×9 = 81 cells split in 9 sub-grids of 3×3 = 9 cells.
For the grid to be correct, each row must contain one occurrence of each digit (1 to 9), each column must contain one occurrence of each digit (1 to 9) and each sub-grid must contain one occurrence of each digit (1 to 9).

You shall answer true if the grid is correct or false if it is not.

## Input
A ```CSV``` file representing the sudoku grid
```csv
1,2,3,4,5,6,7,8,9
4,5,6,7,8,9,1,2,3
7,8,9,1,2,3,4,5,6
9,1,2,3,4,5,6,7,8
3,4,5,6,7,8,9,1,2
6,7,8,9,1,2,3,4,5
8,9,1,2,3,4,5,6,7
2,3,4,5,6,7,8,9,1
5,6,7,8,9,1,2,3,4
```

## Output
```true``` or ```false```

## Constraints
For each digit ```n``` in the grid:
- ```n``` is defined
- ```n``` is a number within the ```Int32``` space