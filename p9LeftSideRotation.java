import java.util.*;

class pranit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the size of the array
        System.out.println("Enter Size of Array ");
        int N = sc.nextInt();

        int[] arr = new int[N];

        // Input the elements of the array
        System.out.println("Enter Elements of Array ");
        for(int m = 0; m < N; m++) {
            arr[m] = sc.nextInt();
        }

        // Input the rotation amount
        System.out.print("Rotation : ");
        int B = sc.nextInt();

        // Adjust rotation amount if greater than array size
        B = B % N;          //This help to reduce extra rotation like we give big value 15 and array length 6 then it will run 6
                            // two time and come to same postion   thats why
        // Temporary array to store the first B elements
        int[] temp = new int[B];
        for (int i = 0; i < B; i++) {
            temp[i] = arr[i];
        }

        // Shift the rest of the array left by B positions
        for(int j = B; j < N; j++) {
            arr[j - B] = arr[j];
        }

        // Copy the elements from the temporary array to the end of the original array
        int l = 0;
        for(int k = N - B; k < N; k++) {
            arr[k] = temp[l];
            l++;
        }

        // Output the rotated array
        for(int p = 0; p < N; p++) {
            System.out.print(arr[p] + " ");
        }
    }
}
