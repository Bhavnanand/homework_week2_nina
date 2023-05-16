/*Write a Java programme using the following steps.
  *      2.1 Declare two static variables
  *      2.2 Declare one static method
  *      2.3 Call both static variables into the static method inside the print statement.
  *      2.4 Declare the Main method.
  *      2.5 Call the static method into the Main method and Run the programme.
  *      package programs;
*/
package programs;
public class Program2
{
    static int a = 20;
    static String course = "Computing";

    public static void main(String[] args)
    {
        declare();

    }
    public static void declare()
    {
        System.out.println(" Roll number : " +a);
        System.out.println("Course name :" + course);

    }
}
