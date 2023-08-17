package SlovedProblems.Maximumelement;

import java.util.Scanner;

public class MaximumElementMatrix {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the row");
		int row = sc.nextInt();

		System.out.println("Enter the Column");
		int column = sc.nextInt();

		// Set the Array value to Arr Varible
		int[][] Arr = new int[row][column];

		// Below the code for loops
		for (int i = 0; i < row; i++) { // This mention the number of Rows
			for (int j = 0; j < column; j++) { // this mention the number of the columns
				Arr[i][j] = sc.nextInt();
			}
		}
		System.out.println(Arr);
		sc.close();
	}

}
