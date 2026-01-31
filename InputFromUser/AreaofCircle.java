package InputFromUser;

import java.util.Scanner;
public class AreaofCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        int r = sc.nextInt();
        double pi = 3.14;
        double area = pi*r*r;
        System.out.println("The area is: "+area);



    }

}
