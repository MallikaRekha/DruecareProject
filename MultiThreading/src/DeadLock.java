
public class DeadLock {
	static final String s1="Karthikeya";
	static final String s2="Kashyap";
	public static void main(String[] args) {
	Thread1 t1=new Thread1();
	Thread2 t2=new Thread2();
	t1.start();
	t2.start();
	}
	private static class Thread1 extends Thread
	{
		public void run()
		{
			synchronized(s1)
			{
				System.out.println("Desktop"+ ": locked"+s1);
				try
				{
					Thread.sleep(1000);
				}
				
				catch(Exception e)
				{
					
				}
			}
			
			System.out.println("Desktop"+ ": Waiting for "+s2+".........");
			synchronized(s2)
			{
				System.out.println("Desktop"+": locked "+s2);
			}
		}
	}
	private static class Thread2 extends Thread
	{
		public void run()
		{
			synchronized(s2)
			{
				System.out.println("Laptop"+ ": locked"+s2);
				try
				{
					Thread.sleep(100);
				}
				
				catch(Exception e)
				{
					
				}
			}
			
			System.out.println("Laptop"+ ": Waiting for "+s1+".........");
			synchronized(s1)
			{
				System.out.println("Laptop"+": locked "+s1);
			}
		}
	}
}
