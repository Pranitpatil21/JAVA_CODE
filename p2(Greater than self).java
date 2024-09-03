/*  Given an integer array of size N 
    count the no of element having atleast 1 element greater than it self
    arr: [ 2 , 5 , 1 , 4 , 8 , 0 , 8 , 1 , 3 , 8]
    N = 10  */


 import java.util.*;
 class pranit{
    static void arrDemo(int[] arr){
        int N = 10;
        int count = 0;
        int itr = 0;
        for(int i = 0;i<N;i++){
            for(int j = 0;j<N;j++){
                    itr++;
                 if(arr[i]<arr[j]){
                    count++;
                    break;                                                        //TC = O(N^2)
                 }
            }
        }
        System.out.println("count :"+count+" "+"iteration :"+itr);
    }
    public static void main(String[] args){
            int[] arr = new int[]{2,5,1,4,8,0,8,1,3,8};
            pranit.arrDemo(arr);
         }
}


// OPTIMIZED Approch
//subtracting maximum number from total array length 

import java.util.*;
class helllo{
    static void arrDemo(int[] arr){
        int N = 10;
        int count = 0;
        int itr = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<N;i++){
             if( arr[i] > max){
                 max = arr[i];
             }                                                        // T.C = O(N)
            }
        for(int i = 0;i<N;i++){
            if (max == arr[i]) {
              count++;
            }
        }
        int sum = arr.length - count;
        System.out.println("Sum : "+sum);
    }
      }
    public static void main(String[] args){
        int[] arr = new int[]{2,5,1,4,8,0,8,1,3,8};
            helllo.arrDemo(arr);
         }
