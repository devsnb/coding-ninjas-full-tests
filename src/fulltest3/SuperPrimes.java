package fulltest3;

import java.util.ArrayList;
import java.util.Scanner;

public class SuperPrimes {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            if (isPrime(i)) {
                list.add(i);
            }
        }

        for (int i = 0; i < list.size(); i++) {
            if (isPrime(i + 1) && isPrime(list.get(i))) {
                System.out.print(list.get(i) + " ");
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        if (n == 2 || n == 3) {
            return true;
        }

        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }


        for (int i = 5; i <= Math.sqrt(n); i = i + 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }
}
