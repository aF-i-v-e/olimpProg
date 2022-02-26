package basicAlgorithm.lineAlg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Task6 {
    private static int n;
    private static int maxN = 100000000;
    private static int[] used = new int[10];

    public static void main(String[] args) {
        boolean getAnswer = false;
        FastScanner in = new FastScanner();
        n = Integer.parseInt(in.next());
        for(int i = n + 1; i < maxN; i++) {
            if (isGoodNumber(i)){
                System.out.println(i);
                getAnswer = true;
                break;
            }
        }
        if (!getAnswer)
            System.out.println(-1);
    }


    private static boolean isGoodNumber(int number) {
        boolean[] used = new boolean[10];
        int digit;
        int remains = number;
        while (remains != 0) {
            digit = remains % 10;
            remains = remains / 10;
            if (used[digit])
                return false;
            used[digit] = true;
        }
        if (used[0] || used[2])
            return false;
        return true;
    }

    private static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }
}
