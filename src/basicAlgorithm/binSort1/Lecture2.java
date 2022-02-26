package basicAlgorithm.binSort1;

import java.util.Scanner;

public class Lecture2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] stringArray = scanner.nextLine().split(" ");
        int len = stringArray.length;
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = Integer.parseInt(stringArray[i]);
        }
        int x = scanner.nextInt();
        boolean haveX = binarySearch(array, len, x);
        System.out.println(haveX);
    }

    private static boolean binarySearch(int[] array, int len, int x) {
        int l = -1;
        int r = len;
        while(l + 1 < r) {
            int mid = (l + r) / 2;
            if (array[mid] < x) {
                l = mid;
            }
            else {
                r = mid;
            }
        }
        return r < len && array[r] == x;
    }
}
