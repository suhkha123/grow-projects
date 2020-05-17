package java8.advanced.Tests;

import java.util.ArrayList;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import java.time.*;

import implement.java8.advanced.Employee;

public class DataAndTimeTests {

	
	Logger log = Logger.getLogger(DataAndTimeTests.class);

	ArrayList<Employee> al = new ArrayList<Employee>();

	LocalDate date = LocalDate.now();
	LocalTime time = LocalTime.now();
	LocalDateTime datetime = LocalDateTime.now();
	Period period = Period.between(LocalDate.of(1986, 02, 03), date);
	@Test
	void dateandTimeTest(){
		
		log.info("Current Date(yyyy-mm-dd) => "+date);
		log.info("Current  time  => "+time);
		log.info("Current Date(yyyy-mm-dd) and time  => "+datetime);
		log.info("Is this a leapyear => "+date.isLeapYear());
		log.info("My age today  => "+period.getYears() +" years, "+period.getMonths()+" month(s), and "+period.getDays()+" days.");

		
	}
}
