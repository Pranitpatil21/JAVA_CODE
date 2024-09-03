//Using Recursion
class InsertionSort{
    static void Recursion(int[] arr,int i){
        if(i== arr.length){
            return;
        }
            int element = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>element){
                arr[j+1] =arr[j];
                j--;
            }
            arr[j+1] = element;
             Recursion(arr,i+1);
    }
    public static void main(String[] args){
        int i=1;
        int [] arr =  new int[] {8,3,1,7,5,4,2};
        Recursion(arr,i);
        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }
    }
}