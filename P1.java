/*Type Of Declartion Of Array
=========================================================================================================================================
 1) First Way
    
 int arr[][] = new int[][]{{1, 2, 3, 4},{5,6,7,8},{9,10,11,12}};
 
 ========================================================================================================================================
 
 2) Second Way
 int arr[][] = new int[3][4];

 int arr[0] = {1,2,3,4};
 int arr[1] = {5,6,7,8};
 int arr[2] = {9,10,11,12};
 
 ========================================================================================================================================
*/
//Print row Wise Sum of the etire matrix.
 
class code{
    public static void main(String[] args){
        int arr[][] = new int[][]{{1, 2, 3, 4},{5,6,7,8},{9,10,11,12}}; //3 rows and under the first row 4 columnsMeans data

        for(int i =0;i<arr.length;i++) {
            for (int j = 0; j < arr[i].length; j++) {    
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println(" ");
        }
    }
}    

//THis time print column wise

class code{
    public static void main(String[] args){
        int arr[][] = new int[][]{{1, 2, 3, 4},{5,6,7,8},{9,10,11,12}};

        for(int i =0;i<arr[0].length;i++) {      
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j][i] + "  ");
            }
            System.out.println(" ");
        }
    }
}
