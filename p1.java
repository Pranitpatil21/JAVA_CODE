import java.util.*;
class pranit{
    static void arrDemo(int[] arr){
        for(int i = 0;i<= arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args){
        int[] arr = new int[]{5,6,2,3,1,9};
        pranit.arrDemo(arr);
         }
}