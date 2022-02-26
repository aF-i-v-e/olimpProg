package basicAlgorithm.lineAlg;
import java.io.*;
public class Task4 {
    private static int n;
    private static int q;
    private static int[] a;
    private static long[] partSum;
    private static long[] ans;
    private static BufferedInputStream bis = new BufferedInputStream(System.in);

    public static void main(String[] args) throws IOException {
        MyScanner in = new MyScanner();
        n = in.readInt(bis);
        q = in.readInt(bis);
        a = in.lineToIntArr(n);
        preCalculationPartSum();
        ans = new long[q];
        for (int query = 0; query < q; query++) {
            ans[query] = requestProcessing(in.readInt(bis), in.readInt(bis));
        }
        print();
    }

    private static void preCalculationPartSum() {
        partSum = new long[n + 1];
        partSum[0] = 0;
        long previous = 0;
        for (int i = 1; i <= n; i++) {
            previous += a[i];
            partSum[i] = previous;
        }
    }

    private static long requestProcessing(int l, int r) {
        return partSum[r] - partSum[l - 1];
    }

    private static void print() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < q; i++) {
           stringBuilder.append(ans[i] + "\n");
        }
        System.out.println(stringBuilder);
    }

    private static class MyScanner {
        private static int[] lineToIntArr(int len) throws IOException {
            int[] array = new int[len + 1];
            for (int i = 1; i <= len; i++) {
                array[i] = readInt(bis);
            }
            return array;
        }

        private static int readInt(InputStream in) throws IOException {
            int ret = 0;
            boolean dig = false;

            for (int c = 0; (c = in.read()) != -1; ) {
                if (c >= '0' && c <= '9') {
                    dig = true;
                    ret = ret * 10 + c - '0';
                } else if (dig) break;
            }
            return ret;
        }
    }
}

