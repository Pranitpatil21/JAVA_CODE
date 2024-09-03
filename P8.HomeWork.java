/*Q1)  print all diagonals of square matrix
       (left to right) or (right to left)

    A.starting from 0th row
    B.all diagonals
*/
//right to left already solved
 //solved Q1 A ) left to right
class code{
    public static void main(String[] args){
        
        int[][] arr = new int[][]{{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};

        for(int i=0 ;i< arr.length;i++) {
            int j = i, k = 0;
            while (j < arr.length) {
                System.out.print(arr[k][j] + " ");
                k++;
                j++;
            }
            System.out.println();

        }
    }
}
