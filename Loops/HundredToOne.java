package Loops;

public class HundredToOne {
    public static void main(String[] args) {
        for(int i=100; i>=1; i--){
            if(i%3==0) {
                System.out.println(i);
            }
        }
    }
}
