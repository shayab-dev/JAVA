package Arrays;

public class RotateArray {
    public static void rotate(int[] a ,int k){
        int n = a.length;
        k = k%n;
        reverse(a,0,n-1);
        reverse(a,0,k-1);
        reverse(a,k,n-1);
    }
    static void reverse(int[] a, int start, int end){
        while(start<end){
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9};
        int k = 2;
        rotate(a,k);
        for(int num: a){
            System.out.print(num+" ");
        }
    }
}
