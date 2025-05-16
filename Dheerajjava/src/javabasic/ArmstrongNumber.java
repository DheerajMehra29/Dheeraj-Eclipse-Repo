package javabasic;

import java.util.Arrays;
import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner s = new Scanner (System.in);
//		int num = s.nextInt();
//		System.out.println(armstrong(num));
//
//	}
//	public static boolean armstrong(int num) {
//		int arm = 0;
//		int armnum=num;
//		while(armnum!=0) {
//			int rem = armnum%10;
//			arm  = arm + (rem*rem*rem);
//			armnum = armnum/10;
//		}
//		if(arm==num) {
//			return true;
//		}
//		else {
//			return false;
//		}
		  Scanner s = new Scanner(System.in);
	        int T  = s.nextInt();
	        int N = s.nextInt();
	        int M = s.nextInt();
	        int[] arr = new int[N];
	        while(T!=0){
	        for(int i =0;i<arr.length;i++){
	            arr[i] = s.nextInt();
	            T--;
	        }
	        sum(arr,M);

	        }
	    }

	public static void sum(int[] arr, int M) {
		// TODO Auto-generated method stub
		  Arrays.sort(arr);
	        int sum = 0;
	        for(int i = 0;i<M;i++){
	            sum = sum+arr[i];
	        }
	        System.out.println(sum);
	    }
		
	}


