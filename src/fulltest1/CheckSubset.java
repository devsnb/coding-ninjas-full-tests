package fulltest1;

import java.util.Arrays;

public class CheckSubset {
    public static boolean CheckSubset(int[] arr1, int n1, int[] arr2, int n2) {
//        HashMap<Integer, Integer> arr1Map = new HashMap<>();
//        for (int j : arr1) {
//            if (!arr1Map.containsKey(j)) {
//                arr1Map.put(j, 1);
//            } else {
//                int x = arr1Map.get(j);
//                arr1Map.put(j, x + 1);
//            }
//        }
//
//        for (int x : arr2) {
//            if (!arr1Map.containsKey(x)) {
//                return false;
//            } else {
//                int z = arr1Map.get(x);
//                if (z == 1) {
//                    arr1Map.remove(x);
//                }
//                arr1Map.put(x, z - 1);
//            }
//        }
//
//        return true;

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int i = 0, j = 0;
        while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr1[i] == arr2[j]) {
                j++;
                i++;
            } else if (arr1[i] > arr2[j]) {
                return false;
            }
        }

        if (j < n2) {
            return false;
        }

        return true;
    }
}
