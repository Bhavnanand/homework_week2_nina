/* Write a Java programme using the following steps.
      *  4.1 Declare two instance and two static variables.
       * 4.2 Declare one instance method.
       * 4.3 Declare one static method.
        *4.4 Call all four instance and static variables into both instance and static methods inside the
       * print statement.
      *  4.5 Declare the Main method.
        *4.6 Call both instance and static methods into the Main method and run the programme.
*/
package programs;

public class Program4
{
    int a = 30;//instance variable 1 declare
    String name = "Priya";// instance variable 2 declare
    static  int b= 121; //static variable 1 declare
    static String course = "Electronics"; // static vafriable 2 declare
//main method calling one instance method using object and static method
    public static void main(String[] args) {
        Program4  u= new Program4();
        u.dec1();
        dec();
    }
    public static void dec(){//static method
        Program4 s = new Program4();//object createdd to call instance variable in static method
                System.out.println("Enter your house no. :"+s.a);
        System.out.println("Enter hyour name :"+s.name);
        System.out.println("Your phone no. :"+b);
        System.out.println("Enter course name :" +course);
    }
    public void dec1(){
        System.out.println("enter your house no. :" +a);
        System.out.println("Enter hyour name :"+name);
        System.out.println("Your phone no. :"+b);
        System.out.println("Enter course name :" +course);
    }

}
