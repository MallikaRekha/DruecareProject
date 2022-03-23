import java.util.*;
public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a1=new ArrayList();
		System.out.println(a1.size());
		a1.add(new Integer(10));
		a1.add(new Double(34.667));
		a1.add(new Float(567.444f));
		System.out.println(a1);
		System.out.println(a1.toString());
		a1.add(new String("welcome"));
		a1.add(1,null);
		System.out.println(a1);
		a1.add(1,"true");
		System.out.println(a1);
		System.out.println(a1.remove(4));
		System.out.println(a1);
		System.out.println(a1.set(2, "Hai"));
		System.out.println(a1);

	}

}
