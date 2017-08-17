package java;
import java.util.*;
public class Loops_I {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int input = 0;
        int prod = 0;
        input = sc.nextInt();
        for(int i = 1; i <= 10; i++){
            prod = input*i;
            System.out.println(input + " x " + i + " = " + prod);
            prod = 0;
        }
    }
}
