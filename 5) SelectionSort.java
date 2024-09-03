//In this algo we bring short eleemnt to the front of the array

class SelecetionSort{
    public static void main(String[] args){
        int[] arr = new int[]{9,2,7,3,8,4,1,6};
        for(int i=0;i<arr.length-1;i++){
            int minindex = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minindex]){  //Finding the Minimumm Element
                    minindex = j;
                }
             }
            int temp = arr[i];             //Then swaping it once(in bubble sort we continiouns keep swapping )
            arr[i] = arr[minindex];
            arr[minindex] = temp;
        }
        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }
    }
}