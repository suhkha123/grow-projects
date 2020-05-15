package collections.advanced.Tests;

import java.util.HashSet;
import java.util.LinkedList;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import implement.collections.advanced.BookLL;

public class HashSetTests {
	
	HashSet<BookLL> booklist = new HashSet<BookLL>();
	Logger log = Logger.getLogger(HashSetTests.class);
	
	@Test
	void booklistTest() {
		booklist.add(new BookLL("Let us C","Yashwant Kanetkar","BPB",8,101));
		booklist.add(new BookLL("Data Communications & Networking","Forouzan","Mc Graw Hill",4,102));
		booklist.add(new BookLL("Operating System","Galvin","Wiley",6,103));
		booklist.add(new BookLL("Data Communications & Networking","Forouzan","Mc Graw Hill",4,102));

		log.info(booklist);
		
		for (BookLL bk : booklist)
			log.info(bk.getBookName()+"-"+bk.getAuthor()+"-"+bk.getPublisher()+"-"+bk.getBookQty()+"-"+bk.getBookId());
   }
	
  }
	
