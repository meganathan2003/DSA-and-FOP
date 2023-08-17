package SlovedProblems.Shopkeeper;

import java.util.*;

public class reminder {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int ch30 = 0;
        int ch60 = 0;
        int ch120 = 0;

        List<Integer> arr = new ArrayList<>();

        System.out.println("Enter the inputs :");
        int inpt = sc.nextInt();

        while (inpt != -1) {
            arr.add(inpt);
            inpt = sc.nextInt();

        }

        if (inpt == 30) {
            ch30++;
        } else if (inpt == 60) {
            ch60++;
        }
        if (ch30 > 0) {
            ch30--;
        }

        sc.close();
    }

}
