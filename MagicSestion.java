// Q1)
class pranit {
    public static void main(String[] args) {
        int[] arr = new int[] { 2, 6, 8, 1, 4 };
        int count = 0;
        int MinSum = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum = sum + arr[k];
                }
                if (sum < MinSum) {
                    MinSum = sum;
                }
            }
        }
        System.out.print(MinSum + " ");

    }
}

// key point total subarray 28
// Total Element in Subarray 84

// Optimized
class pranit {
    public static void main(String[] args) {
        int[] arr = new int[] { 3, -4, 2, -3, -1, 7, -5 };
        int count = 0;
        int MinSum = Integer.MAX_VALUE;
        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int sum = 0;
                if (i == 0) {
                    sum = prefix[j];
                } else {
                    sum = prefix[j] - prefix[i - 1];
                }
                if (sum < MinSum) {
                    MinSum = sum;
                }
            }
        }
        System.out.print(MinSum + " ");

    }
}

// Q3
public class Main {
    public static void main(String[] args) {
        // Example 1
        String s1 = "iloveleetcode";
        String[] words1 = { "i", "love", "leetcode", "apples" };
        System.out.println(isPrefixString(s1, words1)); // Output: true

        // Example 2
        String s2 = "iloveleetcode";
        String[] words2 = { "apples", "i", "love", "leetcode" };
        System.out.println(isPrefixString(s2, words2)); // Output: false
    }

    public static boolean isPrefixString(String s, String[] words) {
        // This will store the combined words
        StringBuilder prefix = new StringBuilder();

        // Go through each word in the array using a normal for loop
        for (int i = 0; i < words.length; i++) {
            // Add the current word to the combined string
            prefix.append(words[i]);

            // Check if the combined string matches the given string
            if (prefix.toString().equals(s)) {
                return true; // If it matches, return true
            }

            // If the combined string becomes longer than the given string, stop checking
            if (prefix.length() > s.length()) {
                return false; // If it's longer, return false
            }
        }

        // If no match was found after checking all words, return false
        return false;
    }
}

// Q4)
class pranit {
    public static int lowLengthSubArray(int[] nums, int target) {
        int N = nums.length;
        int length = Integer.MAX_VALUE;

        for (int i = 0; i < N; i++) {
            int sum = 0;
            for (int j = i; j < N; j++) {
                sum = sum + nums[j];
                if (sum >= target) {
                    length = Math.min(length, j - i + 1);
                    break;// compare max length and min length and store min length in length
                }
            }
        }
        if (length == Integer.MAX_VALUE) {
            return 0;
        } else {
            return length;
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[] { 1, 1, 1, 1, 1, 1, 1, 1 };
        int target = 11;

        int arr = lowLengthSubArray(nums, target);
        System.out.print(arr + " ");
    }
}

// Q6
class pranit {
    public static int equilibriumpoint(int[] nums, int N) {
        int TotalSum = 0;
        int leftsum = 0;

        if (N == 1) {
            return 1;
        }
        for (int i = 0; i < N; i++) {
            TotalSum = TotalSum + nums[i];
        }
        for (int j = 0; j < N; j++) {
            TotalSum = TotalSum - nums[j];
            if (TotalSum == leftsum) {
                return j + 1;
            }
            leftsum = leftsum + nums[j];
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = new int[] { 1 };
        int N = 1;
        System.out.println(equilibriumpoint(nums, N));
    }
}

// Q5
class pranit {
    public static int equilibriumpoint(int[] nums, int N) {
        int TotalSum = 0;
        int ExpectedSum = 0;
        for (int i = 0; i < nums.length; i++) {
            TotalSum = TotalSum + nums[i];
        }
        for (int j = 1; j <= N; j++) {
            ExpectedSum = ExpectedSum + j; // OR ExpectedSum = N*(N+1)/2;
        }
        int total = ExpectedSum - TotalSum;
        return total;
    }

    public static void main(String[] args) {
        int[] nums = new int[] { 6, 1, 2, 8, 3, 4, 7, 10, 5 };
        int N = 10;
        System.out.println(equilibriumpoint(nums, N));
    }
}

// Q7
class pranit {
    public static void MaxProductSubarray(int[] Arr, int N) {
        int max = Integer.MIN_VALUE;
        int x = 0;
        int y = 0;
        for (int i = 0; i < Arr.length; i++) {
            for (int j = i; j < Arr.length; j++) {
                int product = 1;
                for (int k = i; k <= j; k++) {
                    product = product * Arr[k];
                    if (max < product) {
                        max = product;
                        x = i;
                        y = j;
                    }
                }
            }
        }
        for (int i = x; i <= y; i++) {
            System.out.print(Arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] Arr = new int[] { 6, -3, -10, 0, 2 };
        int N = 5;
        MaxProductSubarray(Arr, N);
    }
}

// Q 8) Left Rotate array By D

class MaxValue {
    public static void LeftRotateArray(int[] arr, int N, int D) {
        int[] temp = new int[D];
        D = D % N; // To Reduce extra rotation for large D value;
        for (int i = 0; i < D; i++) {
            temp[i] = arr[i]; // store element to shift upto D
        }
        for (int j = D; j < N; j++) { // shift backword elemt to forword
            arr[j - D] = arr[j];
        }
        int p = 0;
        for (int k = N - D; k < arr.length; k++) { // placing forword elemnt to backword from temp
            arr[k] = temp[p];
            p++;
        }
        for (int v = 0; v < arr.length; v++) { // printing full array
            System.out.print(arr[v] + " ");
        }

    }

    public static void main(String[] args) {
        int[] arr = new int[] { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };
        int N = 10;
        int D = 3;
        LeftRotateArray(arr, N, D);
    }
}

// O R

class RotateArray {
    // Function to reverse a portion of the array
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Function to rotate the array to the left by d positions
    public static void rotateLeft(int[] arr, int d) {
        int n = arr.length;

        // If d is greater than n, rotate only the remainder of d/n times
        d = d % n;

        // Step 1: Reverse the first d elements
        reverse(arr, 0, d - 1);

        // Step 2: Reverse the remaining n - d elements
        reverse(arr, d, n - 1);

        // Step 3: Reverse the entire array
        reverse(arr, 0, n - 1);
    }

    // Main method to test the rotation
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        int d = 2;

        System.out.println("Original array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        rotateLeft(arr, d);

        System.out.println("\nArray after rotating left by " + d + " positions:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

//Q 9

class MaxValue {
    public static void ElementIndex(int[] arr,int N,int x) {
        int A = 0;
        int B = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                A = i;
                break;     //first x found;
            }
        }
        for(int j=0;j<arr.length;j++){
            if(arr[j]==x){                                //keep update till last find
                B = j;                                      
            }
        }
        System.out.print(A+" "+B);
    }
    public static void main(String[] args) {
        int[] arr = new int[]{1,3,5,5,5,5,67,123,125};
        int N = 9;
        int x = 5;
         ElementIndex(arr,N,x);
    }
}

//Q 10
class MaxValue {
    public static void TotalSubArray(int[] arr) {
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                count++;
            }
        }
        System.out.println("Count : "+count);
    }
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3};
         TotalSubArray(arr);
    }
}
OR
    class MaxValue {
        public static void TotalSubArray(int[] arr) {
            int n = arr.length;
            int sum = n * (n + 1) / 2;
            System.out.println(sum);
        }

        public static void main(String[] args) {
            int[] arr = new int[]{1, 2, 3};
            TotalSubArray(arr);
        }
    }
