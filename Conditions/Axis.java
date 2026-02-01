package Conditions;
import java.util.Scanner;
public class Axis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x-axis: ");
        int x = sc.nextInt();
        System.out.print("Enter y-axis: ");
        int y = sc.nextInt();
        if(x==0 && y==0){
            System.out.println("At Origin");
        }
        else if(x==0){
            System.out.println("At y-axis");
        }
        else if(y==0){
            System.out.println("At x-axis");
        }
        else{
            System.out.println("Other Location");
        }
    }
}
