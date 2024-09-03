//Bubble sort using recursion

import java.util.*;
class Searching{
    static void Bubblesort(int[] arr,int n) {
                if(n == 1){
                    return;
                }
                boolean swapped = false;
                for(int i=0;i<n-1;i++) {
                    if (arr[i] > arr[i + 1]) {
                        int temp = arr[i];
                        arr[i] = arr[i + 1];
                        arr[i + 1] = temp;
                        swapped = true;
                    }
                }
                if(swapped == false){
                    return;
                }
           Bubblesort(arr,n-1);
    }
    public static void main(String[] args){
        int[] arr = new int[]{1,2,3,4,5,6};
        Bubblesort(arr,arr.length);
        for(int k = 0 ;k<arr.length;k++){
            System.out.print(arr[k]+" ");
          }
    }
    }