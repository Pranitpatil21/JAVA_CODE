import java.util.*;

public class pranit {
    static int sqrot(int n) {
        int val = 0;
        for (int i = 1; i <= n; i++) {
            if (i * i <= n) { // used ( < ) symbol because for non-perfect number there where got skipped
                val = i; // we can not use return statement in this no chance value will get return or
                         // not
            } else {
                break; // this will help to reduce iteration
            }
        }
        return val;
    }

    public static void main(String[] args) {
        System.out.println("Enter number to find square root");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int hey = pranit.sqrot(n);
        System.out.print(hey);
    }
}


// more optimised code Using Binary search
 class pranit{
     public static int sqrt(int n){
         int start = 1;
         int end = n;
         int ans = 0;
         int itr = 0;
         while(start<=end){
             itr++;
             int mid = (start + end) / 2;
             int sqr = mid * mid ;
             if (sqr == n) {
                 System.out.println(itr);          // if statement gets return from here so we write two times
                 return mid;
             }
             if(sqr > n) {
                     end = mid - 1;
                 }
                 else {
                     ans = mid;                //if mid value is answer 
                     start = mid + 1;
             }
         }
         System.out.println(itr);       // but this will print only once
         return ans;
     }
     public static void main(String[] args){
         int n = 100;
         int hey = pranit.sqrt(n);
         System.out.println(hey);
      }
 }