package hackerrank;

import java.util.Scanner;

public class SubstringComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner s = new Scanner(System.in);
	        String S = s.next();
	        int k = s.nextInt();
	        s.close();
	      
	        System.out.println(getSmallestAndLargest(S, k));
	}
	 public static String getSmallestAndLargest(String S, int k) {
		 String current_substring = S.substring(0,k);
	        String smallest = current_substring;
	        String largest =current_substring;
for(int i = 1;i<=S.length()-k;i++) {
	current_substring = S.substring(i,i+k);
	if(current_substring.compareTo(largest)>0) {
		largest = current_substring;
	}
	if (current_substring.compareTo(smallest)<0) {
        smallest = current_substring;
	}
}
return smallest + "\n" + largest;
}
}
