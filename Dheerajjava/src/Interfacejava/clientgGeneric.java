package Interfacejava;

import java.util.Scanner;

public class clientgGeneric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		genericClass<String> pair = new genericClass<>();
		pair.one = s.nextLine();
		pair.two = s.nextLine();
		System.out.println(pair.one.concat(pair.two));
		genericClass<Integer> pair1 = new genericClass<>();
		pair1.one = Integer.parseInt(s.nextLine());
		pair1.two = Integer.parseInt(s.nextLine());
		System.out.println(Integer.sum(pair1.one, pair1.two));
		genericClass2<Integer, String> pair2 = new genericClass2<>();
		pair2.one = Integer.parseInt(s.nextLine());
		pair2.two = s.nextLine();
		System.out.println(pair2.one + pair2.two);

	}

}
