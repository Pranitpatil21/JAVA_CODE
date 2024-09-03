/* Given an integer array of size N,
  find the contigious subarray(containing at least one number) which has the largest sum and return its sum.

  Input : [-2,1,-3,4,-1,2,1,-5,4]
  Output : [4,-1,2,1]  // this time we want tp print sub array which has maximam sum
  
  */

 class code{
    public static void main(String[] args){
        int[] arr = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int startidx = -1;   //invalid index (-1)
        int endidx = -1;
        int x=0;
        for(int i =0;i<arr.length;i++) {
             if(sum==0) {
                 x = i;       //when sum is 0 it will text next i value to it
             }
            sum = sum + arr[i];

            if (sum > max) {                //end index will get assign as max value update means i moved onword
                max = sum;
                startidx = x;              // if sum not =0 then sart index will be 0 
                endidx = i;                  // because starting element can be maximam subarray 
            }
            if (sum < 0) {                   //making negative term zero
                sum = 0;
            }
        }
        for(int j=startidx; j<=endidx;j++){
            System.out.print(arr[j]+" ");
        }
    }
}