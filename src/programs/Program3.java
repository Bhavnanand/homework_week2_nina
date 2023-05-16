/*Write a Java programme using the following steps.
 *      3.1 Declare one instance and one static variable.
 *      3.2 Declare one instance method.
 *      3.3 Declare one static method.
 *      3.4 Call both instance and static variables into both instance and static methods inside the
 *          print statement.
 *      3.5 Declare the Main method.
 *      3.6 Call both instance and static methods into the Main method and run the programme.
 */
package programs;
public class Program3
{
    int a = 11;
    static int b= 5;

    public static void main(String[] args)
    {
        Program3  no = new Program3();
        no.square();
        squre();

    }
    public void square()
    {
        System.out.println("First number a :"+a);//cncatenation
        System.out.println("Second number b :"+b);
    }
    public static  void  squre(){
        Program3 obj = new Program3();
        System.out.println(obj.a);
        System.out.println(b);
    }


}
