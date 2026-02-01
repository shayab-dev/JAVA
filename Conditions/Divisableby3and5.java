package Conditions;
import java.util.Scanner;
public class Divisableby3and5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value: ");
        int num = sc.nextInt();
//        if(num%5==0 && num%3==0){
//            System.out.print("It is divisable.");
//        }
//        else{
//            System.out.print("It is not divided.");
//        }

        if(num%15!=0 && (num%3==0 || num%5==0) ){
            System.out.println("It is divisible by both 3 and 5 but not 15.");

        }
        else{
            System.out.println("Not matched the condition.");
        }
    }
}
