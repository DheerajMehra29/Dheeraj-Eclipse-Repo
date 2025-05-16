package oopsstacksandqueue.methodoverloading;

public class MethodOverloadingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sum(3, 4));
		System.out.println(sum(3, 4, 5));
		System.out.println(sum(3.1, 4.2));
		System.out.println(sum("hello", 2, 3, 4, 5, 6));

	}

	public static int sum(int a, int b) {
		System.out.println("Inside Sum With Two Arguments");
		return a + b;
	}

	public static double sum(double a, double b) {
		return a + b;
	}

	public static int sum(int a, int b, int c) {
		return a + b + c;
	}

	public static int sum(String str, int... args) {
		int sum = 0;
		for (int val : args) {
			sum += val;
		}
		return sum;
	}

}
