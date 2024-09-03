import java.util.*;
class pranit {
    static void arrDemo(int[] arr, int[] arr2) {     // using one extra array
        int N = 6;
        arr2[0]= arr[N-1];
        for (int i = 1; i < N; i++) {
            arr2[i] = arr[N-i-1];           //       i = 0      6-0-1 = 5          this repeats as per i value eleements keep 
        }                                                                              // adding on new array
        for (int j = 0; j < N; j++) {
            System.out.print(arr2[j]+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{7,8,9,7,5,4};
        int[] arr2 = new int[6];
        pranit.arrDemo(arr, arr2);
    }
}
                 //Using swap Approch

/*Given an array of size N.
    Reverse the arrau withouth using extra space
    Space Complexity : O(1)

    Arr : [8,4,1,3,9,2,6,7]
 output:
    Arr : [7,6,2,9,3,1,4,8]
*/

class pranit{
    public static void main(String[] args){
        int N = 8;
        int[] arr = new int[]{8,4,1,3,9,2,6,7};
        int i = 0;
        int j = N-1;

        while(i<j){

            int temp = arr[i];
             arr[i]=arr[j];
             arr[j]=temp;

             i++;
             j--;
        }
        for(i = 0;i<N;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}

