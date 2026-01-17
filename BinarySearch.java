/* First Occurrence of an Element
   Modify the binary search function to find the first occurrence of a given element in
   a sorted array. Return -1 if the element is not present.
   For example, given the input array arr = [2, 4, 4, 4, 6, 7, 8] and the target element
   4, the function should return 1, as 4 first appears at index 1 in the array.   */


import java.util.*;
class Searching{
       static int Binarysearch(int[] arr,int start,int end,int k) {
               int mid = (start+end)/2;
               if(arr[mid]==k){
                 if(arr[mid]==0 || arr[mid-1]!=k ) {
                   return mid;
                  }
                 else{
                     return Binarysearch(arr,start,mid-1,k);
                 }
               }
               if(arr[mid]<k){
                   return Binarysearch(arr,mid+1,end,k);
               } else{
                  return Binarysearch(arr,start,mid-1,k);
               }
       }
       public static void main (String[] args){
           System.out.println(" Enter Size of an Array ");
           Scanner sc = new Scanner(System.in);
           int n = sc.nextInt();
           int[] arr = new int[n];
           for(int i=0;i<arr.length;i++){
               arr[i] = sc.nextInt();
           }
           System.out.println("enter element to find ");
           int k = sc.nextInt();
           int start = 0;
           int end = arr.length-1;
           int x = Binarysearch(arr,start,end,k);
           System.out.print(x);
       }
       }
