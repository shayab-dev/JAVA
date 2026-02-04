package Methods;

public class ReturnKeyword {
    public static void greet(int x){
        if(x<0) return;
        System.out.println("Java");
    }
    public static void main(String[] args) {
        greet(-7);
    }
}
