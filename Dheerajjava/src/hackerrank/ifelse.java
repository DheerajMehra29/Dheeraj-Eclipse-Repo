package hackerrank;

import java.util.Scanner;

public class ifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		if(n%2==0&&n>2&&n<5||n%2==0&&n>20) {
			System.out.println("Not Weird");
		}
		else if (n%2==0&&n>6&&n<20) {
			System.out.println("Weird");
			
			
		}
		else {
			System.out.println("Weird");
		}

	}

}
