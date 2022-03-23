//class1 
//helper classes
class Outer
{
	class Inner
	{
		public void show()
		{
			System.out.println("In a Nested Inner Class Method");	
		}
		
	}
}
//class 2
//Main class
public class NestedInnerClass {
	public static void main(String[] args)
	{
		Outer.Inner in = new Outer().new Inner();
		in.show();
	}
	
}
