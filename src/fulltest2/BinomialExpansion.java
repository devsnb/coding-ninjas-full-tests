package fulltest2;

import java.util.Scanner;

public class BinomialExpansion {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int A = s.nextInt();
        int X = s.nextInt();
        int n = s.nextInt();

        printBinomialSeries(A, X, n);
    }

    public static void printBinomialSeries(int A, int X, int n) {
        for (int i = 0; i <= n; i++) {
            int coefficient = 1;
            int powerX = 1;

            for (int j = n; j > n - i; j--) {
                coefficient *= j;
            }

            for (int j = 1; j <= i; j++) {
                coefficient /= j;
            }

            for (int j = 0; j < i; j++) {
                powerX *= X;
            }

            int termValue = coefficient * powerX * ((int) Math.pow(A, n - i));
            System.out.print(termValue + " ");
        }
    }
}
