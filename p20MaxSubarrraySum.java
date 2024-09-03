/* Maximam Subarray Sum:
Given an integer array of size N,
  find the contigious subarray(containing at least one number) which has the largest sum and return its sum.

  Input : [-2,1,-3,4,-1,2,1,-5,4]
  Output : 6

  Explanation : [4,-1,2,1] has the largest sum = 6.

  A. Brute Force 1 Approach    
  B. Brute Force 2 Approach    
  C. Kadane's Algorithm
  */

// A. //carry forward approach
 class code{
    public static void main(String[] args){
        int[] arr = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            int sum = 0;                                                      //better than prefix because of space complexity
            for(int j =i;j<arr.length;j++){
            sum = sum + arr[j];
                if(max< sum){
                    max = sum;
                }
            }
        }
        System.out.println(max);
    }
 }

 // B. //prefix
   class code{
      public static void main(String[] args){
          int[] arr = new int[]{-2,1,-3,4,-1,2,1,-5,4};
          int[] prefix = new int[arr.length];
          int max = Integer.MIN_VALUE;

           prefix[0] = arr[0];
          for(int i=1;i<arr.length;i++) {
              prefix[i] = prefix[i - 1] + arr[i];
          }
          for(int i=0; i<arr.length; i++){
              int sum = 0;
              for(int j =i;j<arr.length;j++){
                if(i==0) {
                    sum = prefix[j];
                }
                else{
                   sum = prefix[j] - prefix[i - 1];  //e.g cricket score end - (start-1)
                }
                  if(max< sum){
                      max = sum;
                  }
              }
          }
                  System.out.println(max);
      }
   }

//KADANES ALGORITHM 
/*
T.C = O(N)
S.C = O(1)
*/

 class code{
    public static void main(String[] args){
        int[] arr = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i =0;i<arr.length;i++){
            sum += arr[i];
            if(sum>max){
                max = sum;
            }
            if(sum < 0) {
                sum = 0;                          // making negative term to zero
            }  
       }
        System.out.println(max);
    }
 }
