package Methods;

public class PassingArguments2 {
    public static void main(String[] args) {
        intro("Shayab",21, 87, "A");
    }
    public static void intro(String name, int age, int roll, String grade){
        System.out.println("hello " +name+ " your age is "+age+ " your roll is "+roll+ " and grade is " +grade );
    }
}
