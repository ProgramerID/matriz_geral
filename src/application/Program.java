package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("What the order of the Matrix? ");
		int n = sc.nextInt();

		Double[][] mat = new Double[n][n];
		Double[] vectline = new Double[n];
		Double[] vectcolumn = new Double[n];

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print("Element [" + i + "," + j + "]: ");
				mat[i][j] = sc.nextDouble();
			}
		}

		System.out.println();

		double sumPositive = 0.0;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] > 0) {
					sumPositive += mat[i][j];
				}
			}
		}

		System.out.printf("SUM OF POSITIVES: %.1f%n ", sumPositive);
		System.out.println();

		System.out.print("Choose a line: ");
		int line = sc.nextInt();

		for (int i = line; i == line; i++) {
			System.out.print("CHOOSEN LINE: ");
			for (int j = 0; j < mat[i].length; j++) {
				vectline[i] = mat[i][j];
				System.out.print(vectline[i] + " ");
			}

			System.out.println();
		}

		System.out.println();
		System.out.print("Choose a column: ");
		int column = sc.nextInt();
		System.out.printf("CHOOSEN COLUMN: ");
		for (int i = 0; i < mat.length; i++) {
			for (int j = column; j == column; j++) {
				vectcolumn[i] = mat[i][j];
			}
			System.out.print(vectcolumn[i] + " ");
		}

		System.out.println();
		System.out.println();
		System.out.print("MAIN DIAGONAL: ");

		for (int i = 0; i < mat.length; i++) {
			System.out.print(mat[i][i] + " ");
		}
		System.out.println();
		System.out.println();
		System.out.println("ALTERNATED MATRIX:");
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] < 0) {
					mat[i][j] = Math.pow(mat[i][j], 2);
				}
			}
		}

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}

		sc.close();
	}
}
