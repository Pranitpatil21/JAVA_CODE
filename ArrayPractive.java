
/*          Array Assignment 1

              Question 3)                                         */
import java.util.*;

class pranit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of an Array ");
        int N = sc.nextInt();
        int[] A = new int[N];
        System.out.println("Enter Elements of Array ");
        for (int i = 0; i < A.length; i++) {
            A[i] = sc.nextInt();
        }
        System.out.println("Enter Size of 2D Array ");
        int M = sc.nextInt();
        int[][] B = new int[M][2];
        System.out.println("Enter Elements of 2D Array ");
        for (int i = 0; i < M; i++) {
            B[i][0] = sc.nextInt();
            B[i][1] = sc.nextInt();
        }
        int[] prefix = new int[A.length];
        prefix[0] = A[0];
        for (int j = 1; j < A.length; j++) {
            prefix[j] = prefix[j - 1] + A[j];
        }
        int[] result = new int[M];
        for (int k = 0; k < M; k++) {
            int s = B[k][0];
            int e = B[k][1];
            if (s == 0) {
                result[k] = prefix[e];
            } else {
                result[k] = prefix[e] - prefix[s - 1];
            }
        }
        System.out.print("[");
        for (int i = 0; i < M; i++) {
            System.out.print(result[i]);
            if (i < M - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}

/*
 * Q4. Time to equality
 * Problem Description
 * - Given an integer array A of size N.
 * - In one second, you can increase the value of one element by 1.
 * - Find the minimum time in seconds to make all elements of the array
 * equal.
 * 
 * Problem Constraints
 * 1 <= N <= 1000000
 * 1 <= A[i] <= 1000
 * 
 * Example Input
 * A = [2, 4, 1, 3, 2]
 * Example Output
 * 8
 * Example Explanation
 * We can change the array A = [4, 4, 4, 4, 4]. The time required will be 8
 */

class pranit {
    public static void main(String[] args) {
        int[] A = new int[] { 2, 4, 1, 3, 2 };
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < A.length; i++) {
            if (max < A[i]) {
                max = A[i];
            } // s1 finding difference then store it in one element and then add
        } // it to count
        int count = 0;
        for (int j = 0; j < A.length; j++) {
            if (A[j] == max) {
                A[j] = max;
            }
            int x = max - A[j];
            count = count + x;
        }
        System.out.println(count);
    }
}

/*
 * Q5. In-place Prefix Sum
 * Problem Description
 * - Given an array A of N integers.
 * - Construct the prefix sum of the array in the given array itself.
 * 
 * Problem Constraints
 * 1 <= N <= 105
 * 1 <= A[i] <= 103
 * 
 * Example Input
 * Input 1:
 * A = [1, 2, 3, 4, 5]
 * Input 2:
 * A = [4, 3, 2]
 * 
 * Example Output
 * Output 1:
 * [1, 3, 6, 10, 15]
 * Output 2:
 * [4, 7, 9]
 */
class pranit {
    public static void main(String[] args) {
        int[] A = new int[] { 4, 3, 2 };
        for (int i = 1; i < A.length; i++) {
            A[i] = A[i - 1] + A[i];
        }
        for (int j = 0; j < A.length; j++) {
            System.out.print(A[j] + " ");
        }
    }
}

/*
 * Problem Description
 * - Given an integer array A containing N distinct integers, you have to find
 * all
 * the leaders in array A. An element is a leader if it is strictly greater than
 * all
 * the elements to its right side.
 * 
 * NOTE: The rightmost element is always a leader.
 * Problem Constraints
 * 1 <= N <= 105
 * 1 <= A[i] <= 108
 * 
 * Example Input
 * Input 1:
 * A = [16, 17, 4, 3, 5, 2]
 * Input 2:
 * A = [5, 4]
 * 
 * Example Output
 * Output 1:
 * [17, 2, 5]
 * Output 2:
 * [5, 4]
 * Example Explanation
 * Explanation 1:
 * Element 17 is strictly greater than all the elements on the right side to it.
 * Element 2 is strictly greater than all the elements on the right side to it.
 * Element 5 is strictly greater than all the elements on the right side to it.
 */

class pranit {
    public static void main(String[] args) {
        int[] arr = new int[] { 16, 17, 4, 3, 5, 2 };
        int max = Integer.MIN_VALUE;
        int max1 = Integer.MIN_VALUE;
        int N = arr.length;
        int x = 0;
        for (int i = N - 1; i >= 0; i--) {
            if (arr[i] > max) {
                max = arr[i];
                x = i; // this give max index
            }
        }
        System.out.print(max + " "); // search till max from right side means 16 not print
        for (int j = N - 1; j > x; j--) {

            if (arr[j] > max1 && max != arr[j]) {
                max1 = arr[j];
                System.out.print(max1 + " ");
            }
        }
    }
}