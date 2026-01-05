// Q1 ]Count the total number of Subarray of K size.

 class Subarray{ 
      static int TotalSubarray(int[] arr,int N,int k){
     int count =0;
     int left =0;
     int right = k-1;        
     while(right<arr.length){
         count++;            
         left++;
         right++;
     }
       return count;
    }
    public static void main(String[] args){
        int[] arr = new int[]{-3,4,-2,5,3,-2,8,2,1,4};
        int N = arr.length;
        int k=4;
        System.out.print(TotalSubarray(arr,N,k));

    }
}
//sortcut :- using only one formula [ arr.length - k+1 ]


/* Q2] Find the maximum subarray sum of length K.  
       Input:   
                  Arr : [-3,4,-2,5,3,-2,8,2,1,4]
                  K : 4     
     */

      class Subarray{
            static int TotalSubarray(int[] arr,int N,int k){
           int left =0;
           int p=0;
           int right = k-1;
                int max = Integer.MIN_VALUE;
                while(right<arr.length){
                    int sum =0;
                    for(int i=left;i<=right;i++) {
                        sum = sum + arr[i];
                        if (sum > max) {
                            max = sum;
                            p = sum;
                        }
                    }
               left++;
               right++;
           }
             return p;
          }
          public static void main(String[] args){
              int[] arr = new int[]{-3,4,-2,5,3,-2,8,2,1,4};
              int N = arr.length;
              int k=4;
              System.out.print(TotalSubarray(arr,N,k));

          }
      }

       // OPTIMIZED
      class Subarray{
        static void TotalSubarray(int[] arr,int N,int k){
          int left = 0;
          int right = k-1;
          int max= Integer.MIN_VALUE;
          int[] prefix = new int[arr.length];
          prefix[0] = arr[0];
          for(int i=1;i<arr.length;i++){
              prefix[i]=prefix[i-1]+arr[i];
          }
          int sum=0;
          while(right<arr.length){
              if(left ==0){                             //to handle -1 case
                  sum = prefix[0];
              }
              else{
                  sum = prefix[right] - prefix[left-1];
              }
                right++;
                left++;
          }
          System.out.println(sum);
      }
    public static void main(String[] args){
        int[] arr = new int[]{-3,4,-2,5,3,-2,8,2,1,4};
        int N = arr.length;
        int k=4;
        TotalSubarray(arr,N,k);

    }
}
T.C = O(N)
S.C = 0(N)

/*
using sliding w-indow 
*/ 
    class Subarray{
      static void TotalSubarray(int[] arr,int N,int k) {
          int sum =0;
          int max = Integer.MIN_VALUE;
          for(int i=0;i<k;i++){
              sum = sum +arr[i];
              if(sum>max){                         
                  max = sum;
              }
          }
          int start = 1;
          int end=k;
          while(end<arr.length){
              sum = sum + arr[end] - arr[start-1];
            if(sum>max){
                max = sum;
            }
              start++;
              end++;
          }
          System.out.print(sum);
      }
    public static void main(String[] args){
        int[] arr = new int[]{-3,4,-2,5,3,-2,8,2,1,4};
        int N = arr.length;
        int k=4;
        TotalSubarray(arr,N,k);
    }
}

//H.W 
/* Given an array A and element B.
    find the minimum no of swaps required to bring all the elements <=B togeathr

    input       Arr : [1,12,10,14,3,10,5]
                B : 8
    output 1
    */
