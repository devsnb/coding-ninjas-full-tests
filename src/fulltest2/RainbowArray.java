package fulltest2;

/**
 * 1.  First a1 elements equal 1.
 * 2.  Next a2 elements equal 2.
 * 3.  Next a3 elements equal 3.
 * 4.  Next a4 elements equal 4.
 * 5.  Next a5 elements equal 5.
 * 6.  Next a6 elements equal 6.
 * 7.  Next a7 elements equal 7.
 * 8.  Next a6 elements equal 6.
 * 9.  Next a5 elements equal 5.
 * 10. Next a4 elements equal 4.
 * 11. Next a3 elements equal 3.
 * 12. Next a2 elements equal 2.
 * 13. Next a1 elements equal 1.
 * (Here a1,a2,a3... are number of elements).
 * 14. ai can be any non-zero positive integer.
 * 15. There are no other elements in array.
 */
public class RainbowArray {
    public static void israinbow(int[] arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("no");
        }

        int currentNumber = 1;
        int mid = arr.length / 2;
        int left = 0;
        int right;

        while (left <= mid) {
            right = arr.length - 1 - left;
            if (arr[left] == currentNumber && arr[right] == currentNumber) {
                left++;
                continue;
            }

            currentNumber++;
            if (arr[left] != currentNumber || arr[right] != currentNumber) {
                System.out.println("no");
                return;
            }
        }

        if (currentNumber == 7) {
            System.out.println("yes");
            return;
        }

        System.out.println("no");
    }
}
