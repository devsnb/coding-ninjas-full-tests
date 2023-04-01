package fulltest2;

import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Scanner;

public class SortAnArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] inputArr = new int[n];

        for (int i = 0; i < n; i++) {
            inputArr[i] = s.nextInt();
        }

        sort(inputArr);
    }

    private static void sort(int[] input) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        for (int x : input) {
            if (!frequencyMap.containsKey(x)) {
                frequencyMap.put(x, 1);
            } else {
                int currentCount = frequencyMap.get(x);
                frequencyMap.put(x, currentCount + 1);
            }
        }

        PriorityQueue<Pair> queue = new PriorityQueue<>(new Comparator<Pair>() {
            @Override
            public int compare(Pair x, Pair y) {
                if (x.value != y.value) {
                    return Integer.compare(y.value, x.value);
                }
                return Integer.compare(x.key, y.key);
            }
        });

        for (int x : frequencyMap.keySet()) {
            queue.add(new Pair(x, frequencyMap.get(x)));
        }

        while (!queue.isEmpty()) {
            Pair p = queue.poll();

            for (int i = 0; i < p.value; i++) {
                System.out.print(p.key + " ");
            }
        }
    }

    private static class Pair {
        int key;
        int value;

        public Pair(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }
}
