//Same quetion As Previous lefftmax

// optimized Approch
   
class pranit{
    public static void main(String[] args) {
        int[] Arr = new int[]{-3, 6, 2, 4, 5, 2, 8, -9, 3, 1};
        int N = 10;
        int[] RightMax = new int[Arr.length];
        int MaxEl = Integer.MIN_VALUE;
        for(int i=N-1;i>=0;i--) {
            if(Arr[i]>MaxEl){
                MaxEl = Arr[i];
            }
            RightMax[i] = MaxEl;
        }
        for(int j=0;j<Arr.length;j++) {
            System.out.print(RightMax[j]+ " ");
        }
     }

}