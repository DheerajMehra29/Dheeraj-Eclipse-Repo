package recursion;

import java.util.Scanner;

public class Allindicesrecursion {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = takeinput();
		Display(arr);
		int si = 0;
		int data = s.nextInt();
		int count = 0;
		int[] ans = allIndices(arr, si, data, count);
		Display(ans);
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
			System.out.print(arr[i]);
		}
	}

	public static int[] allIndices(int[] arr, int si, int data, int count) {
		if (si == arr.length) {
			int[] base = new int[count];
			return base;
		}
		int[] indices = null;
		if (arr[si] == data) {
			indices = allIndices(arr, si + 1, data, count + 1);
		} else {
			indices = allIndices(arr, si + 1, data, count);
		}
		if (arr[si] == data) {
			indices[count] = si;
		}
		return indices;
	}

}
