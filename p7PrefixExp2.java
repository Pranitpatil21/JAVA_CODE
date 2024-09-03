
/* 
 Problem statement 2:
 In place prefix sum
 -Given an array A of N integers
 -construct a prefix sum of the array in itself.
  the given array
 -Return an array of integers denoting the prefix sum of the given array.

Problem Constraints:
 1<=N<=10^5
 1<=arr[i]<=10^3

Input: arr:[ 1,2,3,4,5]
Output: arr:[1,3,6,10,15]

Input 2 : arr:[ 4,3,2]
Output 2 : arr:[4,7,9]

*/

import java.util.*;
class pranit{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array");
        int N = sc.nextInt();
        System.out.println("Enter Your array Input ");
        int[] A = new int[N];
             for(int k = 0;k<N;k++){
                 A[k] = sc.nextInt();
             }

             for(int i= 1 ;i<A.length;i++){
                 A[i] = A[i-1] + A[i];
             }
        System.out.println(" Output ");
             for(int j = 0;j<A.length;j++){
                 System.out.print(A[j]+" ");
             }

    }
}