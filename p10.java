//print greatest number till input



import java.util.*;
class pranit{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[]{3,4,5,1,2,7,9,8};
        System.out.println("Enter Number to Find Maximam till ");
        int j = sc.nextInt();
       int MaxE = Integer.MIN_VALUE;
       if(j>arr.length){
           System.out.print(" Enter Valid Number");
       }
        for(int i = 0;i<=j;i++){
            if(arr[i]>MaxE){
                MaxE = arr[i];
            }
        }
        System.out.print(" Maximam Element: "+MaxE);
    }
}
