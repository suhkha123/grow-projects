package implement.corejava.advanced;


public class SwitchCase {

	
	public String findMonthName(int a) {
	
		switch(a) {
		case 1: return "January"; 
		case 2: return "February"; 
		case 3: return "March"; 
		case 4: return "April"; 
		case 5: return "May"; 
		case 6: return "June"; 
		case 7: return "July"; 
		case 8: return "August"; 
		case 9: return "September"; 
		case 10: return "October"; 
		case 11: return "November"; 
		case 12: return "December"; 
		//default: System.out.println("Please enter number between 1 to 12 to find the month name.");
		}
		return "Please enter number between 1 to 12 to find the month name.";
		
		
		
	}
	
}
