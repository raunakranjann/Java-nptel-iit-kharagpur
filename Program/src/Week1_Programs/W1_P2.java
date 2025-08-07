package Week1_Programs;

import java.util.Scanner;

public class W1_P2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double radius = in.nextDouble();
        double height = in.nextDouble();



// Calculate the volume

//double pi = 3.1415;

        double volume = Math.PI * (radius) * (radius) * height;




        // Display the result
        System.out.printf("Volume is: %.2f", volume);
        in.close();
    }
}