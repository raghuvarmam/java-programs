package Collections;

import java.util.ArrayList;
import java.util.Collection;

public class ListExam {

	public static void main(String[] args) {

		ArrayList list= new ArrayList();
		list.add("raghu");
		list.add(1);
		list.add("rag");
		list.remove("raghu");
		list.add(0, "element");
		list.forEach(a->System.out.println(a));
		
		Collection c1= new ArrayList<>();
		c1.addAll(list);
		//c1.removeAll(list);
		
		c1.forEach(b->System.out.println(c1));
			
	}

}
