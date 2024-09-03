/* Given an character array(Lowercase)

      return the count of pair(i,j) such that
        a) i < j
        b) arr[i] =  'a'
        c) arr[j] =  'g'

    Arr : [a,b,e,g,a,g]
    Output : 3
  
  */

class pranit{
    public static void main(String[] args){
        char[] arr = new char[]{'a','b','e','g','a','g'};
        int count = 0;
        int itr = 0;
        for(int i=0;i<arr.length;i++){
             for(int j=i;j< arr.length;j++){                  //j = i+!   //optimized
                   if( arr[i] == 'a' && arr[j] == 'g'){
                       count++;
                   }
                 itr++;
             }
        }
        System.out.println("Count is : "+count);
        System.out.println("Iteration : "+itr);
    }
}

// Optimized Approch but bruteforce
class pranit{
    public static void main(String[] args){
        char[] arr = new char[]{'a','b','e','g','a','g'};
        int count = 0;
        int itr = 0;
        for(int i=0;i<arr.length;i++) {
            if (arr[i] == 'a') {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] == 'g') {
                        count++;
                    }
                    itr++;
                }
            }
        }
        System.out.println("Count is : "+count);
        System.out.println("Iteration : "+itr);
    }
}


//Optimized Approch
import java.util.*;
class pranit {
    public static void main(String[] args) {
        int count = 0;
        int pair = 0;
        char[] Arr = new char[]{'a','b','e','g','a','g'};
          for(int i=0;i< Arr.length;i++){
              if(Arr[i]=='a'){
                  count++;                                t.c -> O(N)
              }
              else if(Arr[i] == 'g') {
                  pair = pair + count;
              }
          }
          System.out.print(pair);

        }
    }