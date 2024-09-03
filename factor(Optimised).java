import java.io.*;

public class pranit {
    public static void factDemo(int n) {
        int count = 0;
        int intr = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) { //  i < 10 // We can more optimise it by using i*i = n it will save time .     
            if (n % i == 0) {                                    // because math.sqrt have Time complexity
                if (i == n / i) { //     10 = 10 count should 1 for self number we will take count 1
                    count++;
                } else {
                    count += 2; //  for other factor count will be 2 such as 1, 2,4,5,10,20 because after
                } // that number is srepeating
            }
            intr++;
        }
        System.out.println(" Count " + count);
        System.out.println(" Iteration " + intr);
    }

    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.print("Enter Number to find Factorial ");
        int n = Integer.parseInt(br.readLine()); //  let input 100
        pranit.factDemo(n);

    }
}