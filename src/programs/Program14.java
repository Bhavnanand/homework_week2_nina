/*Write a Java program to print the area and perimeter of a rectangle.

 */
package programs;
import java.util.Scanner;

public class Program14 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        areaandpara();
    }
   public static void areaandpara()
   {
       System.out.println("Enter  width :");
       float w=sc.nextFloat();
       System.out.println("Enter  Height :");
       float h=sc.nextFloat();
       float area= w*h;
       float para= (2*w)+(2*h);
       System.out.println("Area of Rectangle : " +area);
       System.out.println("Parameter of Rectangle :" +para);

   }
}
