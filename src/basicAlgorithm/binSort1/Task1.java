package basicAlgorithm.binSort1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Task1 {
    public static void main(String[] args) {
        FastScanner scanner = new FastScanner();
        int arrayLength = scanner.nextInt();
        int queryCount = scanner.nextInt();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < queryCount; i++) {
            int k = scanner.nextInt();
            int iterationCount= binarySearchIterationCount(k, arrayLength);
            builder.append(iterationCount + "\n");
        }
        System.out.println(builder);
    }

    private static int binarySearchIterationCount(int unitPosition, int len) {
        int l = -1;
        int r = len;
        int count = 0;
        while(l + 1 < r) {
            int mid = (l + r) / 2;
            if (mid < unitPosition) {
                l = mid;
            }
            else {
                r = mid;
            }
            count += 1;
        }
        return count;
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
