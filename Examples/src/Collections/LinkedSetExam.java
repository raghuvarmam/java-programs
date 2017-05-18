package Collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedSetExam {

	public static void main(String[] args) {

		LinkedHashSet<Integer> ls= new LinkedHashSet<>();
		ls.add(6);
		ls.add(2);
		ls.add(5);
		ls.add(4);
		ls.add(5);
		System.out.println(ls);
		Iterator<Integer> i=ls.iterator();
		while(i.hasNext())
		System.out.println(i.next());
		ls.forEach(v->System.out.print(v));
		
		Collection<Integer> c= new LinkedHashSet<>();
		c.addAll(ls);
		c.retainAll(ls);
		System.out.println(c);
		
	}

}
