
/*1. Write a Java programme using the following steps.
*1.1 Declare two instance variables.
*1.2 Declare one instance method.
*1.3 Call both instance variables into the instance method inside the print statement.
*1.4 Declare the Main method.
*1.5 Call the above instance method into the Main method and Run the programme.*/
package programs;

public class Program1
{
    int a = 35;//instance variable declare int type
    String name = "Nina";//2nd instant variable declare  string type
    public static void main(String[] args) //Main method
    {
        Program1 obj = new Program1();  //Object of class created
        obj.callinst();  //Using object  callinst is callled
    }
    public void callinst() //instance method to print two instance variable
    {
        System.out.println("My Rgistration number :" +a);//concatenation
        System.out.println("My name : "+name);

    }
}
