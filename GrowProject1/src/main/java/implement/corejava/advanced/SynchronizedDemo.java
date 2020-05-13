package implement.corejava.advanced;

public class SynchronizedDemo extends Thread{
	   private Thread t;
	   private String threadName;
	   PrintDemo  PD;

	   public SynchronizedDemo( String name,  PrintDemo pd) {
	      threadName = name;
	      PD = pd;
	   }
	   
	   public void run() {
		   /*synchronized keyword is used with multiple threads are running and using the 
		    * same resource which is causing exception. Sychronized keyword will  make sure that only 
		    * one thread can access the resource at a given point in time
	      */
		   synchronized(PD) {
	         PD.printCount();
	      }
	      System.out.println("Thread " +  threadName + " exiting.");
	   }

	   public void start () {
	      System.out.println("Starting " +  threadName );
	      
	      if (t == null) {
	         t = new Thread (this, threadName);
	         t.start ();
	      }
	   }
}
