package Loops;
import java.util.Scanner;
public class AP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int a=1, d=5;
        for(int i=1; i<=n; i++){
            System.out.print(a+ " ");
                a+=d;
        }
    }
}
