//Equilibrium index of an array left and right side of array should be same at that index
//Also Know as Pivot Index
/*
Let us see a problem statement for better understanding:
You are given an array A of integers of size N.
• Your task is to find the equilibrium index of the given array.
The equilibrium index of an array is an index such that the sum of elements at lower indices is equal to the sum of elements at higher indices.
• If there are no elements that are at lower indices O at higher indices, then the corresponding sum of elements is considered as O. Note: Array index starts from O
• If there is no equilibrium index then return -1
• If there are more than one equilibrium index then return the minimum index
Problem Constraints:
1<=N<=10^5
-10^5<=a[i]<=10^5
Ex: a=[-7,1,5,2,-4,3,0]
o/p: 3
a=[1,2,3]
o/p:-1
*/

//bruteforce 
//T.C = O(N^2)
import java.util.*;
class pranit {
    public static void main(String[] args) {
        int[] arr = new int[]{1,7,3,6,5,6};
        int flag =0;
        for(int i =0;i<arr.length;i++){

            int leftsum=0;
            int rightsum = 0;

            for(int j =0;j<i;j++){
                leftsum = leftsum + arr[j];
            }
            for(int j=i+1;j<arr.length;j++){
                rightsum = rightsum + arr[j];
            }
            if(leftsum == rightsum){
                flag = 1;
                System.out.println(i);
                break;
            }
        }
        if(flag == 0){
            System.out.println("-1");
        }

    }
}