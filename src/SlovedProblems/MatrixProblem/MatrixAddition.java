package SlovedProblems.MatrixProblem;

import java.util.Scanner;

public class MatrixAddition {
	public static void main(String[] args) {

		// Get the input from the user
		Scanner sc = new Scanner(System.in);

		int Rows1 = sc.nextInt();
		int Column1 = sc.nextInt();

		int[][] Arr1 = new int[Rows1][Column1];
		int[][] Arr2 = new int[Rows1][Column1];

		// Below the code loops and access it
		for (int i = 0; i < Rows1; i++) {
			for (int j = 0; j < Column1; j++) {
				Arr1[i][j] = sc.nextInt();
			}
		}

		for (int m = 0; m < Rows1; m++) {
			for (int j = 0; j < Column1; j++) {
				Arr2[m][j] = sc.nextInt();
			}
		}

		// Below the code for Access the Array
		for (int l = 0; l < Rows1; l++) {
			for (int j = 0; j < Column1; j++) {
				System.out.print(Arr1[l][j] + Arr2[l][j] + " ");
			}
			System.out.println();
		}

		sc.close();
	}
}
