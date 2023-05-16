/*Write a program to convert the upper case to lower case.

 */
package programs;

import java.util.Scanner;
public class UpperToLowerProgram9
{
    public static Scanner sc= new Scanner(System.in);

    public static void main(String[] args)
    {
     lower();
    }
    public static void lower()
    {
        System.out.println("Enter your detail :");
        String txt= sc.nextLine();
        System.out.println(txt.toLowerCase());
    }
}
