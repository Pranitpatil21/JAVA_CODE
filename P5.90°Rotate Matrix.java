/*Given a matrix NxN .
  Rotate the matrix 90 degree clockwise from he top-right corner.
  Note  :(No-new matrix)*/

//soluntiom       matrix ---> transpose --->swap row wise .



class pranit {
  public static void main(String[] args) {
      int[][] arr = new int[][]{{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10},
              {11, 12, 13, 14, 15}, {16, 17, 18, 19, 20}, {21, 22, 23, 24, 25}};
       //tanspose
       for(int i=0;i<arr.length;i++){
           for(int j=i+1;j<arr.length;j++){
               int temp = arr[i][j];
                  arr[i][j] = arr[j][i];
                  arr[j][i] = temp;
           }
       }
       //swap or reverse
       for(int i=0;i< arr.length;i++){
           int end =arr.length-1;
           int start= 0;
           while(start<end){
               int temp1 = arr[i][start];
               arr[i][start] = arr[i][end];
               arr[i][end] = temp1;
               end--;
               start++;
           }
       }
        // output
       for(int k =0;k<arr.length;k++){
           for(int p = 0; p<arr.length; p++){
               System.out.print(arr[k][p]+" ");
           }
           System.out.println(" ");
       }
  }
}

