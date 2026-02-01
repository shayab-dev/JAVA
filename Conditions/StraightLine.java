package Conditions;
import java.util.Scanner;
public class StraightLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x1: ");
        int x1 = sc.nextInt();
        System.out.print("Enter x2: ");
        int x2 = sc.nextInt();
        System.out.print("Enter x3: ");
        int x3 = sc.nextInt();
        System.out.print("Enter y1: ");
        int y1 = sc.nextInt();
        System.out.print("Enter y2: ");
        int y2 = sc.nextInt();
        System.out.print("Enter y3: ");
        int y3 = sc.nextInt();

        double m1 = (y2-y1)/(x2-x1);
        double m2 = (y3-y2)/(x3-x2);
        if(m1==m2){
//        if((y2-y1)/(x2-x1) == (y3-y2)/(x3-x2)){
            System.out.println("It is forming a straight line.");
}
        else{
            System.out.println("It is not the straight line.");
        }



    }
}
