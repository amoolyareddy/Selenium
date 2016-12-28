package staticExample;

public class StaticExampleTwo 
{
	
	
		static int i=10;
		int j=5;
		public static void methodOne()
		{
			System.out.println("This is static method");
			
		}
		
		
		public static void main(String args[])
		{
			StaticExampleTwo.methodOne();
			//static method can access static variable
			System.out.println(StaticExampleTwo.i);
			StaticExampleTwo obj=new StaticExampleTwo();
			// a static method can access instance variable through object reference
			System.out.println(obj.j);
			System.out.println("hello");
			
		}
		

}