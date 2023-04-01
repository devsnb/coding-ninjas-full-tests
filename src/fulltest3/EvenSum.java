package fulltest3;

import java.util.Scanner;

public class EvenSum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] inputArr = new int[n];

        for (int i = 0; i < n; i++) {
            inputArr[i] = s.nextInt();
        }

        int totalSum = 0;
        for (int elm : inputArr) {
            totalSum += elm;
        }

        int count = 0;
        for (int elm : inputArr) {
            if (isEven(totalSum - elm)) {
                count++;
            }
        }

        System.out.println(count);
    }

    public static boolean isEven(int x) {
        return x % 2 == 0;
    }
}
