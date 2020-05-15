package collections.advanced.Tests;

import java.util.ArrayDeque;
import java.util.Deque;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import implement.collections.advanced.BookPQ;

public class ArrayQueueTests{
	
	Deque<BookPQ> booklistdq = new ArrayDeque<BookPQ>();
	Logger log = Logger.getLogger(ArrayQueueTests.class);
	
	@Test
	void booklistTest() {
		booklistdq.add(new BookPQ("Let us C","Yashwant Kanetkar","BPB",8,101));
		booklistdq.offerFirst(new BookPQ("Data Communications & Networking","Forouzan","Mc Graw Hill",4,102));
		booklistdq.offer(new BookPQ("Operating System","Galvin","Wiley",6,103));
		booklistdq.offerLast(new BookPQ("Data Communications & Networking","Forouzan","Mc Graw Hill",4,102));

		log.info(booklistdq);
		
		for (BookPQ bk : booklistdq)
			log.info(bk.getBookName()+"-"+bk.getAuthor()+"-"+bk.getPublisher()+"-"+bk.getBookQty()+"-"+bk.getBookId());
		
		booklistdq.peek();
		//It is used to retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
		log.info("After peek=>"+booklistdq);
		booklistdq.pollFirst();
		//It is used to retrieves and removes the head of this queue, or returns null if this queue is empty.
		log.info("After pollFirst=>"+booklistdq);
		booklistdq.pollLast();
		//It is used to retrieves and removes the head of this queue, or returns null if this queue is empty.
		log.info("After pollLast=>"+booklistdq);
		booklistdq.remove();
		//It is used to retrieves and removes the head of this queue.
		log.info("After remove=>"+booklistdq);

   }
	
  }
	
