package Week2_Programs;

import java.util.Scanner;

public class W2_P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read length and width of the rectangle
        int length = sc.nextInt();
        int width = sc.nextInt();


// Complete the code to calculate the perimeter of the rectangle

        // TODO: Calculate the perimeter using the correct formula

        /*
         Hint:
         The formula is: perimeter = 2 multiplied by (length + width)
         */
        int perimeter = 2*(length + width);




        System.out.println("Perimeter is: " + perimeter);

        sc.close();
    }
}