package Week2_Programs;

import java.util.Scanner;

public class W2_P4 {

    // Declare a class named Rectangle
    static class Rectangle {
        int length;
        int width;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read length and width
        int l = sc.nextInt();
        int w = sc.nextInt();

        // Create an object of the Rectangle class
        Rectangle rect = new Rectangle();

        // Assign values to the object's member variables
        rect.length = l;
        rect.width = w;

// Complete the code to print the sum of length and width

        // TODO: Print the sum using rect.length and rect.width

        /*
         Hint:
         Use: rect.length + rect.width to get the sum
         Print the result using System.out.println
         tip--System.out.println("Sum of length and width is: " +.....)

         */

        int sum = rect.length+rect.width;

        System.out.printf("Sum of length and width is: "+sum);

        sc.close();
    }
}