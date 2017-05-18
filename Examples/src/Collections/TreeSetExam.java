package Collections;

import java.util.TreeSet;

public class TreeSetExam {

	public static void main(String[] args) {
		TreeSet<Integer> ts= new TreeSet<>();
		ts.add(3);
		ts.add(1);
		ts.add(2);
		ts.add(7);
		ts.add(6);
		System.out.println(ts);
		System.out.println(ts.ceiling(0));
		System.out.println(ts.pollFirst());
		System.out.println(ts.headSet(4));
		System.out.println(ts.floor(8));
	}

}
