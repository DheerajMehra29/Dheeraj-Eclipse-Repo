package programs;

import java.util.Scanner;

public class Waveprintrowwise {
	static Scanner s = new Scanner(System.in);


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = takeinput();
		display(arr);
		Rowwisewaveprint(arr);
		//display(arr);
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
	public static void Rowwisewaveprint(int[][]arr) {
		for(int i = 0;i<arr.length;i++) {
			if(i%2==0) {
				for(int j =0;j<arr[i].length;j++) {
					System.out.print(arr[i][j]+" ");
				}
			}
				else {
					for(int j = arr[i].length-1;j>=0;j--) {
						System.out.print(arr[i][j]+" ");
					
				}
				}
		}
		System.out.println("end");
	}

}
