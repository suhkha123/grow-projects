package collections.advanced.Tests;

import java.util.LinkedList;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import implement.collections.advanced.BookLL;

public class LinkedListTests {
	
	LinkedList<BookLL> booklist = new LinkedList<BookLL>();
	Logger log = Logger.getLogger(LinkedListTests.class);
	
	@Test
	void booklistTest() {
		booklist.addLast(new BookLL("Let us C","Yashwant Kanetkar","BPB",8,101));
		booklist.addFirst(new BookLL("Data Communications & Networking","Forouzan","Mc Graw Hill",4,102));
		booklist.add(1,new BookLL("Operating System","Galvin","Wiley",6,103));
	
		for (int i=0; i<booklist.size();i++)
			log.info("The book at position "+i+" is : "+booklist.get(i));
   }
	
  }
	
