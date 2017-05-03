package poly.overiding.libarrary;

public class College {
	private String collName;
	private String dept;
	private Student[] student;
	
	public String findStudentName(String sId){
		for (Student i:student){
			if(i.getsId().equals(sId))
				return i.getsName();
		}
			return "not found";
	}
	
	public Student findStudent(String sId){
		for (Student i:student){
			if(i.getsId().equals(sId))
				return i;
		}
		return null;
	}
	
	
	public College() {
		super();
	}

	public College(String collName, String dept) {
		super();
		this.collName = collName;
		this.dept = dept;
	}

	public String getCollName() {
		return collName;
	}
	public void setCollName(String collName) {
		this.collName = collName;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public Student[] getStudent() {
		return student;
	}
	public void setStudent(Student[] student) {
		this.student = student;
	}
	
	

}
