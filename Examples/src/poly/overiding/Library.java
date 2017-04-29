package poly.overiding;

public class Library {
	private String libName;
	private String subject;
	private String type;
	
	private Book b1;
	
	public Library(String libName, String subject, String type) {
		super();
		this.libName = libName;
		this.subject = subject;
		this.type = type;
	}
	public void borrow(){
		System.out.println("book is borrowed");
	}
	public void showDetails(){
		System.out.println("library name is : "+libName);
		System.out.println("subject : "+subject);
		System.out.println("book type : "+type);
	}

	public String getLibName() {
		return libName;
	}

	public void setLibName(String libName) {
		this.libName = libName;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Book getB1() {
		return b1;
	}

	public void setB1(Book b1) {
		this.b1 = b1;
	}
	

}
