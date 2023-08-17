package DSA;

/**
 * Below the code for DSA topic in bubble sort
 * 
 * @author MeganathanSubramanian
 */

class bubbleSortExample {
    static void bubblesort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        // Below for the loops
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n - 1; j++) {
                if (arr[j - 1] > arr[j]) {

                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}

public class BubbleSort {
    public static void main(String[] args) {

        int[] arr = { 14, 20, 88, 90, 87, 1 };
        bubbleSortExample.bubblesort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
