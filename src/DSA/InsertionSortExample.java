package DSA;

/**
 * Below the code for DSA Insertion sorting this sorting is very efficent and
 * very use full and this also took the less complexcity
 * 
 * @author MeganathanSubrmanian
 */

class insertionSort {
    public static void insertionSortExample(int[] arr)
    {
        // below the line for
        int x = 0, i;

        for (int j = 1; j < arr.length; j++)
        {
            x = arr[j]; // x=5
            i = j - 1; // i=0
            while (i >= 0 && x <= arr[i]) 
            {
                arr[i + 1] = arr[i];
                i--;
            }
            arr[i + 1] = x;
        }

        int y = 0;

        for (y = 0; y < arr.length; y++)
            System.out.println(arr[y]);

    }
}

public class insertionSortExample {
    public static void main(String[] args)
    {
        int[] arr = { 4, 5, 12, 8, 7, 6, 22, 1 };

        insertionSort.insertionSortExample(arr);
    }
}