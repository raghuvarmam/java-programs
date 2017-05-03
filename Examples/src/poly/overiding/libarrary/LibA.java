package poly.overiding.libarrary;

public class LibA {
	private String libName;
	private String subject;
	private String type;
	
	private Book[] books;
	
	public void  showlib(){
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

	public Book[] getBooks() {
		return books;
	}

	public void setBooks(Book[] books) {
		this.books = books;
	}
	

}
