/* Given Array of size N.
   Return the count of pairs(i,j) with Arr[i] + Arr[j] = K

  Arr : [3,5,2,1,-3,7,8,15,6,13]
 N = 10; 
 K = 10;

Note i != j                     // Constraint

  output 6
  */
 // my solution
import java.util.*;
class helllo{
    static void arrDemo(int[] arr){
        int N = 10;
        int K = 10;
        int count = 0;
        int itr = 0;
        for(int i = 0; i<N ;i++){
            for(int j =0;j<N;j++){
                if(arr[i]+arr[j] == K && i!=j){
                    count++;
                    break;
                }
                itr++;
           }
        }
    System.out.print("Count : "+ count +"itertaion : "+itr);
    }

}
public static void main(String[] args){

    int[] arr = new int[]{3,5,2,1,-3,7,8,15,6,13};
    helllo.arrDemo(arr);
         }

//Optimized Approch 
import java.util.*;
class helllo{
    static void arrDemo(int[] arr){
        int N = 10;
        int K = 10;
        int count = 0;
        int itr = 0;
        for(int i = 0; i<N ;i++){
            for(int j = i +1 ;j<N;j++){                                    //i+1
                if(arr[i]+arr[j] == K && i!=j){
                    count++;                           // count = 3 will not count repeating value like i and j / then j and i
                }
                itr++;                           
           }.
        }
    System.out.print(" Count : "+ count*2 +" itertaion : "+itr);            //made count *2
    }
}
public static void main(String[] args){

    int[] arr = new int[]{3,5,2,1,-3,7,8,15,6,13};                              //  T.C= O(N^2)
    helllo.arrDemo(arr);
         }

// MORE OPTIMIZED if we add break statement after count in both approches.

