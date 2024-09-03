/* given an integer array of size N.
Build an array leftMax of size N.
Leftmax of i contains the maximam for the index 0 to the index i

  Arr : [-3,6,2,4,5,2,8,-9,3,1]
  N : 10
  LeftMax : [-3,6,6,6,6,6,8,8,8,8]
*/


//BruteForce Approach
//Time Complexity: O(N^2)
//Space Complexity O(1)
 import java.util.*;
 class pranit{
    public static void main(String[] args){
        int[] Arr = new int[]{-3,6,2,4,5,2,8,-9,3,1};
        int N=10;
        int[] LeftMax = new int[Arr.length];
        int MaxElem = Integer.MIN_VALUE;

        for(int i = 0; i<N;i++){
            for(int j=0;j<=i;j++){
                if(Arr[j]>MaxElem){
                   MaxElem= Arr[j];                 //O(N^2)
                    }
             LeftMax[i] = MaxElem;
            }
            System.out.print(LeftMax[i]+" ");
           }

        }
    }

//Optimize way

// my approch
class pranit{
    public static void main(String[] args){
        int[] Arr = new int[]{-3,6,2,4,5,2,8,-9,3,1};
        int N=10;
        int[] LeftMax = new int[Arr.length];
        int maxEl = Integer.MIN_VALUE;
        for(int i = 0;i<N;i++){
            if(Arr[i] > maxEl){     //T. C = O(N)
                maxEl = Arr[i];
            }
            LeftMax[i] = maxEl;
        }
        for(int j=0;j<Arr.length;j++) {
            System.out.print(LeftMax[j] + " ");
        }
    }

}

//using max function
//cass approch c2w
//T.C =O(N)
//S.C = O(1)

class pranit{
    public static void main(String[] args) {
        int[] Arr = new int[]{-3, 6, 2, 4, 5, 2, 8, -9, 3, 1};
        int N = 10;
        int[] LeftMax = new int[Arr.length];
        LeftMax[0] = Arr[0];
        for(int i=1;i<N;i++){
            LeftMax[i]= Integer.max(LeftMax[i-1],Arr[i]); //max fn()
        }
        for(int j=0;j<Arr.length;j++) {
            System.out.print(LeftMax[j]+ " ");
        }
     }

}