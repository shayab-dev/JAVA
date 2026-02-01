package Conditions;
import java.util.Scanner;
public class CpSp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        System.out.print("Enter the CP: ");
        int cp = sc.nextInt();

        System.out.print("Enter the SP: ");
        int sp = sc.nextInt();

        if(sp>cp){
            System.out.println("It is a profit of amount: "+(sp-cp));
        }
        if(cp>sp){
            System.out.println("It is a loose of amount: "+(cp-sp));
        }

    }
}
