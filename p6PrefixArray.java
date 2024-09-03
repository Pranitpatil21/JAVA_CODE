// READ NOTES FROM CORE 2 WEB ARRAY ==> PREFIX ARRAY
//REAL TIME EXAMPLE CRICKET SCORE 
//WE KEEP ADDING LAST ELEMENT TO PREFIX ARRAY AND THEN WE CAN GET SUM OF ELEMENTS IN RANGE

// Solving previous example using prefix array we can se this is ia optimized method

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
class pranit{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = 10;
        int[] arr = new int[]{-3,6,2,4,5,2,8,-9,3,1};
        int[] prefixArr = new int[N];

        int Q = sc.nextInt();
        prefixArr[0] = arr[0];                              

      // Calculate the prefix sum array
      
      for(int i=1; i<N;i++){
            prefixArr[i] = prefixArr[i-1] + arr[i];
        }
                                                                          // Time Complexity O(Q+N)
      // Process each query                                                 // O(N)
            int sum = 0;
        for(int j = 0; j< Q ;j++){
            int S = sc.nextInt();
            int E = sc.nextInt();
            if(S == 0){
               sum = prefixArr[E];
            }
            else {
                sum = prefixArr[E] - prefixArr[S - 1];
            }
            System.out.println(sum);
        }
    }
}


