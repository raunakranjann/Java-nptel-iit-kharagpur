package Week1_Programs;

import java.util.Scanner;
public class W1_P4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();

//code for quotient and remainder

        System.out.println("The Quotient is = "+x/y);
        System.out.print("The Remainder is = "+x%y);

        sc.close();
    }
}