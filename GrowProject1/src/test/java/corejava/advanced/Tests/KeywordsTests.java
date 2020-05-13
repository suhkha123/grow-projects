package corejava.advanced.Tests;

import org.testng.annotations.Test;

import implement.corejava.advanced.Keywords;
import implement.corejava.advanced.PrintDemo;
import implement.corejava.advanced.SynchronizedDemo;

public class KeywordsTests {
	
	Keywords kw = new Keywords();
    PrintDemo PD = new PrintDemo();

	@Test(priority=1)
	void staticTest(){
		System.out.println("---This is staticTest---");
		System.out.println("No object is needed to call static variable, methods and blocks.");	
		}
	
	@Test(priority=2)
	void finalTest(){
		System.out.println("---This is finalTest---");
		kw.noOfDaysInWeek();
	}
	
	@Test(priority=3)
	void sysnchronizedTest(){
		System.out.println("---This is SysnchronizedTest---");
	      SynchronizedDemo T1 = new SynchronizedDemo( "Thread - 1 ", PD );
	      SynchronizedDemo T2 = new SynchronizedDemo( "Thread - 2 ", PD );

	      T1.start();
	      T2.start();

	      // wait for threads to end
	         try {
	         T1.join();
	         T2.join();
	      } catch ( Exception e) {
	         System.out.println("Interrupted");
	      }
	   }
	
	
	@Test(priority=4)
	void instanceofTest(){
		System.out.println("---This is instanceofTest---");
		System.out.println(kw instanceof Keywords);
		System.out.println(PD instanceof PrintDemo);

	}
	
	@Test(priority=5)
	void breakandcontinueTest(){
		System.out.println("---This is breakandcontinueTest---");
		kw.breakandcontinue();

	}
	
	

}
