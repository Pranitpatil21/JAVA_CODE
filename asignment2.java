//Write a program to print the maximum digit in a given number.

import java.util.*;
class Recursion{
    public static int fun(int n,int max) {
       if(n==0){
           return max;
       }
        int temp = n%10;
       if(temp>max){
           max = temp;
       }
      return fun(n/10,max);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max =Integer.MIN_VALUE;
        sc.close();
        System.out.println(fun(n,max));
    }
}

// Write a program to print the sum of odd numbers up to a given number.

import java.util.*;
class Recursion{
    static int sum = 0;
    public static int fun(int n) {
     if(n==0){
         return sum;
     }
     if(n%2==1){
         sum += n;
     }
     return fun(n-1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println(fun(n));
    }
}


//Write a program to check whether a given number is a Strong Number or not.

 //  withouth recursion
import java.util.*;
class notRecursion{
    static int sum = 0;
    public static void fun(int n) {
        int fixvalue = n;
        while(n!=0){
            int temp = n%10;
            int factorial = 1;
            for(int i=1;i<=temp;i++){
                factorial = factorial*i;
            }
            sum +=factorial;
            n = n/10;
        }
        if(sum == fixvalue){
            System.out.print("Number is Strong Number ");
        }
        else{
            System.out.print("Not Strong Number ");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        fun(n);
    }
}

//  using recursion
import java.util.*;
class Recursion{
    static int sum = 0;
    public static int fun(int n) {
        if(n==0){
            return sum;
        }
        int temp = n%10;
        int fact= 1;
        for(int i =1;i<=temp;i++){
            fact = fact*i;
        }
        sum = sum+fact;
        return fun(n/10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int x = fun(n);
        if (x == n) {
            System.out.print("Number is Strong Number ");
        } else {
            System.out.print("Not Strong Number ");
        }
    }
    }

/* Write a program to check whether a given positive integer is a Perfect Number or
not.
(A Perfect Number is a positive integer that is equal to the sum of its proper
divisors, excluding itself.) */


import java.util.*;
class Recursion{
    static int sum = 0;
    public static int fun(int n,int fixedvalue) {
        if(n == 0){
            return sum;
        }
        if(fixedvalue%n==0){
            sum += n;
        }
        return fun(n-1,fixedvalue);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fixedvalue = n;
        sc.close();
        int x = fun(n/2,fixedvalue);
        if (x == n) {
            System.out.print("Number is Perfect Number ");
        } else {
            System.out.print("Not Perfect Number ");
        }
    }
    }

/* Write a program to check if a given number is an Armstrong number or not.
( An Armstrong number is a number that is equal to the sum of its own digits each
raised to the power of the number of digits.) */


//using loops (withouth recursion )
import java.util.*;
   class notrecursion{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int temp1 = n;
        int temp2 = n;
        int count =0;
        int sum = 0;
          while(temp1!=0){
              count++;
              temp1 = temp1/10;
          }
          while(n!=0){
              int rem = n % 10;
                  int mul = 1;
              for(int i=1;i<=count;i++){
                      mul = mul*rem;
              }
             sum = sum + mul;
              n=n/10;
          }
        if (temp2 == sum) {
            System.out.print("Number is armstrong Number ");
        }else {
            System.out.print("Not armstrong Number ");
        }
    }
    }



// using recursion

import java.util.*;
   class recursion{
       static int sum =0;
     public static int fun(int n,int count){
           if(n==0){
               return sum;
           }
           int rem = n%10;
           int mul = 1;
           for(int i=1;i<=count;i++){
               mul = mul*rem;
           }
           sum += mul;
           return fun(n/10,count);
       }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp1 = n;
        int temp2 = n;
        int count =0;
        sc.close();
        while(temp1!=0){
            count++;
            temp1=temp1/10;
        }
        int x = fun(n,count);
        if (temp2 == x) {
            System.out.print("Number is armstrong Number ");
        }else {
            System.out.print("Not armstrong Number ");
        }
    }
    }

/* Write a program to check if a given number is a Harshad Number or not.
(A Harshad Number is a number that is divisible by the sum of its digits.) */


//withouth recursion
 import java.util.*;
    class notrecursion{
        static int sum =0;
      public static int fun(int n){
          int sum =0;
          while(n!=0){
          int temp1 = n%10;
             sum = sum+ temp1;
             n = n/10;
          }
          return sum;
        }
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int temp2 = n ;
         sc.close();

         int x = fun(n);
         if (temp2%x == 0) {
             System.out.print("Number is Harshad Number");
         }else {
             System.out.print("Not Harshad Number");
         }
     }
     }

//using recursion 
import java.util.*;
   class recursion{
     public static int fun(int n){
         if(n==0){
             return 0;
         }
         int sum = n%10;
         return fun(n/10)+sum;
       }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int x = fun(n);
        if (n %x == 0) {
            System.out.print("Number is Harshad Number");
        }else {
            System.out.print("Not Harshad Number");
        }
    }
    }


/* Write a program to determine whether a given positive integer is a composite
number or not.*/

//withouth recursion
import java.util.*;
   class notrecursion{
     public static int fun(int n){
         int count =0;
         for(int i=1;i<=n;i++){
             if(n%i == 0){
                 count++;
             }
         }
         return count;
       }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int x = fun(n);
        if (x>2) {
            System.out.print("Number is Composite number Number");
        }else {
            System.out.print("Not composite number Number");
        }
    }
    }

//using recursion
import java.util.*;
   class recursion{
     public static int fun(int n,int fixedValue,int count){
         if(n==0){
             return count;
         }
         if(fixedValue%n == 0){
             count++;
         }
         return fun(n-1,fixedValue,count);
       }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int fixedValue = n;
        int x = fun(n,fixedValue,0);
        if (x>2) {
            System.out.print("Number is Composite number Number");
        }else {
            System.out.print("Not composite number Number");
        }
    }
    }


/* Write a program to check if a given number is an Abundant Number or not.
(An Abundant number is the sum of all its proper divisors, denoted by sum(n), is
greater than the number's value.) */

import java.util.*;
class recursion{
    public static int fun(int n,int fixedValue,int sum){
        if(n==0){
            return sum;
        }
        if(fixedValue%n == 0){
            sum = sum + n;
        }
        return fun(n-1,fixedValue,sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int fixedValue = n;
        int x = fun(n/2,fixedValue,0);
        if (x>n) {
            System.out.print("Number is Abudant Number");
        }else {
            System.out.print("Not Abudant Number");
        }
    }
}

/* Write a program to check if a given number is a Duck Number or not.
(A Duck Number is a number which doesn't start with a zero but has at least one
digit as zero.) */

//withouth recursion
import java.util.*;
class Norecursion{
    public static boolean fun(String n){
        if(n.charAt(0)=='0'){
            return false;
        }
        for(int i=1;i<n.length();i++){
            if(n.charAt(i) == '0'){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        if(fun(n)){
            System.out.println("Number is Duck Number ");
        }
        else{
            System.out.println("Number is Not Duck Number ");
        }
        }
}

//using recursion 
class DuckNumber {
static boolean isDuckNumber(int num) {
if (num == 0) {
return false;
}
int last = num % 10;
if (last == 0) {
return true;
}
return isDuckNumber(num / 10);
}

public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter a number: ");
int num = scanner.nextInt();
if (isDuckNumber(num)) {
System.out.println(num + " is a Duck Number.");
} else {
System.out.println(num + " is not a Duck Number.");
}
}

}


