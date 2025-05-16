package programs;

import java.util.Scanner;

public class Arrayops {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = takeinput();
		Display(arr);
		int res = max(arr);
		System.out.println(res);
		int element = s.nextInt();
		System.out.println(Linearsearch(arr, element));
		System.out.println(Binarysearch(arr, element));
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

	public static int max(int[] arr) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];

			}
		}
		return max;

	}

	public static int Linearsearch(int[] arr, int element) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == element) {
				return i;
			}
		}
		return -1;

	}

	public static int Binarysearch(int[] arr, int element) {
		int low = 0;
		int high = arr.length - 1;

		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] < element) {
				low = mid + 1;

			} else if (arr[mid] > element) {
				high = mid - 1;

			} else {
				return mid;
			}
		}
		return -1;
	}

}
