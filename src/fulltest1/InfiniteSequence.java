package fulltest1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InfiniteSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> seq = new ArrayList<>();
        seq.add(0);
        for (int i = 1; i <= n; i++) {
            int x = seq.get(i - 1);
            if (!seq.subList(0, i - 1).contains(x)) {
                seq.add(0);
            } else {
                int k = seq.subList(0, i - 1).lastIndexOf(x);
                seq.add(i - k - 1);
            }
        }
        int x = seq.get(n - 1);
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (seq.get(i) == x) {
                count++;
            }
        }
        System.out.println(count);
    }
}
