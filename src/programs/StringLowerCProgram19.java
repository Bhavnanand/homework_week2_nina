package programs;

import java.util.Scanner;

public class StringLowerCProgram19
{
    public static Scanner  sc = new Scanner(System.in);

    public static void main(String[] args)
    {
      lowLine();
    }
    public static void lowLine()
    {
        System.out.println("Enter in Uppercase");
        String str = sc.nextLine();
        System.out.println(str.toLowerCase());
    }
}
