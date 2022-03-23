import java.util.*;
public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList a1=new LinkedList();
		a1.add("Rekha");
		a1.add(new Integer(30));
		a1.add("null");
		a1.addLast("Boddapati");
		System.out.println(a1);
		a1.set(0, "java");
		System.out.println(a1);
		a1.addFirst("Karthik");
		System.out.println(a1);
		System.out.println(a1.removeLast());
		a1.addFirst("Kashyap");
		System.out.println(a1);
		System.out.println("Deleted value is:"+a1.remove(1));
		System.out.println(a1);
		System.out.println("First Element in the list:"+a1.getFirst());
		System.out.println("Last Elemant in the list:"+a1.getLast());
		System.out.println(a1);		

	}

}
