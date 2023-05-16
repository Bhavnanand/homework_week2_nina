/* Write a program for a calculator with addition, subtraction, multiplication
 *       and division methods all with parameters and use string concatenation
  *      methods.(Note: Two static and Two instance methods.)
 */
package programs;
import java.util.Scanner;
 public class Program5 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {

        Program5 add = new Program5();
        add.addition();
        Program5 sub = new Program5();
        sub.subtraction();
        mul();
        div();
    }
    public void addition()
    {
        System.out.println("Please enter your first number");
        int a= sc.nextInt();
        System.out.println("Please enter your second number");
        int b= sc.nextInt();
       int result = a+b;
       System.out.println("addition of numbers :" +result);
    }
    public void subtraction(){
        System.out.println("Please enter your first number");
        int a= sc.nextInt();
        System.out.println("Please enter your second number");
        int b= sc.nextInt();
        int result1 = a-b;
        System.out.println("Subtraction  of number  :" +result1);
    }
    public static void mul(){
        System.out.println("Please enter your first number");
        int a= sc.nextInt();
        System.out.println("Please enter your second number");
        int b= sc.nextInt();int result2 = a*b;
        System.out.println("Multiplication of number  :" +result2);
    }
    public static void div(){
        Program5 a1 = new Program5();
        System.out.println("Please enter your first number :");
        int a = sc.nextInt();
        System.out.println("Please enter your second number :");
        int b = sc.nextInt();
        int result3 = a/b;
        System.out.println("Division of number  :" +result3);
    }
}
