package programs;

import java.util.Scanner;

public class Selectionsort {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = takeinput();
		Selectionsort(arr);
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

	public static void Selectionsort(int[] arr) {
		for (int counter = 0; counter < arr.length - 1; counter++) {
			int min = counter;
			for (int j = counter + 1; j <= arr.length - 1; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
				int temp = arr[min];
				arr[min] = arr[counter];
				arr[counter] = temp;
			}
		}
	}

}
