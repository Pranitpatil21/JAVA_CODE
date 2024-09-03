class SelecetionSort{
    public static void Recursion(int[] arr,int i){
         if(i == arr.length){
             return;
         }
          int maxElement = i;
         for(int j=i+1;j< arr.length;j++){
             if(arr[j]<arr[maxElement]){
                 maxElement = j;
             }
         }
          int temp = arr[i];
            arr[i] = arr[maxElement];
            arr[maxElement] = temp;
          Recursion(arr,i+1);
    }
    public static void main(String[] args){
        int[] arr = new int[]{9,2,7,3,8,4,1,6};
         int i = 0;
         Recursion(arr,i);
        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }
    }
}