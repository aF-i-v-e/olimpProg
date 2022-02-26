package basicAlgorithm.binSort1;

import java.util.Scanner;

public class Lecture1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] stringArray = scanner.nextLine().split(" ");
        int len = stringArray.length;
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = Integer.parseInt(stringArray[i]);
        }
        int k = binarySearch(array, len);
        System.out.println(k);
    }

    private static int binarySearch(int[] array, int len) {
        int l = -1;
        int r = len;
        while(l + 1 < r) {
            int mid = (l + r) / 2;
            if (array[mid] == 0) {
                l = mid;
            }
            else {
                r = mid;
            }
        }
        return r;
    }
}
