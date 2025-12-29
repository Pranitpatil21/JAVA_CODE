import java.util.*;
class QuickSort{
    int partition(int arr[],int start,int end){
        int pivot = arr[end];
        int i = start-1;
        for(int j=start;j<end;j++){
            if(arr[j] <= pivot){ //if element smaller than pivot
                i++;
 
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];  // final swap of element which we consider as pivot we place it ar right place
        arr[i+1] = arr[end];
        arr[end] = temp;

        return i+1;
    }
    void quicksort(int[]  arr,int start,int end){
           if(start>=end){
           int pivotIdx = partition(arr,start,end);
           quicksort(arr,start,pivotIdx-1);
           quicksort(arr,pivotIdx+1,end);
           }
       }
    public static void main(String[] args){
        int arr[] =  new int[]{12,7,6,14,5,15,10};
        QuickSort obj = new QuickSort();
        obj.quicksort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
