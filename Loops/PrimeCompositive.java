package Loops;
import java.util.Scanner;
public class PrimeCompositive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num: ");
        int n = sc.nextInt();
        boolean flag = false;
        for(int i=2; i<n; i++){
            if(n%i==0){
                flag = true;
                break;
            }
        }
        if(n==1){
            System.out.println("Neither prime nor compositive");
        }
        else if(flag==false){
            System.out.println("Prime number");
        }
        else{
            System.out.println("Compositive number");
        }
    }
}

