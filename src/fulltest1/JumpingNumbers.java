package fulltest1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class JumpingNumbers {
    public static void showJumpingNos(int x) {
        System.out.print("0 ");

        for (int i = 1; i <= 9 && i <= x; i++) {
            jumpingNumbers(x, i);
        }
    }

    public static void jumpingNumbers(int x, int num) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(num);
        while (!queue.isEmpty()) {
            num = queue.poll();
            if (num <= x) {
                System.out.print(num + " ");
                int lastDigit = num % 10;

                if (lastDigit == 0) {
                    queue.add((num * 10) + (lastDigit + 1));
                } else if (lastDigit == 9) {
                    queue.add((num * 10) + lastDigit - 1);
                } else {
                    queue.add((num * 10) + (lastDigit + 1));
                    queue.add((num * 10) + (lastDigit - 1));
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = scanner.nextInt();
        showJumpingNos(x);
//        List<Integer> jumpingNumbersList = jumpingNumbers(x);
//        System.out.println("All the jumping numbers smaller than or equal to " + x + " are:");
//        for (int num : jumpingNumbersList) {
//            System.out.print(num + " ");
//        }
//        System.out.println();
    }
}
