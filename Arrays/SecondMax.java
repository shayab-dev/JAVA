package Arrays;

public class SecondMax {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11};
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max)
                max = arr[i];
        }
        int smax = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>smax && arr[i]!=max)
                smax = arr[i];
        }
        System.out.println("Max value is: "+max);
        System.out.println("Second max is: "+smax);
    }
}
