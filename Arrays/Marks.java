package Arrays;

public class Marks {
    public static void main(String[] args) {
        int[] marks = {100,50,20,88,34,99,11,13,95,23};
        for(int i=0; i<marks.length; i++){
            if(marks[i]<35)
                System.out.println("Roll num is: "+i+" ");
        }
    }
}
