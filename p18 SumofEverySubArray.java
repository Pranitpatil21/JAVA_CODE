/*
  Given ar array of size N.
    int arr[] = new int[]{1,4,1,3};
    A. print the sum of every single subarray.
    B. print the sum of every single subarray using prefix array.
    C. print the sum of every single subarray with time complexity of O(N^2) and withouth usng extra space complexity(//this means we 
          neet to use carry forword approch)  
*/

// --- A ----
// T.C = O(N^3)
// S.C = O(1)   
class pranit {                
    public static void main(String[] args){
        int[] arr = new int[]{2,4,1,3};

        for(int i= 0 ;i<arr.length;i++){
            for(int j =i;j<arr.length;j++){
                int sum = 0;
                for(int k =i;k<=j;k++){
                    sum += arr[k];
                }
                if(sum==0) {
                    System.out.print("");
                }
                else System.out.println(sum);
            }
        }
    }
}

//  --- B ---
// prefix sum:

//T.C = O(N^2)
//S.C = O(N)

class code{            
    public static void main(String[] args) {
        int[] arr = new int[]{2, 4, 1, 3};
        int[] prefixsum = new int[arr.length];
        prefixsum[0] = arr[0];
        for(int k =1;k<arr.length;k++) {
            prefixsum[k] = prefixsum[k - 1] + arr[k];
        }
        for(int i = 0;i<arr.length;i++){
            for (int j=i; j < arr.length; j++) {
                int sum =0;
                if (i==0) {
                    sum=  prefixsum[j];
                }
              else {
                  sum = prefixsum[j] - prefixsum[i - 1];  /* arr[end] - arr[start-1] // use to calculate sum of sub array range qureies 
                                                             sum */
              }
              System.out.println(sum);
            }
            }
    }                             
}

// --- C ---
// Carry Forward Approch
// T.C = O(N^2)
// S.C = O(1)
class pranit {
    public static void main(String[] args) {
        int[] arr = new int[]{2,4,1,3};

        for(int i =0;i<arr.length;i++){
            int sum = 0;
            for(int j=i;j< arr.length;j++){
                sum = sum + arr[j];
                System.out.println(sum);
            }
        }
    }
}

