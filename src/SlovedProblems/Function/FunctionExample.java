package SlovedProblems.Function;

// Remove duplicate array

public class FunctionExample {

    public static void main(String[] args) {

        int[] arr = { 11, 11, 11, 13, 13, 20 };

        int[] newarr = new int[arr.length];

        newarr[0] = arr[0];

        for (int i = 1; i < arr.length; i++)
        {
            boolean duplicate = false;
            for (int j = 0; j < newarr.length; j++)
            {
                if (arr[i] == newarr[j])
                {
                    duplicate = true;
                }
            }
            if (duplicate == false)
            {
                newarr[i] = arr[i];
            }

            for (int num : newarr) {
                if(num != 0)
                {
                    System.out.println(num);
                }
            }
        }
    }
}
