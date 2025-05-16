package recursionget;

import java.util.ArrayList;
import java.util.Scanner;

public class GetSubsequences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str =s.nextLine();
		System.out.println(getSS(str));
	}

	public static ArrayList<String> getSS(String str) {
		if (str.length() == 0) {
			ArrayList<String> baseres = new ArrayList<>();
			baseres.add("");
			return baseres;

		}
		char cc = str.charAt(0);
		String ros = str.substring(1);
		ArrayList<String> myresult = new ArrayList<>();
		ArrayList<String> recresult = getSS(ros);
		for (int i = 0; i < recresult.size(); i++){
			myresult.add(recresult.get(i));
			myresult.add(cc + recresult.get(i));
		}
		return myresult;
	}
}