package Problem_of_the_day_02_11_2022;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Enemy {

    public static int largestArea(int n, int m, int k, int[][] enemy) {

        List<Integer> rows = new ArrayList<>();
        List<Integer> cols = new ArrayList<>();

        rows.add(0);
        cols.add(0);

        for (int i = 0; i < enemy.length; i++) {
            rows.add(enemy[i][0]);
            cols.add(enemy[i][1]);
        }

        Collections.sort(rows);
        Collections.sort(cols);

        rows.add(n + 1);
        cols.add(m + 1);

        int maxDistBetweenRows = 0;
        for (int i = 1; i < rows.size(); i++) {
            int dist = rows.get(i) - rows.get(i - 1) - 1;
            maxDistBetweenRows = Math.max(maxDistBetweenRows, dist);
        }

        int maxDistBetweenCols = 0;
        for (int i = 1; i < cols.size(); i++) {
            int dist = cols.get(i) - cols.get(i - 1) - 1;
            maxDistBetweenCols = Math.max(maxDistBetweenCols, dist);
        }

        return maxDistBetweenRows * maxDistBetweenCols;
    }

    public static void main(String[] args) {
        int N = 4,M = 4,K = 3;
        int grid[][] = {{1,1},{2,1},{3,3}};
        System.out.println(largestArea(N,M,K,grid));
    }
}
