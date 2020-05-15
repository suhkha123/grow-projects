package collections.advanced.Tests;

import java.util.PriorityQueue;
import java.util.Queue;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import implement.collections.advanced.BookPQ;

public class PriorityQueueTests{
	
	Queue<BookPQ> booklistpq = new PriorityQueue<BookPQ>();
	Logger log = Logger.getLogger(PriorityQueueTests.class);
	
	@Test
	void booklistTest() {
		booklistpq.add(new BookPQ("Let us C","Yashwant Kanetkar","BPB",8,101));
		booklistpq.add(new BookPQ("Data Communications & Networking","Forouzan","Mc Graw Hill",4,102));
		booklistpq.add(new BookPQ("Operating System","Galvin","Wiley",6,103));
		booklistpq.add(new BookPQ("Data Communications & Networking","Forouzan","Mc Graw Hill",4,102));

		log.info(booklistpq);
		
		for (BookPQ bk : booklistpq)
			log.info(bk.getBookName()+"-"+bk.getAuthor()+"-"+bk.getPublisher()+"-"+bk.getBookQty()+"-"+bk.getBookId());
		
		booklistpq.peek();
		//It is used to retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
		log.info("After peek=>"+booklistpq);
		booklistpq.poll();
		//It is used to retrieves and removes the head of this queue, or returns null if this queue is empty.
		log.info("After poll=>"+booklistpq);
		
		booklistpq.remove();
		//It is used to retrieves and removes the head of this queue.
		log.info("After remove=>"+booklistpq);

   }
	
  }
	
