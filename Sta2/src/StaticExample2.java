

public class StaticExample2 
{
	
	
		static int i=10;
		int j=5;
		public static void methodOne()
		{
			System.out.println("This is static method");
			
		}
		
		
		public static void main(String args[])
		{
			StaticExample2.methodOne();
			System.out.println(StaticExample2.i);
			StaticExample2 obj=new StaticExample2();
			System.out.println(obj.j);
			System.out.println("hello");
			
		}
		

}
