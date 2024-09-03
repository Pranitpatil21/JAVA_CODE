//Linear Search

import java.util.*;
class Searching{
       static int printarr(int[] arr,int k){
          int x = 0;
           for(int i=0;i<arr.length;i++) {
               if (arr[i] == k) {
                   return i;
               }
           }
           return -1;
       }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of array ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter Number to find ");
        int k= sc.nextInt();
        sc.close();
        int x = printarr(arr,k);
        if(x == -1){
            System.out.println(" Number Not Found ");
        }
        else{
            System.out.println("Number found at Index :  "+x);
        }
    }
}