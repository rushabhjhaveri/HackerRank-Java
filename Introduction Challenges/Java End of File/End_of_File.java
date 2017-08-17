package hackerrank_java;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class End_of_File {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Scanner sc = new Scanner(System.in);
    	String line;
    	int i = 0;
    	//System.out.println("Enter input: ");
    	while((line = sc.nextLine()) != null && line.length() != 0){
    		i++;
    		System.out.println(i + " " + line);
    	}
    	sc.close();
    }
}
