import java.io.*;
import java.util.*;

public class stringintro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int len1 = A.length();
        int len2 = B.length();
        int sum = len1 + len2;
        System.out.println(sum);
        if(A.compareToIgnoreCase(B) > 0) {
        	System.out.println("Yes");
        }
        else {
        	System.out.println("No");
        }
        A = Character.toUpperCase(A.charAt(0)) + A.substring(1); 
        B = Character.toUpperCase(B.charAt(0)) + B.substring(1);
        System.out.println(A + " " + B);
	}

}
