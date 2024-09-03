import java.util.*;
class pranit{
      static int sumDemo(int n){
          int sum = 0;
          int itr = 0;
              sum = ((n*(n+1))/2);       //((n*n)/2)+(n/2);
          return sum;
      }
      public static void main(String[] args){

          Scanner sc = new Scanner(System.in);
          System.out.println("Enter a number");
          int n = sc.nextInt();
          int var = pranit.sumDemo(n);
          System.out.println("Summation is: "+var);
      }
}



// OPTIMISED CODE FOR SUM   (self solved)

import java.util.*;
class pranit{
      static int sumDemo(int n){
          int sum = 0;
          int itr = 0;
              sum = ((n*(n+1))/2);       //((n*n)/2)+(n/2);
          return sum;
      }
      public static void main(String[] args){

          Scanner sc = new Scanner(System.in);
          System.out.println("Enter a number");
          int n = sc.nextInt();
          int var = pranit.sumDemo(n);
          System.out.println("Summation is: "+var);
      }
}