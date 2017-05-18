package Collections;


import java.util.TreeMap;

public class TreeMapExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,String > tmap=new TreeMap<>();
		tmap.put(2, "one");
		tmap.put(1, "two");
		tmap.put(3, "three");
		tmap.put(5, "four");
		System.out.println(tmap);
		System.out.println(tmap.lastKey());
		System.out.println(tmap.containsValue("two"));
		System.out.println(tmap.lowerKey(3));
		System.out.println(tmap.floorKey(1));
		System.out.println(tmap.lowerEntry(3)); //only the before entry
		System.out.println(tmap.descendingKeySet()); 
		System.out.println(tmap.headMap(3));       //entry set before that key
		System.out.println(tmap.higherKey(3));
		
		TreeMap<Integer,String > t2map=new TreeMap<>();
		t2map.putAll(tmap);
		System.out.println(t2map);
	}

}
