package Arrays;

public class FindMax {
   public static void main(String[] args) {
        int[] arr = {1,2,3,4,500,6,7,8,90};
        int max = -1; // we can also use, int max=arr[0];

        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
               max = arr[i];
            }
        }
      System.out.print("Max element is: "+max);
    }
}

