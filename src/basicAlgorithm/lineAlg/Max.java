package basicAlgorithm.lineAlg;
import java.util.Scanner;
public class Max {
    private static final int maxN = 10000500;
    private static final int maxValue = 1000000500;
    private static int[] array = new int[maxN];
    private static int n;

    public static void main(String[] args) {
        read();
        int max = findMax();
        print(max);
    }

    private static int findMax() {
        int maxA = - maxValue - 1;
        for (int i = 0; i < n; i++) {
            if (array[i] > maxA) {
                maxA = array[i];
            }
        }
       return maxA;
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
