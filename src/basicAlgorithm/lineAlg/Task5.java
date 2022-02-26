package basicAlgorithm.lineAlg;
import java.io.*;
import java.util.MissingResourceException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Task5 {
    private static int n;
    private static int[] a;
    private static int maxA = 1000000500;

    public static void main(String[] args) {
        System.out.println(maximumAmount());
    }

    private static long maximumAmount() {
        FastScanner in = new FastScanner();
        n = in.nextInt();
        lineToIntArr(in);
        long localSum = 0;
        long globalSum = - maxA;
        for (int i = 0; i < n; i++) {
            int ai = a[i];
            localSum = Math.max(ai, ai + localSum);
            globalSum = Math.max(globalSum, localSum);
        }
        return globalSum;
    }

    private static void lineToIntArr(FastScanner in) {
        a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
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
