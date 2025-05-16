package programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ninput {
	static Scanner s=new Scanner(System.in);
    public static void main(String args[]) {
        String  ss = s.next();
        char[]str=ss.toCharArray();
        int n=str.length;
        System.out.println(removeDuplicate(str,n));
    }
    static String removeDuplicate(char str[], int n) 
    { 
        int index = 0; 
        for (int i = 0; i < n; i++) 
        { 
            int j; 
            for (j = 0; j < i; j++)  
            { 
                if (str[i] == str[j]) 
                { 
                    break; 
                } 
            } 
            if (j == i)  
            { 
                str[index++] = str[i]; 
            } 
        } 
        return String.valueOf(Arrays.copyOf(str, index)); 
    } 
}