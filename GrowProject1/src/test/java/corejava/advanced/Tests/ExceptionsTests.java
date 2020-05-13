package corejava.advanced.Tests;

	import org.testng.annotations.Test;
	import implement.corejava.advanced.*;

	public class ExceptionsTests {
		
		ExceptionHandling exception = new ExceptionHandling();
		int age;

		@Test(priority=1)
		void enterAgeTest(){
			System.out.println("---This is enterAgeTest---");
			age = exception.enterAge();
			System.out.println("The Age entered is "+age);

			
		}
		
		@Test(priority=2)
		void validateTest(){
			System.out.println("---This is validateTest---");
			exception.validateAge(age);			
		}
		
		@Test(priority=3)
		void throwableTest(){
			System.out.println("---This is throwableTest---");
			exception.throwable();			
		}
}
