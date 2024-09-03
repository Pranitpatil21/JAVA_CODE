// Print The Row-Wise Sum of the etire matrix

class code1{
    public static void main(String[] args){
        int arr[][] = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}};

        for(int i =0;i<arr.length;i++){
            int sum = 0;
            for(int j=0;j<arr[i].length;j++){
                sum += arr[i][j];
            }
            System.out.println(sum);
        }
    }
}

//Print the Column-Wise Sum of the etire matrix.

class code2{
    public static void main(String[] args){
        int arr[][] = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}};

        for(int i=0;i<arr[0].length;i++){ 
            int sum = 0;
            for(int j=0;j<arr.length;j++){
                sum = sum + arr[j][i];
            }
            System.out.println(sum);
        }
    }
}

//Print the Total Sum of Matrix

class code {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{1, 2, 3, 4}, {1, 2, 3, 4}, {1, 2, 3, 4}};
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    sum = sum + arr[i][j];
                }
            }
            System.out.print(sum);
        }
    }

//Give a square matrix .Print the left diagonal.

class code {
    public static void main(String[] args){
        int[][] arr = new int[][]{{1,2,3},{4,5,6},{7,8,9}};

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i][i]);
        }
    }
}

//Give a square matrix .Print the right diagonal.

class pranit{
   public static void main(String[] args){
       int[][] arr = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
       int i = 0;
       int j = arr.length -1;

        while(i <arr.length && j>=0){
        System.out.println(arr[i][j]);
         i++;        
         j--;
        }
    }
    }