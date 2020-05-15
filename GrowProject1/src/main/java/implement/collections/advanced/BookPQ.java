package implement.collections.advanced;

/*Comparator interface provides a compare() method to compare two objects of the same class. 
 * Here it provides the flexibility as we can create n number of comparators for each property 
 * of an object which we want to compare.
*/
public class BookPQ implements Comparable<BookPQ>{
	

	public BookPQ(String bookName, String author, String publisher, int bookQty, int bookId) {
		this.bookName = bookName;
		this.author = author;
		this.publisher = publisher;
		this.bookQty = bookQty;
		this.bookId = bookId;
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


	public int compareTo(BookPQ b) {  
	    if(bookId>b.bookId){  
	        return 1;  
	    }else if(bookId<b.bookId){  
	        return -1;  
	    }else{  
	    return 0;  
	    }  
	} 
	
}
