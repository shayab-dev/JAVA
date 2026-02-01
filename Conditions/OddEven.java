package Conditions;
import java.util.Scanner;
public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num: ");
        int num = sc.nextInt();

        if(num%2==0){
            System.out.println("it is an even num: " +num);
        }
        else{
            System.out.println("It is an odd num: "+ num);
        }
    }
}
