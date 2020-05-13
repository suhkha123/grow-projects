package implement.corejava.advanced;

public class Keywords {
	
	static int a=0;
	final int weekDays=5;
	final int weekendDays;
	
	static void display() {
		a++;
		System.out.println("Display value of a: "+a);
	}
	
	static {
		System.out.println("We are inside static block----->");
		display();
		System.out.println("<--------static block ends here.");
	}
	
	//final variable can be changed and method can not be overridden
	public final void noOfDaysInWeek() {
		System.out.println("Week days are -> "+weekDays);
		System.out.println("Weekend days are -> "+weekendDays);

	}
	
	/*	Break Statement is a loop control statement which is used to terminate the loop.
	 * As soon as the break statement is encountered from within a loop, the loop iterations 
	 * stops there and control returns from the loop immediately to the first statement after the loop.
	 * Continue: is use to just past the body of the loop for specific iteration, to the loop’s end. 
	 * */
	public void breakandcontinue() {
		for (int i = 0; i < 10; i++) { 
            // terminate loop when i is 5. 
            if (i == 5) 
                break; 
             System.out.println("i: " + i); 
		  } 
        System.out.println("Break Loop complete."); 
		
        for (int i = 0; i < 10; i++) 
        { 
            // If the number is even 
            // skip and continue 
            if (i%2 == 0) 
                continue; 
  
            // If number is odd, print it 
            System.out.print(i + " "); 
        } 
        
        System.out.println("Continue Loop complete."); 

	}
	
	//constructor initializing final variable
	public Keywords(){
		weekendDays=1;
	}
	


}
