package Conditions;
import java.util.Scanner;
public class GreatestOfThem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the a: ");
        int a = sc.nextInt();

        System.out.print("Enter the b: ");
        int b = sc.nextInt();

        System.out.print("Enter the c: ");
        int c = sc.nextInt();

        if(a>b && a>c){
            System.out.println("a is greatest: "+a);
        }

        else if(b>a && b>c){
            System.out.println("b is greatest: " +b);
        }

        else{
            System.out.println("c is greatest: "+c);
        }


    }
}
