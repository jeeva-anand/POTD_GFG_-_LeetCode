package Problem_of_the_day_01_11_2022;

import java.util.Arrays;

public class Where_Will_the_Ball_Fall {

    public static int[] findBall(int[][] grid) {
        int res[] = new int[grid[0].length];
        for (int i = 0; i < grid[0].length; i++) {
            int row = 0;
            int col = i;
            if (row < grid.length && !isBlocked(grid, row, col)) {
                row += 1;
                col += grid[row][col];
            }
            res[i] = grid.length == row ? col : -1;
        }
        return res;
    }

    private static boolean isBlocked(int[][] grid, int row, int col) {
        int n = grid[0].length;
        return (grid[row][col] == 1 && col == n - 1) ||
                (grid[row][col] == -1 && col == 0) ||
                (grid[row][col] == 1 && grid[row][col + 1] == -1) ||
                (grid[row][col] == -11 && grid[row][col - 1] == 1);

    }

    public static void main(String[] args) {
        int grid[][] = { { 1, 1, 1, -1, -1 }, { 1, 1, 1, -1, -1 }, { -1, -1, -1, 1, 1 }, { 1, 1, 1, 1, -1 },
                { -1, -1, -1, -1, -1 } };
        System.out.println(Arrays.toString(findBall(grid)));

    }
}
