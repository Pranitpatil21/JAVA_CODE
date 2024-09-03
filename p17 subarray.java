/*Print all Sub array */

class pranit {
    public static void main(String[] args){
        int[] arr = new int[]{2,4,1,3};
        for(int i= 0 ;i<arr.length;i++){
           
            for(int j =0;j<arr.length;j++){
            
                for(int k =i;k<=j;k++){
                
                    System.out.print(arr[k]+" ");
                
                }
                System.out.println("");
            }
            System.out.println("");
        }
    }
}