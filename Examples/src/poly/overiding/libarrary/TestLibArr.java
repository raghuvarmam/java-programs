package poly.overiding.libarrary;

public class TestLibArr {

	public static void main(String[] args) {
		Book[] books = new Book[2];
		books[0]= new Book("harry","rowling");
		books[1]= new Book("sherlock","dayle");

		LibA l1= new LibA();
		l1.setLibName("sam raybun");
		l1.setSubject("science");
		l1.setType("magzine");
		l1.setBooks(books);
		l1.showlib();
		Book[] bd = l1.getBooks();
		for (int i=0;i<books.length;i++){
			bd[i].showbook();


		}

	}}
