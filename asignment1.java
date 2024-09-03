//WAP to calculate the sum of digits of a given positive integer.  

//self


import java.util.*;
class sumdigit{
    public static int digitsum(int n){
        if(n==0){
            return 0;
        }
        int temp = n%10;
        return digitsum(n/10)+temp;   // tail recursion -->Nothing After a Function Call.        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.print(sumdigit.digitsum(n));
    }
}

//more efficient way
import java.util.*;
class palidrome{
    public static int fun(int n) {
      if(n==0){
          return 0 ;
      }
         return n%10+fun(n/10);    
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println(fun(n));
    }
}


//WAP to find the factorial of a number.

//self
import java.util.*;
class factorial{
    static int factorialNumber(int n){
       if(n==0){
           return 1;
       }
        return factorialNumber(n-1)*n;
    }
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         System.out.print(factorial.factorialNumber(n));
    }
}

//WAP to count the occurrence of a specific digit in a given number.
//self solved

import java.util.*;
class factorial{
    static int factorialNumber(int n,int checkno,int count) {
        if(n==0){
            return count;
        }
        int temp = n%10;
        if(checkno == temp){
           count++;
        }
        return factorialNumber(n/10,checkno,count);
    }
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
        int count =0;
          int checkno = 8;
         System.out.print(factorial.factorialNumber(n,checkno,count));
    }
}


//WAP to check whether the given number is palindrome or not.

import java.util.*;
class palidrome{
    public static int palidromecheck(int n,int temp,int rev,int storingNvalue) {
      if(n==0){
          if(rev == storingNvalue){
              System.out.print("palidrome");
          }
          else{
              System.out.print("Not palidrome");
          }
          return 1;
      }
      temp = n%10;
      rev= rev*10 + temp;
       return palidromecheck(n/10,temp,rev,storingNvalue);
    }

    public static void main(String[] args){
           Scanner sc = new Scanner(System.in);
           int n = sc.nextInt();
           sc.close();
           int rev=0;
           int storingNvalue = n;
           int temp=0;
            palidromecheck(n,temp,rev,storingNvalue);

    }
}

