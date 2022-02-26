package basicAlgorithm.lineAlg;

import java.util.Scanner;

public class Task3 {
    private static final int maxN = 10000500;
    private static final int maxValue = 1000000500;
    private static long[] array = new long[maxN];
    private static int n;
    private static long cur;
    private static long a;
    private static long b;

    public static void main(String[] args) {
        read();
        generateArray();
        long firstMaxIndex = findMaxIndex();
        long secondMax = findSecondMax(firstMaxIndex);
        print(firstMaxIndex, secondMax);
    }

    private static void generateArray() {
        for (int i = 1; i <= n; i++) {
            array[i] = NextRand();
        }
    }
    private static long NextRand() {
        long mod = 1791791791;
        cur = (cur * a + b) % mod;
        return cur;
    }

    private static long findSecondMax(long index1) {
        long max2A = - maxValue - 1;
        long index2 = -1;
        for (int i = 1; i <= n; i++) {
            if (array[i] > max2A && i != index1) {
                max2A = array[i];
                index2 = i;
            }
        }
        return index2;
    }

    private static long findMaxIndex() {
        long maxA = - maxValue - 1;
        long index = -1;
        for (int i = 1; i <= n; i++) {
            if (array[i] > maxA) {
                maxA = array[i];
                index = i;
            }
        }
        return index;
    }

    private static void read() {
        Scanner in = new Scanner(System.in);
        n = Integer.parseInt(in.nextLine());
        String[] sArray = in.nextLine().split(" ");
        cur = Integer.parseInt(sArray[0]);
        a = Integer.parseInt(sArray[1]);
        b = Integer.parseInt(sArray[2]);
    }

    private static void print(long maxIndex1, long maxIndex2) {
        System.out.println(String.format("%d %d", maxIndex1, maxIndex2));
    }
}
