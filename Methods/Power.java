package Methods;
import java.util.Scanner;
public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value: ");
        int a = sc.nextInt();
        System.out.print("Enter power: ");
        int b = sc.nextInt();
        int pow=1;
        for(int i=1; i<=b; i++){ // a to the power b
            pow*=a;
        }
        System.out.println("Ans is: "+pow);

    }
}
