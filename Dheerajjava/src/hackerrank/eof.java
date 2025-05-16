package hackerrank;

import java.util.Scanner;

public class eof {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int lineno=1;
		while(s.hasNext()) {
			System.out.println(lineno + " "+ s.nextLine());
			lineno++;
			
		}
		s.close();
	}

}
