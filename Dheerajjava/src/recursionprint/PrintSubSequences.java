package recursionprint;

import java.util.Scanner;

public class PrintSubSequences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s = new Scanner(System.in);
String str = s.nextLine();
PrintSS(str,"");

	}
	public static void PrintSS(String str,String result) {
		if(str.length()==0) {
			System.out.println(result);
			return;
		}
		char cc = str.charAt(0);
		String ros = str.substring(1);
		PrintSS(ros,result);
		PrintSS(ros,result+cc);
		
	}

}
