package poly.overiding.libarrary;

public class Student {
	private String sName;
	private String sId;
	
	public Student() {
		super();
	}
	
	public Student(String sName, String sId) {
		super();
		this.sName = sName;
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getsId() {
		return sId;
	}
	public void setsId(String sId) {
		this.sId = sId;
	}
	
	@Override
	public String toString() {
		System.out.println("student name is "+sName+"student id is "+sId);
		return super.toString();
	}
	

}
