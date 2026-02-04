package Pattern_Printing;
import java.util.Scanner;
public class AlphabetPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int m = sc.nextInt();
        System.out.print("Enter column: ");
        int n = sc.nextInt();

        for(int i=1; i<=m; i++){
            for(char j=1; j<=n; j++){
                System.out.print((char)(+64)+ " ");
            }
            System.out.println();
        }
    }
}
