package Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int x = 100;
        boolean flag = false;

        for(int i=0; i<arr.length; i++){
            if(arr[i]==x){
                flag=true;
                break;
            }
        }
        if(flag==false){
            System.out.println("nhi milla");
            }
        else {
            System.out.println("mill gaya");
        }
    }
}
