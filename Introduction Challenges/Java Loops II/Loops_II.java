package java;
import java.util.*;
import java.io.*;
public class Loops_II {
	public static void main(String []argh){
		Scanner in = new Scanner(System.in);
		int t=in.nextInt();
		double s = 0;
		for(int i=0;i<t;i++){
			int a = in.nextInt();
			int b = in.nextInt();
			int n = in.nextInt();
			s = a;
			for(int j = 0; j < n; j++){
				s = s + Math.pow(2.0, (double) j)*b;
				System.out.print((int)s + " ");
			}
			System.out.println();
		}
		in.close();
	}
}

