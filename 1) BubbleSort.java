//in pair of two element we keep sorting

import java.util.*;
class Searching{
    static int[] Binarysearch(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args){
        int[] arr = new int[]{7,3,9,4,2,5,6};
        int[] x =  Binarysearch(arr);
        for(int k = 0 ;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }
    }
    }
//Optimized(Reduced iteration) 
import java.util.*;
class Searching{
    static int[] Binarysearch(int[] arr) {
         int count =0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                 count++;
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(count);
        return arr;
    }
    public static void main(String[] args){
        int[] arr = new int[]{7,3,9,4,2,5,6};
        int[] x =  Binarysearch(arr);
        for(int k = 0 ;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }
    }
    }


//optimized(final)

/* our previous code is doing extra iteration for sorted array so we optimized it if it does not swaped in any iteration it will get out of loop and return the array */
import java.util.*;
class Searching{
    static int[] Binarysearch(int[] arr) {
         int count =0;
         boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 0; j < arr.length-i-1; j++) {
                 count++;
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
           }
            if(swapped==false){
                break;
            }
        }
        System.out.println(count);
        return arr;
    }
    public static void main(String[] args){
        int[] arr = new int[]{1,2,3,4,5,6};
        int[] x =  Binarysearch(arr);
        for(int k = 0 ;k<arr.length;k++){
            System.out.print(arr[k]+" ");
          }
    }
}