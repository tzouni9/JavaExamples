import java.util.ArrayList;
import java.util.List;


public class Arrays{
	public static void main(String[] args){
		
		int[] primeNumbers = {2, 3, 5, 7, 11, 13};
		
		System.out.println(primeNumbers.length);
		System.out.println(primeNumbers[0]);
		
		List list = new ArrayList();
		
		list.add(2);
		list.add(3);
		list.add(5);
		
		list.remove(1);
		
		System.out.println(list.get(1));
		System.out.println(list.toString());
		
	}
	
	public static void main(String[] args){
		
		List countries = new ArrayList(String);
		
		countries.add("Greece");
		countries.add("Australia");
		countries.add("Madagaskar");
		
		System.out.println(list.toString());
	}
	
	public static void main(String[] args){
		
		Map map = new HashMap();
		
		map.put("Greek capital", "Athens");
		map.put("USA capital", "Washington");
		map.put("Japan capital", "Tokio");
		
		System.out.println(map.get("Greek capital"));
		System.out.println(map.toString());
		System.out.println(map.size);
		
	}
}