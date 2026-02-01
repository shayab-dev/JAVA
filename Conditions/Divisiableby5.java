package Conditions;
import java.util.Scanner;
public class Divisiableby5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num: ");
        int num = sc.nextInt();

        if(num%5==0){
            System.out.print("Yes, "+num+" is divisiable by 5.");

        }
        else{
            System.out.println("No,"+num+" is not divisiable by 5.");
        }

    }
}
