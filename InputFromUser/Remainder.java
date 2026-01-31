package InputFromUser;
import java.util.Scanner;
public class Remainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the divident: ");
        int a = sc.nextInt();

        System.out.print("Enter the divisor: ");
        int b = sc.nextInt();


        double r = a%b;
        System.out.println("The remainder when "+a+" is divided by "+b+" is: "+r);



    }
}
