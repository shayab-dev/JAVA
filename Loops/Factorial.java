package Loops;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num: ");
        int n = sc.nextInt();
        int fact = 1;
        for(int i=1; i<=n; i++ ){
            fact*=i;
        }
        System.out.println("Factorial is: "+fact);
        System.out.println(Integer.MAX_VALUE);
    }
}
