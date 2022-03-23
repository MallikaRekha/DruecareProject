//Interface
interface Hello
{
	void show();
}
//Main class
public class AnonymousClass {
	static Hello h=new Hello()
	{
		public void show()
		{
			System.out.println("I am In Anonymous Class");
		}
	};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		h.show();

	}

}
