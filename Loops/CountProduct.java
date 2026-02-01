package Loops;
import java.util.Scanner;
public class CountProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        int product = 1;
        while(n!=1){
            int lastDigit = n%10;
            product=product*lastDigit;
            n=n/10;
        }
        System.out.println("The product is: "+product);
    }

}
