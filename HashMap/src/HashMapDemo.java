import java.util.HashMap;
public class HashMapDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="english hindi telugu hindi marati english punjabi hindi";
		HashMap<String,Integer> hm=new HashMap<String,Integer>();
		String st[]=s.split(" ");
		for(String n:st)
		{
			
			if(hm.get(n)!=null)
			{
			hm.put(n, hm.get(n)+1);
			}
			else
			{
				hm.put(n, 1);
			}
		}
		System.out.println(hm);
		
	}

}
