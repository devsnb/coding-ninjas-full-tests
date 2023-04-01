package fulltest2;

import java.util.Scanner;

public class GameOfDeath {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();
        // Write your code here
        // Print the surviving position
        int survivor = getSurvivor(n, k);
        System.out.println(survivor);
    }

    private static int getSurvivor(int n, int k) {
        if (n == 1) {
            return 1;
        }
        return (getSurvivor(n - 1, k) + k - 1) % n + 1;
    }
}
