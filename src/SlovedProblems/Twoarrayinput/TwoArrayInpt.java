package SlovedProblems.Twoarrayinput;

import java.util.Scanner;

public class TwoArrayInpt {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// declare the Row and columns
		int Row = sc.nextInt();
		int Column = sc.nextInt();

		// set the array
		int Arr[][] = new int[Row][Column];

		// Below the code for loop
		for (int i = 0; i < Row; i++) {
			for (int j = 0; j < Column; j++) {
				Arr[i][j] = sc.nextInt(); // set the array 3X3
			}
		}
		// Below the code for Each method
		for (int[] rowArr : Arr) {
			int sum = 0;
			for (int num : rowArr) {
				sum += num;
			}
			System.out.println(sum);
		}
		sc.close();
	}
	
}
