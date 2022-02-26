package basicAlgorithm.lineAlg;
import java.util.Scanner;

public class SecondMax {
    private static final int maxN = 10000500;
    private static final int maxValue = 1000000500;
    private static int[] array = new int[maxN];
    private static int n;
    private static int mIndex = -1;

    public static void main(String[] args) {
        read();
        int secondMax = findSecondMax();
        print(secondMax);
    }

    private static int findSecondMax() {
        findMaxIndex();
        int max2A = - maxValue - 1;
        for (int i = 0; i < n; i++) {
            if (array[i] > max2A && i != mIndex) {
                max2A = array[i];
            }
        }
        return max2A;
    }

    private static void findMaxIndex() {
        int maxA = - maxValue - 1;
        for (int i = 0; i < n; i++) {
            if (array[i] > maxA) {
                maxA = array[i];
                mIndex = i;
            }
        }
    }

    private static void read() {
        Scanner in = new Scanner(System.in);
        n = Integer.parseInt(in.nextLine());
        String[] sArray = in.nextLine().split(" ");
        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(sArray[i]);
        }
    }

    private static void print(int max) {
        System.out.println(max);
    }
}
