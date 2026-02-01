package Conditions;
import java.util.Scanner;
public class ModeValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Integer: ");
        int num = sc.nextInt();

        if(num<0){
           num = num * (-1);
        }
        System.out.println("The mod value is: "+num);

    }
}

