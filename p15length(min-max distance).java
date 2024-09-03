//bruteforce approch
//Finding a minimum length or array between minimum to maximum or maximum to minimun element
// example given array 1 to 6 or  6 to 1    minimum legth including both
class pranit {
  public static void main(String[] args) {
      int[] arr = new int[]{1,2,3,1,3,4,6,4,6,3};
      int minValue = Integer.MAX_VALUE;
      int maxValue = Integer.MIN_VALUE;
      int len = 0;
      int minLength = Integer.MAX_VALUE;
      for (int i = 0; i < arr.length; i++) {
        if(maxValue < arr[i]){
            maxValue = arr[i];
        }
        if(minValue>arr[i]){
            minValue = arr[i];
        }
      }
      for(int i = 0 ;i<arr.length;i++){
           if(arr[i]==minValue){
               for(int j=i+1;j<arr.length;j++){
                   if(arr[j]==maxValue) {
                       len = j - i + 1;                     //to find distance b-a+1(means we get length)
                       if (minLength > len) {
                           minLength = len;
                       }
                   }
                   }
                } else if (arr[i]==maxValue) {
                    for(int j=i+1;j<arr.length;j++){
                      if(arr[j]==minValue){
                         len = j-i+1;
                          if(minLength>len){
                              minLength = len;
                          }
                     }
                 }
           }
      }
      System.out.println(minLength);
      }
  }

//ans 4