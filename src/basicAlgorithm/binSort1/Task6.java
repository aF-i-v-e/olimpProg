package basicAlgorithm.binSort1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Task6 {
    private static int m;
    private static int n;
    private static int[] array;

    public static void main(String[] args) {
        FastScanner scanner = new FastScanner();
        n = scanner.nextInt();
        m = scanner.nextInt();
        array = new int[n];
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < m; i++) {
            int query = scanner.nextInt();
            String result = binarySearchExistElement(query);
            builder.append(result);
            builder.append("\n");
        }
        System.out.println(builder);
    }

    private static String binarySearchExistElement(int findNumber) {
        int l = -1;
        int r = n;
        while(l + 1 < r ) {
            int mid = (l + r) / 2;
            if (array[mid] < findNumber) {
                l = mid;
            }
            else {
                r = mid;
            }
        }
        if (l < 0 )
            return "NO SOLUTION";
        return String.valueOf(l + 1);
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
