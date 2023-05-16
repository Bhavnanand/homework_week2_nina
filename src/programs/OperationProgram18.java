package programs;

import java.util.Scanner;

public class OperationProgram18 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        operat();
    }
    public static void operat()
    {
        {
            System.out.print("Input first number : ");
            int num1 = sc.nextInt();
            System.out.print("Input second number : ");
            int num2 = sc.nextInt();
            System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
            System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
            System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
            System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
            System.out.println(num1 + " mod " + num2 + " = " + (num1 % num2));
        }
    }
}
