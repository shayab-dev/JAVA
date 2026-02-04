package Pattern_Printing;
import java.util.Scanner;
public class StarTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        //System.out.print("Enter column: ");
        //int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){  //row is depending on column here
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
