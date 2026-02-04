package Methods;
import java.util.Scanner;
public class Combination2 {
    public static int fact(int x){
        int xFact=1;
        for(int i=1; i<=x; i++){
            xFact *= i;
        }
        return xFact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.print("Enter r: ");
        int r = sc.nextInt();
        int ncr = fact(n)/ (fact(n-r) * fact(r));
        int npr = fact(n)/ (fact(n-r));
        System.out.println("nCr is: "+ncr);
        System.out.println("nPr is: "+npr);

    }
}
