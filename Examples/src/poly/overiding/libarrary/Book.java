package poly.overiding.libarrary;

public class Book {
	private String bName;
	private String author;
	
	public Book(String bName, String author) {
		super();
		this.bName = bName;
		this.author = author;
	}
	
	public Book() {
		super();
	}
	public void showbook(){
		System.out.println("book name is : "+bName);
		System.out.println("author name is : "+author);
	}
	public String getbName() {
		return bName;
	}
	public void setbName(String bName) {
		this.bName = bName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	

}
