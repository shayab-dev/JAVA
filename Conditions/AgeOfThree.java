package Conditions;
import java.util.Scanner;
public class AgeOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the age of RAM: ");
        int ram = sc.nextInt();

        System.out.print("Enter the age of SHYAM: ");
        int shyam = sc.nextInt();

        System.out.print("Enter the age of AJAY: ");
        int ajay = sc.nextInt();

        if(ram<shyam && ram<ajay){
            System.out.println(ram+  " Ram is youngest.");
        }
        else if(shyam<ram && shyam<ajay){
            System.out.println(shyam+  " Shyam is youngest");
        }
        else{
            System.out.println(ajay+  " Ajay is youngest");
        }
    }
}
