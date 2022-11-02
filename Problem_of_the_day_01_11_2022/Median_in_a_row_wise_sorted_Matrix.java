package Problem_of_the_day_01_11_2022;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Median_in_a_row_wise_sorted_Matrix {

    static int median(int matrix[][], int R, int C) {

        int list[] = new int[R * C];
        int k = 0;
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                list[k++] = matrix[i][j];
            }
        }
        Arrays.sort(list);
        int median = list[list.length / 2];

        return median;
    }

    public static void main(String[] args) {
        int arr[][] = { { 1, 3, 5 }, { 2, 6, 9 }, { 3, 6, 9 } };
        int R = 3, C = 3;
        System.out.println(median(arr, R, C));

    }
}
