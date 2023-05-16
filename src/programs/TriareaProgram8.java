/*Write a program to calculate the area of a triangle.
*/
package programs;
import java.util.Scanner;

public class TriareaProgram8
{
    public static Scanner sc= new Scanner(System.in);

    public static void main(String[] args) {
        area();
    }
    public static void area()
    {
        System.out.println("Enter Base of Triangle :");
        float base = sc.nextFloat();
        System.out.println("Enter Height of Triangle :");
        float h= sc.nextFloat();
        float area = (base*h)*1/2 ;
        System.out.println("Area of a triangle:" +area);
    }
}
