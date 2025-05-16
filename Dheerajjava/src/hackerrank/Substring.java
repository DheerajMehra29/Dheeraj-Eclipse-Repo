package hackerrank;

import java.util.Scanner;

public class Substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
        String S = s.next();
        int start = s.nextInt();
        int end = s.nextInt();
        System.out.println(S.substring(start,end));
        
	}

}
