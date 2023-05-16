/*Write a Java program that takes a number as input and prints its
        multiplication table up to 10.
        Test Data: Input a number: 8

 */
package programs;

import java.util.Scanner;

public class TimeTableProgram10
{
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        TimeTableProgram10 time= new TimeTableProgram10();
        time.table();
    }
    public void table ()
    {
        System.out.println("Input a number");
        int num1= sc.nextInt();
        for (int i=0;i<10;i++){
            System.out.println(num1+"x"+(i+1)+"="+(num1*(i+1)));

        }

    }
}
