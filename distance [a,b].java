import java.util.*;
class pranit{
    static int dist(int a , int b){
        int count = 0;
        int itr = 0;
        for(int i = a; i<=b;i++){
           count ++;
           itr++;
        }
        System.out.println("iteration: "+itr);
        return count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       System.out.println("Enter first Number ");
        int a = sc.nextInt();
        System.out.println("Enter Second Number ");
        int b = sc.nextInt();
        int  sum = pranit.dist(a,b);
        System.out.println("distance is "+sum);
    }
}
//Optimized way to find distance

import java.util.*;
class pranit{
    static int dist(int a , int b){
        int count = 0;
        int itr = 0;
        count = (b-a)+1;
        itr++;
        System.out.println("iteration: "+itr);
        return count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first Number ");
        int a = sc.nextInt();
        System.out.println("Enter Second Number ");
        int b = sc.nextInt();
        int  sum = pranit.dist(a,b);
        System.out.println("distance is "+sum);
    }
} 