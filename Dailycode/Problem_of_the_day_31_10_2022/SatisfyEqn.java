package Dailycode.Problem_of_the_day_31_10_2022;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SatisfyEqn {
    static class Pair implements Comparable<Pair> {
        int s;
        int d;

        Pair(int s, int d) {
            this.s = s;
            this.d = d;
        }

        @Override
        public int compareTo(Pair p) {
            if (this.a > p.a)
                return 1;
            else if (this.a < p.a)
                return -1;
            else {
                if (this.b > p.b)
                    return 1;
                else
                    return -1;
            }
        }
    }

    public static int[] satisfyEqn(int[] A, int N) {
        Map<Integer, List<Pair>> map = new HashMap<>();
        int res[] = new int[4];
        Arrays.fill(res, -1);
        for (int i = 0; i < A.length; i++) {
            for (int j = i + 1; j < A.length; j++) {
                int sum = A[i] + A[j];
                if (map.containsKey(sum)) {
                    map.get(sum).add(new Pair(i, j));
                } else {
                    map.put(sum, new ArrayList<Pair>());
                    map.get(sum).add(new Pair(i, j));
                }
            }
        }

        for (int i = 0; i < A.length; i++) {
            for (int j = i + 1; j < A.length; j++) {
                int sum = A[i] + A[j];
                if (!map.containsKey(sum))
                    continue;

                List<Pair> listOfPair = map.get(sum);
                for (Pair pair : listOfPair) {
                    if (pair.s == i || pair.d == i || pair.s == j || pair.d == j)
                        continue;
                    res[0] = i;
                    res[1] = j;
                    res[2] = pair.s;
                    res[3] = pair.d;
                    return res;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int N = 7;
        int A[] = { 3, 4, 7, 1, 2, 9, 8 };
        int[] res = satisfyEqn(A, N);
        for (int x : res)
            System.out.print(x + " ");
    }

}
