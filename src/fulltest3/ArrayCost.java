package fulltest3;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayCost {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int[] inputArr = new int[n];

        for (int i = 0; i < n; i++) {
            inputArr[i] = s.nextInt();
        }

        System.out.println(minRemovalCost(inputArr));
    }

    private static int minRemovalCost(int[] arr) {
        Arrays.sort(arr);

        int totalCost = 0;

        int previous1 = -1;
        int previous2 = -1;

        for (int i = arr.length - 1; i >= 0; i--) {
            if (previous1 == -1) {
                totalCost += arr[i];
                previous1 = arr[i];
            } else if (previous2 == -1) {
                totalCost += arr[i];
                previous2 = arr[i];
            } else {
                previous1 = -1;
                previous2 = -1;
            }
        }

        return totalCost;
    }
}
