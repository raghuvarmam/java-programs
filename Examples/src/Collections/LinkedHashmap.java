package Collections;

import java.util.LinkedHashMap;

public class LinkedHashmap {

	public static void main(String[] args) {
		LinkedHashMap<Integer,String > lmap= new LinkedHashMap<>();
		lmap.put(5, "one");
		lmap.put(2, "two");
		lmap.put(3, "three");
		lmap.put(1, "four");
		lmap.put(4, "five");
		lmap.put(6, "six");
		System.out.println(lmap);
		System.out.println(lmap.size());
		System.out.println(lmap.remove(3));
		System.out.println(lmap.hashCode());
		System.out.println(lmap.entrySet());
		
		
	}

}
