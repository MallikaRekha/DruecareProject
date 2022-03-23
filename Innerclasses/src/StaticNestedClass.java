
//class1
//Outer Class
class outer
{
	private static void OuterMethod()
	{
		System.out.println("Inside Outer Method");
	}
	//class2
	//static Inner Class
	static class inner
	{
		public static void display()
		{
			System.out.println("Inside Inner Class Method");
			OuterMethod();
		}
	}
}
//class3
public class StaticNestedClass {

	public static void main(String[] args) {
		outer.inner in=new outer.inner();
		in.display();

	}

}
