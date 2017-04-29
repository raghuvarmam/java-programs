package poly.overiding;

public class Book {
	private String bName;
	private String author;
	private int volume;
	private String status;
	
	
	public Book(String bName, String author, int volume, String status) {
		super();
		this.bName = bName;
		this.author = author;
		this.volume = volume;
		this.status = status;
	}
	public String getbName() {
		return bName;
	}
	public String getAuthor() {
		return author;
	}
	public int getVolume() {
		return volume;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	public void showDetails(){
		System.out.println("book name :" +bName);
		System.out.println("author name is :" +author);
		System.out.println("volume number :"+volume);
		System.out.println("book is :"+status);
	}

}
