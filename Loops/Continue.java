package Loops;

public class Continue {
    public static void main(String[] args) {
        for(int i=1; i<=100; i++){
            if(i==2 || i==4)
                continue;
            if(i%2==0 || i%3==0){
                System.out.println(i);
            }
        }
    }
}
