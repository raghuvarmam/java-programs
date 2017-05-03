package poly.overiding.libarrary;

import java.util.Scanner;

public class TestCollege {
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		College c1= new College();
		Student[] stu= new Student[3];
		stu[0]=new Student("ram","5315");
		stu[1]=new Student("kesav","8884");
		stu[2]=new Student("rahul","6353");
		
		c1.setStudent(stu);
		System.out.println("enter the student id ");
		String sId = sc.next();
		System.out.println(c1.findStudentName(sId));
		
		System.out.println("enter the student id to get student details");
		String s = sc.next();
		System.out.println(c1.findStudent(s));
		sc.close();
		
	}

}
