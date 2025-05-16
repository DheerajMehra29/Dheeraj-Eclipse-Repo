package recursion;

import java.util.Scanner;

public class lastindexrecursion {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = takeinput();
		Display(arr);
		int si = 0;
		int data = s.nextInt();
		int last = lastindex(arr, si, data);
		System.out.println(last);
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

	public static int lastindex(int[] arr, int si, int data) {
		if (si == arr.length) {
			return -1;
		}
		int index = lastindex(arr, si + 1, data);
		if (index == -1) {
			if (arr[si] == data) {
				return si;
			} else {
				return -1;
			}
		} else {
			return index;
		}

	}
}
