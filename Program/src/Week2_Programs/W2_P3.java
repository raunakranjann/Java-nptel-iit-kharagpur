package Week2_Programs;

import java.util.Scanner;

public class W2_P3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        // Read n numbers into array
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];  // Assume first element is maximum

        // TODO: Use a loop to find maximum element

        /*
         Hint:
         Start loop from index 1 to n - 1
         Compare each element with max
         If element is greater, update max

         */

        for (int i = 1; i < n; i++) { // Loop from index 1 to n-1
            if (arr[i] > max) { // Compare current element with max
                max = arr[i];   // If greater, update max
            }
        }


        System.out.println("Maximum is: " + max);

        sc.close();
    }
}