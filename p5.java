/* Given an array of size N and Q number of Queries.
    Query contains two parameters(s,e). s=> start index and e = end index
    for all queries , print the sum of all element from index s to index e. 
    
    Arr : [-3,6,2,4,5,2,8,-9,3,1]
    N : 10
    Q : 3
    
    Queries        s      e         sum
    query 1:       1      3          12
    query 2:       2      7          12
    query 3:       1      1          6
    
    */

  import java.util.*;
  class pranit {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
 
        System.out.println("How many Query you want to insert ");
        int Q = sc.nextInt();
        int N = 10;
        int[] arr = new int[]{-3,6,2,4,5,2,8,-9,3,1};

        for(int i = 0; i < Q;i++) {
           System.out.println("Enter Start and End Index ");
                     int startIndex = sc.nextInt();
                     int endIndex = sc.nextInt();
            int sum = 0;
            for(int j=startIndex ;j <= endIndex ;j++){
                sum = sum + arr[j];
                 }
            System.out.println("Summation is : "+sum);              //T.C -> O(Q*N) 
        }
    }
}

//optimized method prefix array