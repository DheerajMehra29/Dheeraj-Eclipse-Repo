package hackerrank;

import java.util.Scanner;

public class stdin {public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int i = scan.nextInt();
    double d = scan.nextDouble();
    char s = scan.next().charAt(0);
    scan.close();

    // Write your code here.

    System.out.println("String: " + s);
    System.out.println("Double: " + d);
    System.out.println("Int: " + i);
}
}


