/*
  Given a square matrix of size N x N.
  Convert the matrix to its Transpose Matrix. 
  */


  class pranit {
     public static void main(String[] args) {
         int[][] arr = new int[][]{{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10},
                 {11, 12, 13, 14, 15}, {16, 17, 18, 19, 20}, {21, 22, 23, 24, 25}};
 
         int temp = 0;
         for(int i=0;i<arr.length;i++){
             for(int j=i+1;j<arr.length;j++){
                 temp = arr[i][j];
                 arr[i][j] = arr[j][i];
                 arr[j][i] = temp;
             }
         }

          for(int i=0;i<arr.length;i++){
              for(int j=0;j< arr.length;j++){
                  System.out.print(arr[i][j]+" ");
              }
              System.out.println(" ");
          }

     } 
 }