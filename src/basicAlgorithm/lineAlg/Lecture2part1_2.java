package basicAlgorithm.lineAlg;
import java.util.Scanner;

public class Lecture2part1_2 {
    private static int nMax = 100500;
    private static int[] array = new int[nMax];
    private static long[] partSum = new long[nMax];
    private static int n;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        //предподсчёт массива partSum - O(n)
        partSum[0] = 0;
        for (int i = 1; i <= n; i++) {
            array[i] = scanner.nextInt();
            partSum[i] = partSum[i - 1] + array[i];
        }

        //обработка запросов О(q)
        int q = scanner.nextInt();
        for (int query = 0; query < q; query++) {
            int l = scanner.nextInt();
            int r = scanner.nextInt();
            System.out.println(partSum[r] - partSum[l - 1]);
        }
        //O(n) + O(q) - result difficult

    }
}
