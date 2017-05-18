package Collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;

public class HashExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

HashMap<String , String> hmap= new HashMap<>();
		
		hmap.put("1","one" );
		hmap.put("2", "two");
		hmap.put("3", "three");
		hmap.put("4", "two");
		hmap.putIfAbsent("5", "value");
		System.out.println(hmap);
		System.out.println(hmap.get("4"));
		System.out.println(hmap.values());
		System.out.println(hmap.entrySet());
		System.out.println(hmap.keySet());
		System.out.println(hmap.containsKey("1"));
		Set<String> set=hmap.keySet();
		Iterator<String> v = set.iterator();
		while(v.hasNext())
		System.out.println(v.next());
		Collection<String> c= hmap.values();
		System.out.println(c);
		Set<Entry<String, String>> entry=hmap.entrySet();
		
		for(Entry<String, String> v1:entry){
			System.out.println(v1);
		}
	}

}
