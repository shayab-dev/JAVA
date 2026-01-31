package InputFromUser;

import java.util.Scanner;
public class SumofNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first num: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second num: ");
        int num2 = sc.nextInt();

        int sum = num1 + num2;
        System.out.println("The sum is: "+sum);


    }
}
