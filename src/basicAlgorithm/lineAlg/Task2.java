package basicAlgorithm.lineAlg;

import java.util.Scanner;

public class Task2 {
    private static final int maxN = 10000500;
    private static final int maxValue = 1000000500;
    private static int[] array = new int[maxN];
    private static int n;

    public static void main(String[] args) {
        read();
        int maxIndex = findMaxIndex();
        print(maxIndex);
    }

    private static int findMaxIndex() {
        int maxA = - maxValue - 1;
        int mIndex = n;
        for (int i = 0; i < n; i++) {
            if (array[i] > maxA ) {
                maxA = array[i];
                mIndex = i;
            }
        }
        return mIndex;
    }

    private static void read() {
        Scanner in = new Scanner(System.in);
        n = Integer.parseInt(in.nextLine());
        String[] sArray = in.nextLine().split(" ");
        for (int i = 1; i < n + 1; i++) {
            array[i] = Integer.parseInt(sArray[i - 1]);
        }
    }

    private static void print(int maxIndex) {
        System.out.println(maxIndex);
    }
}
