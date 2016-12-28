package staticExample;

public class JavaStaticExample 
{
	//static variable
	static int a=10;
	//static method
	public static void method1()
	{
	System.out.println("This is static method");	
	}
public static void main(String args[])
{
	//static methods are accessed using class name 
	System.out.println(JavaStaticExample.a);
	JavaStaticExample.method1();
	
	//when we try to access the static variable and method using object compiler will warn you
	JavaStaticExample obj=new JavaStaticExample();
     obj.method1();
     System.out.println(obj.a);
}
	

}
