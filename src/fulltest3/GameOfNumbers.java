package fulltest3;

import java.util.Scanner;

public class GameOfNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int y = s.nextInt();

        int answer = minOperations(x, y);
        System.out.println(answer);
    }

    public static int minOperations(int x, int y) {
        int operations = 0;
        while (x < y) {
            operations++;
            if (y % 2 == 1) {
                y++;
            } else {
                y /= 2;
            }
        }
        return operations + x - y;
    }
}
