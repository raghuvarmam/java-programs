package Collections;

import java.util.ArrayList;
import java.util.Vector;

public class VectorExam {

	public static void main(String[] args) {

		Vector v= new Vector<>(5, 2);
		System.out.println(v.size());
		System.out.println(v.capacity());
		v.add("one");
		v.add("two");
		v.add("three");
		v.add("four");
		v.add("five");
		v.add("six");
		v.add("seven");
		v.add("eight");
		System.out.println(v.indexOf("two", 0));
		v.remove(2);
		v.add(2, "removed");
		//System.out.println(v.set(5, "element"));
		System.out.println(v.capacity());
		System.out.println(v.lastElement());
		System.out.println(v.lastIndexOf("five", 6));
		System.out.println(v.elementAt(2));
		
		//v.copyInto(v);
		//v.notify();
		System.out.println(v);
	}

}
