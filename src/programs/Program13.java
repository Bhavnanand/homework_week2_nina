package programs;

import java.util.Scanner;

public class Program13
{
    public static Scanner sc=new Scanner(System.in);

    public static void main(String[] args)
    {
        Program13  r = new Program13();
        r.average();

    }
    public void average()
    {
        System.out.println("Enter no.1 :");
        int n1 = sc.nextInt();
        System.out.println("Enter no.2 :");
        int n2 = sc.nextInt();
        System.out.println("Enter no.3 :");
        int n3 = sc.nextInt();
        float av =(n1+n2+n3)/3;
        System.out.println("Average of 3 numbers :"+av);
    }
}
