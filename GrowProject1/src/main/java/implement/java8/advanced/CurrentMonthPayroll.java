package implement.java8.advanced;

import java.time.LocalDate;

@FunctionalInterface
public interface CurrentMonthPayroll {
	
	static String payrollMonth() {	
		LocalDate currentDate = LocalDate.now();
		return currentDate.getMonthValue()+"-"+currentDate.getYear();	
	}
	
	public double payrollCalculation(int noofdays, double hourlyrate);
	
	
	public default boolean  payrollEligibility(String empType) {
		if(empType.equalsIgnoreCase("fulltime"))
			return true;
		return false;
	}

}
