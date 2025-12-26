//AS we move forword we have to place element at right place

class InsertionSort{
    public static void main(String[] args){
        int [] arr =  new int[] {8,3,1,7,5,4,2};
        for(int i = 1; i < arr.length ; i++){
            int element = arr[i]; 
            int j = i-1;
            while(j>=0 && arr[j]>element){
                arr[j+1] =arr[j];
                j--;
            }
              arr[j+1] = element;          //j becomes -1 here so arr[0] = elemet for first case like this it continues
        }
        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }
    }
}



