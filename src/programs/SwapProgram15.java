package programs;

import java.util.Scanner;

public class SwapProgram15 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        swap();

    }

    public static void swap() {
        System.out.print("Input the first number: ");// Reading INPUT 1 using console
        int x = sc.nextInt();
        System.out.print("Input the second number: ");//Reading input2 using consloe
        int y = sc.nextInt();
        int z;
        z = x;//swap process
        x = y;
        y = z;
        System.out.println("Swapped values of first value and second value:" + x + " and " + y);
    }
}