package basicAlgorithm.binSort1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Task2 {
    private static int iterationCount;
    private static int n;
    private static int[] values;

    public static void main(String[] args) {
        FastScanner scanner = new FastScanner();
        n = scanner.nextInt();
        iterationCount = scanner.nextInt();
        values = new int[iterationCount];
        for (int i = 0; i < iterationCount; i++) {
            values[i] = scanner.nextInt();
        }
        System.out.println(binarySearchGetUnitIndex());
    }

    private static int binarySearchGetUnitIndex() {
        int l = -1;
        int r = n;
        int index = 0;
        int unitIndex = 0;
        while(iterationCount > 0) {
            int mid = (l + r) / 2;
            if (values[index] == 0) {
                l = mid;
            }
            else {
                r = mid;
                unitIndex+=1;
            }
            iterationCount -= 1;
            index += 1;
        }
        return unitIndex == 0 ? n : r;
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

