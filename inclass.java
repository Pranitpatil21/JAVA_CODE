//Reverseing string
   public static void main(String[] args){
        String str = "core2web";
        char[] chararray = str.toCharArray();
        int start = 0;
        int end = chararray.length-1;
         while(start<end){
             char temp = chararray[start];
             chararray[start] = chararray[end];
             chararray[end] = temp;
             start ++;
             end --;
         }
         for(int i=0;i< chararray.length;i++) {
              System.out.print(chararray[i]);
         }
    }
 //another method
class CubeNumber {
    public static void main(String[] args) {
        String str = "core2web";
        StringBuilder strbld = new StringBuilder();
        for(int i=str.length()-1;i>=0;i--) {
            strbld.append(str.charAt(i));
        }
            System.out.print(strbld.toString());
    }
}

//  fibonacci series

import java.util.Scanner;
class DemofibanacciSeries {
   public static void fibonacciSeries(int n){
       int[] arr = new int[n];
        arr[0] = 0;
        arr[1] = 1;
       for(int i =2;i<n;i++){
           arr[i] = arr[i-2]+arr[i-1];
       }
       for(int i=0;i<arr.length;i++){
           System.out.print(arr[i]+" ");
       }
   }
    public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
         fibonacciSeries(n);
        }
 }

//fiabonacci series with recursion

import java.util.Scanner;
class DemofibanacciSeries {
   public static int fibonacciSeries(int n){
       if(n<=1){
           return n;
       }
       return fibonacciSeries(n-1)+fibonacciSeries(n-2);
   }
    public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
        System.out.println(fibonacciSeries(n));
        }
 }