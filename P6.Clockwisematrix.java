/*Given a NxN Matrix
  Print the boundary in clockwise fashion
  */
//Class code 
class pranit {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15}, {16, 17, 18, 19, 20}, {21, 22, 23, 24, 25}};
        int N = arr.length;

        int i=0,j=0;

        for(int x=0;x<arr.length-1;x++){
            System.out.print(arr[i][j]+" ");
           j++;
        }

        for(int x=0;x<arr.length-1;x++){
            System.out.print(arr[i][j]+" ");
            i++;
        }
        System.out.println("");
        for(int x=0;x<arr.length-1;x++){
            System.out.print(arr[i][j]+" ");
            j--;
        }

        for(int x=0;x<arr.length-1;x++){
            System.out.print(arr[i][j]+" ");
          i--;
        }
    }
}

//My Code

class pranit {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15}, {16, 17, 18, 19, 20}, {21, 22, 23, 24, 25}};

        for(int i=0;i<arr.length-1;i++){
            int j=0;
            System.out.print(arr[j][i]+" ");
         }
        System.out.println("");
        for(int j= 0; j<arr.length-1 ; j++){
             int k=arr.length-1;
            System.out.print(arr[j][k]+" ");
        }
        System.out.println("");
        for(int i= arr.length-1; i>=0;i--){
            int j=arr.length-1;
            System.out.print(arr[j][i]+" ");
        }
        System.out.println("");
        for(int j= arr.length-1; j>=1 ; j--){
            int k=0;
            System.out.print(arr[j][k]+" ");
        }
    }
}