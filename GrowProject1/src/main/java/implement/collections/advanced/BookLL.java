package implement.collections.advanced;

/*Comparator interface provides a compare() method to compare two objects of the same class. 
 * Here it provides the flexibility as we can create n number of comparators for each property 
 * of an object which we want to compare.
*/
public class BookLL {
	

	public BookLL(String bookName, String author, String publisher, int bookQty, int bookId) {
		this.bookName = bookName;
		this.author = author;
		this.publisher = publisher;
		this.bookQty = bookQty;
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public String getAuthor() {
		return author;
	}

	public String getPublisher() {
		return publisher;
	}

	public int getBookQty() {
		return bookQty;
	}

	public int getBookId() {
		return bookId;
	}

	String bookName;
	String author;
	String publisher;
	int bookQty;
	int bookId;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getBookName()+"-"+getAuthor()+"-"+getPublisher()+"-"+getBookQty()+"-"+getBookId();
	}

	
}
