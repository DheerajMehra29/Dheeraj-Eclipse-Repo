package programs;

import java.util.Scanner;

public class Insertionsort {
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = takeinput();
	Insertionsort(arr);
		Display(arr);

	}

	public static int[] takeinput() {
		System.out.println("enter size of array");
		int n = s.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();

		}
		return arr;
	}

	public static void Display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	public static void Insertionsort(int[]arr) {
		for(int counter = 1;counter<=arr.length-1;counter++) {
			int val = arr[counter];
			int j =counter-1;
			while(j>=0&&arr[j]>val) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = val; 
		}
	}

}
