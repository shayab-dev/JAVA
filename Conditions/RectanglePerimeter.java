package Conditions;
import java.util.Scanner;
public class RectanglePerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length: ");
        int len = sc.nextInt();
        System.out.print("Enter the breath: ");
        int brt = sc.nextInt();

        int area = len*brt;
        System.out.println("The area is: "+area);
        int perimeter = 2*(len+brt);
        System.out.println("The perimeter is: "+perimeter);

        if(area>perimeter){
            System.out.println("area is greater ");
        }
        else if(area==perimeter){
            System.out.println("Both are equal");
        }

        else{
            System.out.println("Perimeter is greater ");
        }
    }
}
