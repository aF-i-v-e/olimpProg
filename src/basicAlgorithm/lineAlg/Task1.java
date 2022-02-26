package basicAlgorithm.lineAlg;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        print(readAndSumm());
    }

    private static long readAndSumm() {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        String[] sArray = in.nextLine().split(" ");
        long s = 0;
        for (int i = 0; i < n; i++) {
           s += Integer.parseInt(sArray[i]);
        }
        return s;
    }


    private static void print(long sum) {
        System.out.println(sum);
    }
}
