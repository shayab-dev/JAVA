package Loops;
import java.util.Scanner;
public class GP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.println("The required GP is: ");
        int a=1, r=5;

        for(int i=1; i<=n; i++){
            System.out.print(a+" ");
            a=a*r;
        }
    }
}



