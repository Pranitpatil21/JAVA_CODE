//for two array  
import java.util.*;
class MergeSort{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array1");
        int n = sc .nextInt();
        int[] arr1 = new int[n];
        System.out.print("Enter element of array1");
        for(int e = 0; e<arr1.length;e++){
           arr1[e] = sc.nextInt();
        }
        System.out.println("Enter length of array 2 ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter element of aray 2 ");
        for(int m = 0; m<arr2.length;m++){
            arr2[m] = sc.nextInt();
        }
        int arr3Length = arr1.length+arr2.length; 
        int[] arr3 =  new int[arr3Length];
        int i=0 , j=0;
        int k = 0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]) {           //Comparing Element Of First Array & second Array
                arr3[k] = arr1[i];          //Assigning value
                i++;
            }else{
                arr3[k] = arr2[j];      //If Second Array is Smaller the its value will Be Assigned
                j++;
            }
            k++;
        }
        // Condition to Handel  if one array finished earlier than remaining space should be filled with
        while(i<arr1.length){
            arr3[k] = arr1[i];
            k++;  
            i++;
        }
        while(j<arr2.length){
            arr3[k] = arr2[j];
            k++;
            j++;
        }
         for(int p =0;p<arr3.length;p++){
             System.out.print(arr3[p]+" ");
         }
    }
}

//using recursion
import java.util.Arrays;

class MergeSort{
    //conquere
   public static void merge(int[] arr,int si,int mid,int ei){
       int[] temp = new int[ei-si+1];
       int i = si;       //each iterator for each index  this for left array
       int j = mid+1;    //this for right side
       int k = 0;        //this is for temp array
         while(i<=mid && j<=ei){
          if(arr[i]<arr[j]){
              temp[k] = arr[i++];
          }else{
              temp[k] = arr[j++];
          }
          k++;                              //writing common
         }
         while(i<=mid){    //for remaning left index
             temp[k++] = arr[i++];
         }
         while(j<=ei){    //for remaning right index
             temp[k++] = arr[j++];
         }
         for(i = si,k=0;k< temp.length;k++,i++){  //copying element from temp array to orignal array
                arr[i] = temp[k];
         }
   }
    //devide
    public static void mergeSort(int[] arr,int si,int ei){
        if(si>=ei){
               return;
        }
        int mid = si + (ei - si)/2;
         mergeSort(arr,si,mid);
         mergeSort(arr,mid+1,ei);
         merge(arr,si,mid,ei);
    }
    public static void main(String[] args){
         int[] arr = new int[]{8,1,7,3,6,4};
         mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}