/*Write a program to enter any radius value of the circle and find out the
 *       area.(Formula of Area A=PI*r*r).

*/
package programs;

import java.util.Scanner;
public class AreaProgram6{
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.println("Enter the radius of the circle :");
        float r= sc.nextFloat();
        double a= Math.PI *r*r ;
        System.out.println( "Area of the circle with radius =" +a);

    }
}
