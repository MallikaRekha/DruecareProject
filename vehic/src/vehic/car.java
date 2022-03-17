package vehic;

public class car {
	String carModel;
	String carName;
	car(String CM,String CN)
	{
		this.carModel=CM;
		this.carName=CN;
	}
	void display()
	{
		System.out.println("CM:" +carModel+ " CN: " +carName);
	}

	public static void main(String[] args) {
		car c=new car("Zxi","Wagnor");
		c.display();

	}

}
