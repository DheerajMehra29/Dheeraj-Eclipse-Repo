package programs;

import java.util.Scanner;

public class Twodarrayinput {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = takeinput();
		display(arr);
	}

	public static int[][] takeinput() {
		System.out.println("enter no. of rows");
		int rows = s.nextInt();
		int[][] arr = new int[rows][];
		for (int row = 0; row < rows; row++) {
			System.out.println("enter the no. of cols for row" + row);
			int cols = s.nextInt();
			arr[row] = new int[cols];
			for (int col = 0; col < cols; col++) {
				System.out.println("enter the value for row" + row + " and col" + col);
				arr[row][col] = s.nextInt();
			}

		}
		return arr;
	}

	public static void display(int[][] arr) {
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				System.out.print(arr[row][col] + " ");
			}
			System.out.println();
		}
	}
}
