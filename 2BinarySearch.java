//Binary Search

import java.util.*;
class Searching{
       static int Binarysearch(int[] arr,int search){
           int start = 0;
           int end = arr.length-1;
           while(start<=end){
           int mid = (start + end)/2;
           if(arr[mid] == search){
               return mid;
           }
           else if(arr[mid]>search){
               end = mid-1;
           }
           else{
               start = mid+1;
           }
           }
           return -1;
       }
    public static void main(String[] args){
        int[] arr = new int[]{1,2,3,4,5,6,7};
        Scanner sc = new Scanner(System.in);
        int search = sc.nextInt();
        int x = Binarysearch(arr,search);
        if(x ==-1){
            System.out.println("Number not found");
        }
        else{
            System.out.println("Number found at index "+x);
        }
}
}

// using recursion binary  search 
import java.util.*;
class Searching{
       static int Binarysearch(int[] arr,int start,int end,int search){
           if(start>end){
               return -1;
           }
           int mid = (start + end)/2;
           if(arr[mid] == search){
               return mid;
           }
           if(arr[mid]>search){
                return Binarysearch(arr,start,mid-1,search);
           }
           if(arr[mid]<search){
               return Binarysearch(arr, mid+1,end,search);
           }
           return -1;
       }
    public static void main(String[] args){
        int[] arr = new int[]{1,2,3,4,5,6,7};
        Scanner sc = new Scanner(System.in);
        int search = sc.nextInt();
        int start = 0;
        int end = arr.length-1;
        int x = Binarysearch(arr,start,end,search);
        if(x ==-1){
            System.out.println("Number not found");
        }
        else{
            System.out.println("Number found at index "+x);
        }
}
}

// modified above
import java.util.*;
class Searching{
       static int Binarysearch(int[] arr,int start,int end,int search){
           if(start>end){
               return -1;
           }
           int mid = (start + end)/2;
           if(arr[mid] == search){
               return mid;
           }
           if(arr[mid]>search){
                return Binarysearch(arr,start,mid-1,search);
           }
          else {
               return Binarysearch(arr, mid+1,end,search);
           }                                                          // no need to return -1 here because program no it will get 
                                                                      //  atleast one return from if or else
       }
    public static void main(String[] args){
        int[] arr = new int[]{1,2,3,4,5,6,7};
        Scanner sc = new Scanner(System.in);
        int search = sc.nextInt();
        int start = 0;
        int end = arr.length-1;
        int x = Binarysearch(arr,start,end,search);
        if(x ==-1){
            System.out.println("Number not found");
        }
        else{
            System.out.println("Number found at index "+x);
        }
}
}

/* 
Implement binary search to find the element closest to a given target in a sorted
array.
For example, given the input array arr = [1, 2, 4, 7, 9] and the target element 6, the
function should return 7, as 7 is the closest element to 6 in the array.  */

//Using for loop 

import java.util.*;
class Searching{
    static int Binarysearch(int[] arr,int search){
        int start = 0;
        int end = arr.length-1;
        int sub=0;
        int res=0;
        int min = Integer.MAX_VALUE;
        while(start<=end){
            int mid = (start + end)/2;
            sub = search - arr[mid];
            sub = Math.abs(sub); // make negative value Positive
            if(sub<min){
                min=sub;
                res=arr[mid];
            }
            if(arr[mid] == search){
                return mid;
            }
            else if(arr[mid]>search){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return res;
    }
    public static void main(String[] args){
        int[] arr = new int[]{1,2,4,7,9};
        Scanner sc = new Scanner(System.in);
        int search = sc.nextInt();
        int x = Binarysearch(arr,search);
        System.out.println(x);
    }
}

// Using recursion 
import java.util.*;
class Searching {
    static int min = Integer.MAX_VALUE;
    static int res = 0;

    static int binarySearchRecursive(int[] arr, int search, int start, int end) {
        if (start > end) {
            return res;
        }

        int mid = (start + end) / 2;
        int sub = Math.abs(search - arr[mid]); // make negative value Positive

        if (sub < min) {
            min = sub;
            res = arr[mid];
        }

        if (arr[mid] == search) {
            return mid;
        } else if (arr[mid] > search) {
            return binarySearchRecursive(arr, search, start, mid - 1);
        } else {
            return binarySearchRecursive(arr, search, mid + 1, end);
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 4, 7, 9};
        Scanner sc = new Scanner(System.in);
        int search = sc.nextInt();
        int result = binarySearchRecursive(arr, search, 0, arr.length - 1);
        System.out.println(result);
    }
}

