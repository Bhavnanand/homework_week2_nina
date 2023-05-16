package programs;

import java.util.Scanner;

public class DecToBinProgram17
{
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
   dec();
    }
    public static void dec()
    {
        System.out.println("Enter your number :");
        int dec = sc.nextInt();
      //  System.out.println("Enter your ");

        String bin = Integer.toBinaryString(dec);
        System.out.println("Binary number is " +bin);
    }
}
