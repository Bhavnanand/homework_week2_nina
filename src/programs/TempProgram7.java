/*Write a program to insert any temperature value in degree Fahrenheit and
        convert to degree Celsius ((F − 32) × 5/9 = 0°C).

 */
package programs;
import java.util.Scanner;
public class TempProgram7
{
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.println("Enter temperature in degree Fahreheit :");
        float temp = sc.nextFloat();
        double degreetemp = (temp-32)*5/9;
        System.out.println ("Temp in Degree Celcius :"+ degreetemp);

    }

}
