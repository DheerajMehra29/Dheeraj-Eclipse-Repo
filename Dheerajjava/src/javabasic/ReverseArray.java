package javabasic;

import java.util.Scanner;

public class ReverseArray {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] arr = new String[5];
		input(arr);
		display(arr);
		reverse(arr);
		display(arr);

	}

	public static void input(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextLine();

		}
	}

	public static void display(String[] arr) {
		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j] + ", ");
		}
		System.out.println();
	}

	public static void reverse(String[] arr) {
		for (int i = 0; i < arr.length / 2; i++) {
			String temp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = temp;
		}

	}
		
		
		
	}


