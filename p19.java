/* Given an array of size N.
    Find the total sum of all Subarray Sum
    int arr[] = new int[]{1,2,3};
    
 output : 20 
*/

class pranit {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3};
        int totalsum = 0;
        for(int i =0;i<arr.length;i++){
            int sum = 0;
            for(int j=i;j< arr.length;j++){
                sum = sum + arr[j];
                totalsum = totalsum + sum;
            }
        }
        System.out.println(totalsum);
    }
}
