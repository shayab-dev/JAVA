package Conditions;
import java.util.Scanner;
public class TwoDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num: ");

        int num = sc.nextInt();
        if(num>9 && num<99) {
            System.out.println("They are 2 digit num.");
        }
        else{
            System.out.println("They are not.");
        }

    }
}
