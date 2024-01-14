package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.print("Number of lines: ");
		int n = input.nextInt();
		System.out.print("Number of columns: ");
		int m = input.nextInt();
		int[][] matrix = new int[n][m];
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print("Position [" + (i + 1) + "][" + (j + 1) + "]: ");
				matrix[i][j] = input.nextInt();
			}
		}
		
		System.out.println();
		System.out.print("Matrix: ");
		for (int i = 0; i < n; i++) {
			System.out.println();
			for (int j = 0; j < m; j++) {
				System.out.print(matrix[i][j] + " ");
			}
		}
		
		input.close();
	}

}
