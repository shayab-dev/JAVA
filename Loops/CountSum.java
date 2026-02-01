package Loops;
import java.util.Scanner;
public class CountSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int sum = 0;
        while(n!=0){
            int lastDigit = n%10;
            sum= sum+lastDigit;
            n= n/10;
        }
        System.out.println("The sum is: "+sum);
    }
}
